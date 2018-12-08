package br.com.TADS1N.Telas;

import br.com.TADS1N.Beans.Cliente;
import br.com.TADS1N.Dao.ClienteDao;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class telaCliente extends javax.swing.JInternalFrame {

    private static telaCliente instancia = null;
    Cliente cliente = new Cliente();
    ClienteDao dao = new ClienteDao();
    String ativo;
    int flag = 0;

    public telaCliente() {
        initComponents();
        ativo = "NAVEGAR";
        habilitarFormulario();
        DefaultTableModel modelo = (DefaultTableModel) table_cliente.getModel();
        table_cliente.setRowSorter(new TableRowSorter(modelo));
        Listar();

    }

    // criando metodo para  listar todos  os dados do cliente na tabela
    public void Listar() {
        DefaultTableModel modelo = (DefaultTableModel) table_cliente.getModel();
        ClienteDao dao = new ClienteDao();
        modelo.setNumRows(0); // elimina os dados duplicados na tabela 
        for (Cliente cli : dao.listartodos()) {
            modelo.addRow(new Object[]{
                cli.getCodigo(),
                cli.getCpf(),
                cli.getNome(),
                cli.getTelefone(),
                cli.getCidade(),
                cli.getEmail()

            });
        }
    }

    public void PesquisarCpf(String cpf) {
        DefaultTableModel modelo = (DefaultTableModel) table_cliente.getModel();
        ClienteDao dao = new ClienteDao();
        modelo.setNumRows(0); // elimina os dados duplicados na tabela 

        for (Cliente cli : dao.Pesquisar(cpf)) {
            modelo.addRow(new Object[]{
                cli.getCodigo(),
                cli.getCpf(),
                cli.getNome(),
                cli.getTelefone(),
                cli.getCidade(),
                cli.getEmail()

            });
        }
    }

    public void habilitarFormulario() {
        switch (ativo) {
            case "NAVEGAR":

                TXT_cidade.setEnabled(false);
                TXT_cpf.setEnabled(false);
                TXT_email.setEnabled(false);
                TXT_nome.setEnabled(false);
                TXT_telefone.setEnabled(false);
                BTN_incluirCliente.setEnabled(true);
                BTN_excluirCliente.setEnabled(false);
                BTN_salvarCliente.setEnabled(false);

                break;

            case "NOVO":

                TXT_cidade.setEnabled(true);
                TXT_cpf.setEnabled(true);
                TXT_email.setEnabled(true);
                TXT_nome.setEnabled(true);
                TXT_telefone.setEnabled(true);
                BTN_incluirCliente.setEnabled(false);
                BTN_excluirCliente.setEnabled(false);
                BTN_salvarCliente.setEnabled(true);

                break;

            case "MOUSE CLIKED":
                TXT_cidade.setEnabled(true);
                TXT_cpf.setEnabled(true);
                TXT_email.setEnabled(true);
                TXT_nome.setEnabled(true);
                TXT_telefone.setEnabled(true);
                BTN_incluirCliente.setEnabled(false);
                BTN_excluirCliente.setEnabled(true);
                BTN_salvarCliente.setEnabled(true);
                break;

        }

    }

    private boolean validarFormulario() {
        if (TXT_cpf.getText().trim().length() != 11) {
            JOptionPane.showMessageDialog(this, "CPF inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_cpf.requestFocus();
            return false;
        }
        if (TXT_nome.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, " NOME inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_nome.requestFocus();
            return false;
        }
        if (TXT_email.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "EMAIL   inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_email.requestFocus();
            return false;
        }
        if (TXT_cidade.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, " CIDADE  inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_cidade.requestFocus();
            return false;
        }
        if (TXT_telefone.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "TELEFONE inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_telefone.requestFocus();
            return false;
        }

        return true;
    }

    public void limparFormulario() {

        TXT_cidade.setText("");
        TXT_cpf.setText("");
        TXT_email.setText("");
        TXT_nome.setText("");
        TXT_telefone.setText("");

    }

    public static telaCliente getInstancia() {
        if (instancia == null) {
            instancia = new telaCliente();
        }

        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TXT_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_telefone = new javax.swing.JTextField();
        TXT_cidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXT_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BTN_incluirCliente = new javax.swing.JButton();
        BTN_salvarCliente = new javax.swing.JButton();
        BTN_pesquisarCliente = new javax.swing.JButton();
        BTN_excluirCliente = new javax.swing.JButton();
        TXT_cpfPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_cliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Tela de Ciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Nome:");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        TXT_nome.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        getContentPane().add(TXT_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 430, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("CPF:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        TXT_cpf.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        getContentPane().add(TXT_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Telefone:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        TXT_telefone.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        getContentPane().add(TXT_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 302, -1));

        TXT_cidade.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        getContentPane().add(TXT_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 131, 300, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Cidade:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 93, -1, -1));

        TXT_email.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        getContentPane().add(TXT_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 620, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel5.setText("E-mail:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, -1, -1));

        BTN_incluirCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_incluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TADS1N/Telas/Incluir_Icon.png"))); // NOI18N
        BTN_incluirCliente.setText("Incluir");
        BTN_incluirCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_incluirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BTN_incluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_incluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_incluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 141, 58));

        BTN_salvarCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_salvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TADS1N/Telas/Alterar_Icon.png"))); // NOI18N
        BTN_salvarCliente.setText("Salvar");
        BTN_salvarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_salvarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BTN_salvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_salvarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_salvarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        BTN_pesquisarCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_pesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TADS1N/Telas/Pesquisar_Icon.png"))); // NOI18N
        BTN_pesquisarCliente.setText("Pesquisar");
        BTN_pesquisarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_pesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BTN_pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_pesquisarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_pesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 160, 30));

        BTN_excluirCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_excluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TADS1N/Telas/Excluir_Icon.png"))); // NOI18N
        BTN_excluirCliente.setText("Excluir");
        BTN_excluirCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_excluirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BTN_excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_excluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_excluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        TXT_cpfPesquisa.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        TXT_cpfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_cpfPesquisaActionPerformed(evt);
            }
        });
        TXT_cpfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_cpfPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_cpfPesquisaKeyTyped(evt);
            }
        });
        getContentPane().add(TXT_cpfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 400, 32));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setText("CPF:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        table_cliente.setBackground(new java.awt.Color(204, 204, 204));
        table_cliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        table_cliente.setForeground(new java.awt.Color(51, 51, 255));
        table_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CPF", "NOME", "TELEFONE", "CIDADE", "E-MAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_clienteMouseClicked(evt);
            }
        });
        table_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_clienteKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_cliente);
        if (table_cliente.getColumnModel().getColumnCount() > 0) {
            table_cliente.getColumnModel().getColumn(0).setResizable(false);
            table_cliente.getColumnModel().getColumn(1).setResizable(false);
            table_cliente.getColumnModel().getColumn(2).setResizable(false);
            table_cliente.getColumnModel().getColumn(3).setResizable(false);
            table_cliente.getColumnModel().getColumn(4).setResizable(false);
            table_cliente.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 620, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_salvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_salvarClienteActionPerformed

        if (validarFormulario()) {
            if (flag == 1) {
                cliente.setCpf(TXT_cpf.getText());
                cliente.setNome(TXT_nome.getText().trim());
                cliente.setTelefone(TXT_telefone.getText().trim());
                cliente.setCidade(TXT_cidade.getText().trim());
                cliente.setEmail(TXT_email.getText().trim());

                dao.cadastrar(cliente);
                JOptionPane.showMessageDialog(null, "salvo com sucesso");
                ativo = "NAVEGAR";
                habilitarFormulario();
                limparFormulario();
                Listar();

            } else {
                if (flag == 2) {
                    cliente.setCodigo((int) table_cliente.getValueAt(table_cliente.getSelectedRow(), 0));
                    cliente.setCpf(TXT_cpf.getText());
                    cliente.setNome(TXT_nome.getText().trim());
                    cliente.setTelefone(TXT_telefone.getText().trim());
                    cliente.setCidade(TXT_cidade.getText().trim());
                    cliente.setEmail(TXT_email.getText().trim());

                    dao.alterar(cliente);
                    Listar();
                    ativo = "NAVEGAR";
                    limparFormulario();
                    habilitarFormulario();
                }
            }
        }

    }//GEN-LAST:event_BTN_salvarClienteActionPerformed

    private void BTN_incluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_incluirClienteActionPerformed
        flag = 1;
        ativo = "NOVO";
        habilitarFormulario();

    }//GEN-LAST:event_BTN_incluirClienteActionPerformed

    private void table_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_clienteMouseClicked
        flag = 2;
        if (table_cliente.getSelectedRow() != -1) {

            TXT_cpf.setText(table_cliente.getValueAt(table_cliente.getSelectedRow(), 1).toString());
            TXT_nome.setText(table_cliente.getValueAt(table_cliente.getSelectedRow(), 2).toString());
            TXT_telefone.setText(table_cliente.getValueAt(table_cliente.getSelectedRow(), 3).toString());
            TXT_cidade.setText(table_cliente.getValueAt(table_cliente.getSelectedRow(), 4).toString());
            TXT_email.setText(table_cliente.getValueAt(table_cliente.getSelectedRow(), 5).toString());

            ativo = "MOUSE CLIKED";
            habilitarFormulario();
        }        //   clicando no  cliente para  levar os  dados  para  os campos ,  para  fazer alteracao

    }//GEN-LAST:event_table_clienteMouseClicked

    private void table_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_clienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_table_clienteKeyReleased

    private void BTN_pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_pesquisarClienteActionPerformed
        PesquisarCpf((TXT_cpfPesquisa.getText()));

    }//GEN-LAST:event_BTN_pesquisarClienteActionPerformed

    private void BTN_excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_excluirClienteActionPerformed
        if (table_cliente.getSelectedRow() != -1) {
            int confirma = JOptionPane.showConfirmDialog(rootPane, "DESEJA EXCLUIR DADOS  DOS CLIENTE SIM - NÃO ", "EXCLUIR", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {

                Cliente cliente = new Cliente();
                ClienteDao clienteD = new ClienteDao();

                cliente.setCodigo((int) table_cliente.getValueAt(table_cliente.getSelectedRow(), 0));

                clienteD.deletar(cliente);
                limparFormulario();
                ativo = "NAVEGAR";
                habilitarFormulario();
                Listar();
            }

        }

    }//GEN-LAST:event_BTN_excluirClienteActionPerformed

    private void TXT_cpfPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_cpfPesquisaKeyTyped
        int numero = 12;
        if (TXT_cpfPesquisa.getText().length() >= numero) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Informe a Quantidade Certa de Numero do Cpf");
        }
    }//GEN-LAST:event_TXT_cpfPesquisaKeyTyped

    private void TXT_cpfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_cpfPesquisaKeyReleased
    }//GEN-LAST:event_TXT_cpfPesquisaKeyReleased

    private void TXT_cpfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_cpfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_cpfPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_excluirCliente;
    private javax.swing.JButton BTN_incluirCliente;
    private javax.swing.JButton BTN_pesquisarCliente;
    private javax.swing.JButton BTN_salvarCliente;
    private javax.swing.JTextField TXT_cidade;
    private javax.swing.JTextField TXT_cpf;
    private javax.swing.JTextField TXT_cpfPesquisa;
    private javax.swing.JTextField TXT_email;
    private javax.swing.JTextField TXT_nome;
    private javax.swing.JTextField TXT_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_cliente;
    // End of variables declaration//GEN-END:variables
}
