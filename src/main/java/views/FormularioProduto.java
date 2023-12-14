package views;

import controller.ProdutoController;
import factory.ControllerFactory;
import javax.swing.DefaultComboBoxModel;

import models.Formato;
import models.Produto;

public class FormularioProduto extends javax.swing.JInternalFrame {

  private Produto produto;
  private final ProdutoController produtoController;

  public FormularioProduto(ControllerFactory controllerFactory, Produto produto) {
    this.produtoController = controllerFactory.createProdutoController();
    this.produto = produto;
    initComponents();
  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbFormProd = new javax.swing.JLabel();
    lbCodigo = new javax.swing.JLabel();
    tfCodigo = new javax.swing.JTextField();
    lbDescricao = new javax.swing.JLabel();
    tfDescricao = new javax.swing.JTextField();
    lbFormato = new javax.swing.JLabel();
    DefaultComboBoxModel<Formato> model = new DefaultComboBoxModel<>(Formato.values());
    cbFormato = new javax.swing.JComboBox<>();
    btnCadastra = new javax.swing.JButton();
    btnCancela = new javax.swing.JButton();

    setTitle("Formulário de produto");

    lbFormProd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lbFormProd.setText("Formulário de produto");

    lbCodigo.setText("Código ");

    tfCodigo.setText(produto!=null? produto.getCodigo() : "");
    tfCodigo.setMinimumSize(null);
    tfCodigo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tfCodigoActionPerformed(evt);
      }
    });

    lbDescricao.setText("Descrição");

    tfDescricao.setText(produto!=null? produto.getDescricao(): "");
    tfDescricao.setMinimumSize(null);
    tfDescricao.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tfDescricaoActionPerformed(evt);
      }
    });

    lbFormato.setText("Formato");

    cbFormato.setModel(model);
    cbFormato.setMinimumSize(null);
    cbFormato.setPreferredSize(null);
    cbFormato.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbFormatoActionPerformed(evt);
      }
    });

    btnCadastra.setBackground(new java.awt.Color(0, 102, 204));
    btnCadastra.setForeground(new java.awt.Color(255, 255, 255));
    btnCadastra.setText("Cadastrar");

    btnCancela.setBackground(new java.awt.Color(204, 0, 0));
    btnCancela.setForeground(new java.awt.Color(255, 255, 255));
    btnCancela.setText("Cancelar");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(73, 73, 73)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
            .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lbFormato)
          .addComponent(lbDescricao)
          .addComponent(tfDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lbFormProd)
          .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lbCodigo)
          .addComponent(cbFormato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(111, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(49, 49, 49)
        .addComponent(lbFormProd)
        .addGap(28, 28, 28)
        .addComponent(lbCodigo)
        .addGap(18, 18, 18)
        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(32, 32, 32)
        .addComponent(lbDescricao)
        .addGap(29, 29, 29)
        .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(38, 38, 38)
        .addComponent(lbFormato)
        .addGap(18, 18, 18)
        .addComponent(cbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCadastra)
          .addComponent(btnCancela))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

	private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
    // TODO add your handling code here:
	}//GEN-LAST:event_tfCodigoActionPerformed

	private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
    // TODO add your handling code here:
	}//GEN-LAST:event_tfDescricaoActionPerformed

	private void cbFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormatoActionPerformed

	}//GEN-LAST:event_cbFormatoActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCadastra;
  private javax.swing.JButton btnCancela;
  private javax.swing.JComboBox<Formato> cbFormato;
  private javax.swing.JLabel lbCodigo;
  private javax.swing.JLabel lbDescricao;
  private javax.swing.JLabel lbFormProd;
  private javax.swing.JLabel lbFormato;
  private javax.swing.JTextField tfCodigo;
  private javax.swing.JTextField tfDescricao;
  // End of variables declaration//GEN-END:variables
}
