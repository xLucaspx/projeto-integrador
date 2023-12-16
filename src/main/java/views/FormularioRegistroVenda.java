package views;

public class FormularioRegistroVenda extends javax.swing.JInternalFrame {

	public FormularioRegistroVenda() {
		initComponents();
	}

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    lbRegistroVenda = new javax.swing.JLabel();
    lbCodProd = new javax.swing.JLabel();
    lbQuantidade = new javax.swing.JLabel();
    inputCodProd = new javax.swing.JTextField();
    inputQuant = new javax.swing.JTextField();
    btAddProd = new javax.swing.JButton();
    lbTotal = new javax.swing.JLabel();
    lbProd1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    btAdicionar1 = new javax.swing.JButton();
    btRemoverProd = new javax.swing.JButton();
    btRegNotaCompra = new javax.swing.JButton();
    btCancela = new javax.swing.JButton();

    jLabel1.setText("jLabel1");

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Registro de venda");
    setVisible(true);

    lbRegistroVenda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lbRegistroVenda.setText("Registro de venda");

    lbCodProd.setText("Codigo do produto");

    lbQuantidade.setText("Quantidade");

    btAddProd.setBackground(new java.awt.Color(0, 153, 0));
    btAddProd.setText("Adicionar produto");

    lbTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lbTotal.setText("Total R$");

    lbProd1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lbProd1.setText("Produtos");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(jTable1);

    btAdicionar1.setBackground(new java.awt.Color(0, 0, 255));
    btAdicionar1.setText("Adicionar");

    btRemoverProd.setBackground(new java.awt.Color(153, 0, 0));
    btRemoverProd.setText("Remover produto");
    btRemoverProd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btRemoverProdActionPerformed(evt);
      }
    });

    btRegNotaCompra.setBackground(new java.awt.Color(0, 0, 204));
    btRegNotaCompra.setText("Registra nota de compra");

    btCancela.setBackground(new java.awt.Color(153, 0, 0));
    btCancela.setText("Cancela");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(49, 49, 49)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(lbProd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotal)
                .addGap(278, 278, 278))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lbCodProd)
                  .addComponent(inputCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(105, 105, 105)
                    .addComponent(btAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(lbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGroup(layout.createSequentialGroup()
                .addComponent(lbRegistroVenda)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btRemoverProd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(btRegNotaCompra)
              .addComponent(btAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(34, 34, 34))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addComponent(lbRegistroVenda)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbCodProd)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lbQuantidade)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(inputCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(inputQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btAdicionar1))))
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lbTotal)
          .addComponent(lbProd1))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btAddProd)
            .addGap(31, 31, 31)
            .addComponent(btRemoverProd)
            .addGap(41, 41, 41)
            .addComponent(btRegNotaCompra)
            .addGap(36, 36, 36)
            .addComponent(btCancela)))
        .addContainerGap(20, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

	private void btRemoverProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverProdActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_btRemoverProdActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btAddProd;
  private javax.swing.JButton btAdicionar1;
  private javax.swing.JButton btCancela;
  private javax.swing.JButton btRegNotaCompra;
  private javax.swing.JButton btRemoverProd;
  private javax.swing.JTextField inputCodProd;
  private javax.swing.JTextField inputQuant;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JLabel lbCodProd;
  private javax.swing.JLabel lbProd1;
  private javax.swing.JLabel lbQuantidade;
  private javax.swing.JLabel lbRegistroVenda;
  private javax.swing.JLabel lbTotal;
  // End of variables declaration//GEN-END:variables
}
