/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author dougl
 */
public class telaCliente extends javax.swing.JInternalFrame {

    private static telaCliente instancia = null;

    /**
     * Creates new form telaCliente
     */
    public telaCliente() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_tabelaCliente = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cliente");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Nome:");
        jLabel1.setToolTipText("");

        TXT_nome.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("CPF:");
        jLabel2.setToolTipText("");

        TXT_cpf.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Telefone:");
        jLabel3.setToolTipText("");

        TXT_telefone.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        TXT_cidade.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Cidade:");
        jLabel4.setToolTipText("");

        TXT_email.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel5.setText("E-mail:");
        jLabel5.setToolTipText("");

        BTN_incluirCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_incluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Incluir_Icon.png"))); // NOI18N
        BTN_incluirCliente.setText("Incluir");
        BTN_incluirCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_incluirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        BTN_salvarCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_salvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Alterar_Icon.png"))); // NOI18N
        BTN_salvarCliente.setText("Salvar");
        BTN_salvarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_salvarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        BTN_pesquisarCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_pesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Pesquisar_Icon.png"))); // NOI18N
        BTN_pesquisarCliente.setText("Pesquisar");
        BTN_pesquisarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_pesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        BTN_excluirCliente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BTN_excluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Excluir_Icon.png"))); // NOI18N
        BTN_excluirCliente.setText("Excluir");
        BTN_excluirCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_excluirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TXT_cpfPesquisa.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setText("CPF:");
        jLabel6.setToolTipText("");

        TBL_tabelaCliente.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        TBL_tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TBL_tabelaCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_cpfPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_pesquisarCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_excluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_salvarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_incluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(TXT_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(TXT_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TXT_email)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(TXT_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_incluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_salvarCliente)
                    .addComponent(BTN_excluirCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_pesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_cpfPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_excluirCliente;
    private javax.swing.JButton BTN_incluirCliente;
    private javax.swing.JButton BTN_pesquisarCliente;
    private javax.swing.JButton BTN_salvarCliente;
    private javax.swing.JTable TBL_tabelaCliente;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
