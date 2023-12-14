package views;

import controller.FornecedorController;
import javax.swing.table.DefaultTableModel;
import models.Fornecedor;

public class ListarFornecedor extends javax.swing.JInternalFrame {
  
  private Fornecedor fornecedor;

	public ListarFornecedor() {
		initComponents();
	}

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    String[] colunas = {"cnpj","nome", "email", "telefone", "endereço"};
    DefaultTableModel model = new DefaultTableModel(colunas, 0){
      @Override
      public boolean isCellEditable(int row, int column){
        return false;
      }
    };
    tabelaListaFornecedores = new javax.swing.JTable();
    btnExclui = new javax.swing.JButton();
    btnEdita = new javax.swing.JButton();
    btnSeleciona = new javax.swing.JButton();

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel1.setText("Lista de Fornecedores");

    tabelaListaFornecedores.setAutoCreateColumnsFromModel(false);
    tabelaListaFornecedores.setModel(model);
    jScrollPane1.setViewportView(tabelaListaFornecedores);

    btnExclui.setText("excluir");

    btnEdita.setText("editar");
    btnEdita.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditaActionPerformed(evt);
      }
    });

    btnSeleciona.setText("detalhes");
    btnSeleciona.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDetalhesActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)))
        .addContainerGap(34, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnExclui)
          .addComponent(btnEdita)
          .addComponent(btnSeleciona))
        .addGap(16, 16, 16))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
    

  }//GEN-LAST:event_btnDetalhesActionPerformed

  private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
    
  }//GEN-LAST:event_btnEditaActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEdita;
  private javax.swing.JButton btnExclui;
  private javax.swing.JButton btnSeleciona;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tabelaListaFornecedores;
  // End of variables declaration//GEN-END:variables
}
