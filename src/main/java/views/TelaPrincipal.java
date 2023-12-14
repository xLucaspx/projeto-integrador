package views;

import factory.ControllerFactory;
import views.constants.Colors;
import views.constants.Fonts;

public class TelaPrincipal extends javax.swing.JFrame {

	public TelaPrincipal() {
		initComponents();
		FormularioFornecedor f = new FormularioFornecedor(new ControllerFactory());
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
    setTitle("Sistema de controle de Estoque");
    setBackground(new java.awt.Color(153, 204, 255));

    jPanelPrincipal.setBackground(Colors.LIGHT_BLUE);

    jPanelVendas.setBackground(Colors.BLUE);

    labelVendas.setFont(Fonts.LARGE_FONT);
    labelVendas.setForeground(Colors.WHITE);
    labelVendas.setText("Vendas");

    btnRegistroVenda.setBackground(Colors.DARK_BLUE);
    btnRegistroVenda.setFont(Fonts.MEDIUM_FONT);
    btnRegistroVenda.setForeground(Colors.WHITE);
    btnRegistroVenda.setText("Registrar venda");
    btnRegistroVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnRegistroVenda.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegistroVendaActionPerformed(evt);
      }
    });

    btnListaNFCompra.setBackground(Colors.DARK_BLUE);
    btnListaNFCompra.setFont(Fonts.MEDIUM_FONT);
    btnListaNFCompra.setForeground(Colors.WHITE);
    btnListaNFCompra.setText("Listar notas de compra");
    btnListaNFCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
    jPanelVendas.setLayout(jPanelVendasLayout);
    jPanelVendasLayout.setHorizontalGroup(
      jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(btnRegistroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(jPanelVendasLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(16, Short.MAX_VALUE))
      .addComponent(btnListaNFCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanelVendasLayout.setVerticalGroup(
      jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelVendasLayout.createSequentialGroup()
        .addComponent(labelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnRegistroVenda)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaNFCompra)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanelCompras.setBackground(Colors.BLUE);
    jPanelCompras.setForeground(new java.awt.Color(0, 51, 153));

    btnRegitraCompra.setBackground(Colors.DARK_BLUE);
    btnRegitraCompra.setFont(Fonts.MEDIUM_FONT);
    btnRegitraCompra.setForeground(Colors.WHITE);
    btnRegitraCompra.setText("Registrar compra");
    btnRegitraCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    btnListaNfCompra.setBackground(Colors.DARK_BLUE);
    btnListaNfCompra.setFont(Fonts.MEDIUM_FONT);
    btnListaNfCompra.setForeground(Colors.WHITE);
    btnListaNfCompra.setText("Listar notas de compra");
    btnListaNfCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    labelCompras1.setFont(Fonts.LARGE_FONT);
    labelCompras1.setForeground(Colors.WHITE);
    labelCompras1.setText("Compras");

    javax.swing.GroupLayout jPanelComprasLayout = new javax.swing.GroupLayout(jPanelCompras);
    jPanelCompras.setLayout(jPanelComprasLayout);
    jPanelComprasLayout.setHorizontalGroup(
      jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(btnRegitraCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(btnListaNfCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComprasLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelCompras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanelComprasLayout.setVerticalGroup(
      jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelComprasLayout.createSequentialGroup()
        .addComponent(labelCompras1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnRegitraCompra)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaNfCompra)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanelProdutos.setBackground(Colors.BLUE);

    labelProdutos.setFont(Fonts.LARGE_FONT);
    labelProdutos.setForeground(Colors.WHITE);
    labelProdutos.setText("Produtos");

    btnCadastraProduto.setBackground(Colors.DARK_BLUE);
    btnCadastraProduto.setFont(Fonts.MEDIUM_FONT);
    btnCadastraProduto.setForeground(Colors.WHITE);
    btnCadastraProduto.setText("Cadastrar produto");
    btnCadastraProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    btnListaProdutos.setBackground(Colors.DARK_BLUE);
    btnListaProdutos.setFont(Fonts.MEDIUM_FONT);
    btnListaProdutos.setForeground(Colors.WHITE);
    btnListaProdutos.setText("Listar prodtos");
    btnListaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
    jPanelProdutos.setLayout(jPanelProdutosLayout);
    jPanelProdutosLayout.setHorizontalGroup(
      jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelProdutosLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addComponent(btnCadastraProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(btnListaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanelProdutosLayout.setVerticalGroup(
      jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelProdutosLayout.createSequentialGroup()
        .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCadastraProduto)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaProdutos)
        .addGap(0, 6, Short.MAX_VALUE))
    );

    jPanelFornecedores.setBackground(Colors.BLUE);

    labelProdutos1.setFont(Fonts.LARGE_FONT);
    labelProdutos1.setForeground(Colors.WHITE);
    labelProdutos1.setText("Fornecedores");

    btnCadastraFornecedor.setBackground(Colors.DARK_BLUE);
    btnCadastraFornecedor.setFont(Fonts.MEDIUM_FONT);
    btnCadastraFornecedor.setForeground(Colors.WHITE);
    btnCadastraFornecedor.setText("Cadastrar fornecedor");
    btnCadastraFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    btnListaFornecedor.setBackground(Colors.DARK_BLUE);
    btnListaFornecedor.setFont(Fonts.MEDIUM_FONT);
    btnListaFornecedor.setForeground(Colors.WHITE);
    btnListaFornecedor.setText("Listar Fornecedores");
    btnListaFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout jPanelFornecedoresLayout = new javax.swing.GroupLayout(jPanelFornecedores);
    jPanelFornecedores.setLayout(jPanelFornecedoresLayout);
    jPanelFornecedoresLayout.setHorizontalGroup(
      jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelFornecedoresLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelProdutos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addComponent(btnCadastraFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(btnListaFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanelFornecedoresLayout.setVerticalGroup(
      jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelFornecedoresLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCadastraFornecedor)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaFornecedor)
        .addContainerGap(16, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
    jPanelPrincipal.setLayout(jPanelPrincipalLayout);
    jPanelPrincipalLayout.setHorizontalGroup(
      jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanelCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanelPrincipalLayout.setVerticalGroup(
      jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelPrincipalLayout.createSequentialGroup()
        .addComponent(jPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 14, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
    jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 481, Short.MAX_VALUE)
    );
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jDesktopPane1)
        .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnRegistroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroVendaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnRegistroVendaActionPerformed

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
