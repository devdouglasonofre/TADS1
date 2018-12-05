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
public class telaPagamento extends javax.swing.JInternalFrame {

    private static telaPagamento instancia = null;

    /**
     * Creates new form telaPagamento
     */
    public telaPagamento() {
        initComponents();
    }

    public static telaPagamento getInstancia() {
        if (instancia == null) {
            instancia = new telaPagamento();
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
        TXT_cpfCliente = new javax.swing.JTextField();
        TXT_creciCorretor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_nomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_nomeCorretor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXT_codigoImovel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXT_valorImovel = new javax.swing.JTextField();
        TXT_enderecoImovel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BTN_confirmarPagamento = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pagamento");

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel1.setText("CPF do Cliente:");

        TXT_cpfCliente.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        TXT_creciCorretor.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel2.setText("CRECI do Corretor:");
        jLabel2.setToolTipText("");

        TXT_nomeCliente.setEditable(false);
        TXT_nomeCliente.setBackground(new java.awt.Color(204, 204, 204));
        TXT_nomeCliente.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel3.setText("Nome do Cliente:");

        TXT_nomeCorretor.setEditable(false);
        TXT_nomeCorretor.setBackground(new java.awt.Color(204, 204, 204));
        TXT_nomeCorretor.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel4.setText("Nome do Corretor");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel5.setText("Código do Imóvel:");

        TXT_codigoImovel.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel6.setText("Valor do Imóvel:");

        TXT_valorImovel.setEditable(false);
        TXT_valorImovel.setBackground(new java.awt.Color(204, 204, 204));
        TXT_valorImovel.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        TXT_enderecoImovel.setEditable(false);
        TXT_enderecoImovel.setBackground(new java.awt.Color(204, 204, 204));
        TXT_enderecoImovel.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel7.setText("Endereço do Imóvel");

        BTN_confirmarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/confirmar_Icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TXT_codigoImovel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TXT_valorImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_enderecoImovel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXT_nomeCliente)
                                            .addComponent(TXT_nomeCorretor)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(TXT_cpfCliente))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(TXT_creciCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(262, 262, 262)))
                                .addComponent(BTN_confirmarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_creciCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_nomeCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_confirmarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_codigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_valorImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_enderecoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_confirmarPagamento;
    private javax.swing.JTextField TXT_codigoImovel;
    private javax.swing.JTextField TXT_cpfCliente;
    private javax.swing.JTextField TXT_creciCorretor;
    private javax.swing.JTextField TXT_enderecoImovel;
    private javax.swing.JTextField TXT_nomeCliente;
    private javax.swing.JTextField TXT_nomeCorretor;
    private javax.swing.JTextField TXT_valorImovel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
