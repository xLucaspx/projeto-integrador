package views;

public class TelaPrincipal extends javax.swing.JFrame {

	public TelaPrincipal() {
		initComponents();
		FormularioProduto f = new FormularioProduto();
		f.setVisible(true);
		jDesktopPane1.add(f);
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanelPrincipal = new javax.swing.JPanel();
		jPanelVendas = new javax.swing.JPanel();
		labelVendas = new javax.swing.JLabel();
		btnRegistroVenda = new javax.swing.JButton();
		btnListaNFCompra = new javax.swing.JButton();
		jPanelCompras = new javax.swing.JPanel();
		btnRegitraCompra = new javax.swing.JButton();
		btnListaNfCompra = new javax.swing.JButton();
		labelCompras1 = new javax.swing.JLabel();
		jPanelProdutos = new javax.swing.JPanel();
		labelProdutos = new javax.swing.JLabel();
		btnCadastraProduto = new javax.swing.JButton();
		btnListaProdutos = new javax.swing.JButton();
		jPanelFornecedores = new javax.swing.JPanel();
		labelProdutos1 = new javax.swing.JLabel();
		btnCadastraFornecedor = new javax.swing.JButton();
		btnListaFornecedor = new javax.swing.JButton();
		jDesktopPane1 = new javax.swing.JDesktopPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(153, 204, 255));

		jPanelPrincipal.setBackground(new java.awt.Color(51, 153, 255));

		jPanelVendas.setBackground(new java.awt.Color(0, 51, 153));

		labelVendas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelVendas.setForeground(new java.awt.Color(255, 255, 255));
		labelVendas.setText("Vendas");

		btnRegistroVenda.setForeground(new java.awt.Color(255, 255, 255));
		btnRegistroVenda.setText("Registrar venda");

		btnListaNFCompra.setText("Listar notas de compra");

		javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
		jPanelVendas.setLayout(jPanelVendasLayout);
		jPanelVendasLayout
				.setHorizontalGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(btnRegistroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(jPanelVendasLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(labelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 151,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(16, Short.MAX_VALUE))
						.addComponent(btnListaNFCompra, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanelVendasLayout
				.setVerticalGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelVendasLayout.createSequentialGroup()
								.addComponent(labelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnRegistroVenda)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnListaNFCompra)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanelCompras.setBackground(new java.awt.Color(0, 51, 153));
		jPanelCompras.setForeground(new java.awt.Color(0, 51, 153));

		btnRegitraCompra.setText("Registrar compra");

		btnListaNfCompra.setText("Listar notas de compra");

		labelCompras1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelCompras1.setForeground(new java.awt.Color(255, 255, 255));
		labelCompras1.setText("Compras");

		javax.swing.GroupLayout jPanelComprasLayout = new javax.swing.GroupLayout(jPanelCompras);
		jPanelCompras.setLayout(jPanelComprasLayout);
		jPanelComprasLayout
				.setHorizontalGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(btnRegitraCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(btnListaNfCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanelComprasLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(labelCompras1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));
		jPanelComprasLayout
				.setVerticalGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelComprasLayout.createSequentialGroup()
								.addComponent(labelCompras1, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnRegitraCompra)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnListaNfCompra)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanelProdutos.setBackground(new java.awt.Color(0, 51, 153));

		labelProdutos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelProdutos.setForeground(new java.awt.Color(255, 255, 255));
		labelProdutos.setText("Produtos");

		btnCadastraProduto.setText("Cadastrar produto");

		btnListaProdutos.setText("Listar prodtos");

		javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
		jPanelProdutos.setLayout(jPanelProdutosLayout);
		jPanelProdutosLayout
				.setHorizontalGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelProdutosLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(labelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addContainerGap())
						.addComponent(btnCadastraProduto, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnListaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE));
		jPanelProdutosLayout
				.setVerticalGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelProdutosLayout.createSequentialGroup()
								.addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnCadastraProduto)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnListaProdutos)
								.addGap(0, 6, Short.MAX_VALUE)));

		jPanelFornecedores.setBackground(new java.awt.Color(0, 51, 153));

		labelProdutos1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelProdutos1.setForeground(new java.awt.Color(255, 255, 255));
		labelProdutos1.setText("Fornecedores");

		btnCadastraFornecedor.setText("Cadastrar fornecedor");

		btnListaFornecedor.setText("Listar Fornecedores");

		javax.swing.GroupLayout jPanelFornecedoresLayout = new javax.swing.GroupLayout(jPanelFornecedores);
		jPanelFornecedores.setLayout(jPanelFornecedoresLayout);
		jPanelFornecedoresLayout
				.setHorizontalGroup(jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelFornecedoresLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(labelProdutos1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnCadastraFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnListaFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanelFornecedoresLayout
				.setVerticalGroup(jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelFornecedoresLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(labelProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnCadastraFornecedor)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnListaFornecedor)
								.addContainerGap(16, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
		jPanelPrincipal.setLayout(jPanelPrincipalLayout);
		jPanelPrincipalLayout
				.setHorizontalGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanelVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanelCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanelPrincipalLayout
				.setVerticalGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelPrincipalLayout.createSequentialGroup()
								.addComponent(jPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanelCompras, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 14, Short.MAX_VALUE)));

		jDesktopPane1.setPreferredSize(null);

		javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
		jDesktopPane1.setLayout(jDesktopPane1Layout);
		jDesktopPane1Layout
				.setHorizontalGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 481, Short.MAX_VALUE));
		jDesktopPane1Layout
				.setVerticalGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0)
						.addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGap(0, 0, 0)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(0, 0, 0)
								.addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGap(0, 0, 0)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCadastraFornecedor;
	private javax.swing.JButton btnCadastraProduto;
	private javax.swing.JButton btnListaFornecedor;
	private javax.swing.JButton btnListaNFCompra;
	private javax.swing.JButton btnListaNfCompra;
	private javax.swing.JButton btnListaProdutos;
	private javax.swing.JButton btnRegistroVenda;
	private javax.swing.JButton btnRegitraCompra;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JPanel jPanelCompras;
	private javax.swing.JPanel jPanelFornecedores;
	private javax.swing.JPanel jPanelPrincipal;
	private javax.swing.JPanel jPanelProdutos;
	private javax.swing.JPanel jPanelVendas;
	private javax.swing.JLabel labelCompras1;
	private javax.swing.JLabel labelProdutos;
	private javax.swing.JLabel labelProdutos1;
	private javax.swing.JLabel labelVendas;
	// End of variables declaration//GEN-END:variables
}
