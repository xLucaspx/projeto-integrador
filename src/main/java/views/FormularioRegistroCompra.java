package views;

import models.Fornecedor;

public class FormularioRegistroCompra extends javax.swing.JInternalFrame {

	public FormularioRegistroCompra() {
		initComponents();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		lbRegistroCompra = new javax.swing.JLabel();
		lbNumNota = new javax.swing.JLabel();
		lbDataCompra = new javax.swing.JLabel();
		lbFornecedor = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		tfNumNota = new javax.swing.JTextField();
		tfDataCompra = new javax.swing.JFormattedTextField();
		btBuscarProd = new javax.swing.JButton();
		btRemoverProd = new javax.swing.JButton();
		btRegistraVenda = new javax.swing.JButton();
		btCancela = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		lbRegistroCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		lbRegistroCompra.setText("Registro de compra");

		lbNumNota.setText("Numero da nota");

		lbDataCompra.setText("Data da compra");

		lbFornecedor.setText("Fornecedor");

		tfDataCompra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tfDataCompraActionPerformed(evt);
			}
		});

		btBuscarProd.setBackground(new java.awt.Color(0, 204, 0));
		btBuscarProd.setText("Buscar produto");

		btRemoverProd.setBackground(new java.awt.Color(102, 0, 0));
		btRemoverProd.setText("Remover produto");
		btRemoverProd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btRemoverProdActionPerformed(evt);
			}
		});

		btRegistraVenda.setBackground(new java.awt.Color(0, 0, 255));
		btRegistraVenda.setText("Registrar venda");
		btRegistraVenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btRegistraVendaActionPerformed(evt);
			}
		});

		btCancela.setBackground(new java.awt.Color(204, 0, 0));
		btCancela.setText("Cancelar");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
				new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGap(23, 23, 23)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(lbRegistroCompra)
																.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(lbNumNota)
																.addComponent(tfNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup().addComponent(lbDataCompra).addGap(138, 138, 138))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup()
																				.addComponent(tfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(101, 101, 101)))))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(lbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(btRemoverProd, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btRegistraVenda, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btCancela, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(61, 61, 61)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(31, 31, 31)
						.addComponent(lbRegistroCompra)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbNumNota)
								.addComponent(lbDataCompra)
								.addComponent(lbFornecedor))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addGap(35, 35, 35)
										.addComponent(btBuscarProd)
										.addGap(33, 33, 33)
										.addComponent(btRemoverProd)
										.addGap(39, 39, 39)
										.addComponent(btRegistraVenda)
										.addGap(34, 34, 34)
										.addComponent(btCancela))
								.addGroup(layout.createSequentialGroup()
										.addGap(18, 18, 18)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
						.addContainerGap(39, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void tfDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataCompraActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_tfDataCompraActionPerformed

	private void btRemoverProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverProdActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_btRemoverProdActionPerformed

	private void btRegistraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistraVendaActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_btRegistraVendaActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btBuscarProd;
	private javax.swing.JButton btCancela;
	private javax.swing.JButton btRegistraVenda;
	private javax.swing.JButton btRemoverProd;
	private javax.swing.JComboBox<Fornecedor> jComboBox1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JLabel lbDataCompra;
	private javax.swing.JLabel lbFornecedor;
	private javax.swing.JLabel lbNumNota;
	private javax.swing.JLabel lbRegistroCompra;
	private javax.swing.JFormattedTextField tfDataCompra;
	private javax.swing.JTextField tfNumNota;
	// End of variables declaration//GEN-END:variables
}
