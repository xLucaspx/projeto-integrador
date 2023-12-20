package views;

import factory.ControllerFactory;
import javax.swing.JInternalFrame;
import views.compras.FormularioRegistroCompra;
import views.constants.Colors;
import views.constants.Fonts;
import views.fornecedor.FormularioFornecedor;
import views.fornecedor.ListaFornecedor;
import views.produtos.FormularioProduto;
import views.produtos.ListaProduto;

public class TelaPrincipal extends javax.swing.JFrame {
  
  private final ControllerFactory controllerFactory;
  
  public TelaPrincipal(ControllerFactory controllerFactory) {
    this.controllerFactory = controllerFactory;
    initComponents();
  }
  
  private void showInternalFrame(JInternalFrame frame) {
    desktopPane.add(frame);
    frame.moveToFront();
    frame.requestFocus();
  }
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    sidebarPanel = new javax.swing.JPanel();
    panelMenuVendas = new javax.swing.JPanel();
    labelVendas = new javax.swing.JLabel();
    btnRegistraVenda = new javax.swing.JButton();
    btnListaVendas = new javax.swing.JButton();
    panelMenuCompras = new javax.swing.JPanel();
    labelCompras = new javax.swing.JLabel();
    btnRegistraCompra = new javax.swing.JButton();
    btnListaCompras = new javax.swing.JButton();
    panelMenuProdutos = new javax.swing.JPanel();
    labelProdutos = new javax.swing.JLabel();
    btnCadastraProduto = new javax.swing.JButton();
    btnListaProdutos = new javax.swing.JButton();
    panelMenuFornecedores = new javax.swing.JPanel();
    labelFornecedores = new javax.swing.JLabel();
    btnCadastraFornecedor = new javax.swing.JButton();
    btnListaFornecedores = new javax.swing.JButton();
    desktopPane = new javax.swing.JDesktopPane();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Sistema de controle de Estoque");
    setBackground(Colors.BACKGROUND_COLOR);
    setMinimumSize(null);
    setPreferredSize(null);

    sidebarPanel.setBackground(Colors.LIGHT_BLUE);

    panelMenuVendas.setBackground(Colors.BLUE);

    labelVendas.setFont(Fonts.LARGE_FONT);
    labelVendas.setForeground(Colors.WHITE);
    labelVendas.setLabelFor(panelMenuVendas);
    labelVendas.setText("Vendas");
    labelVendas.setMinimumSize(null);
    labelVendas.setPreferredSize(null);

    btnRegistraVenda.setBackground(Colors.DARK_BLUE);
    btnRegistraVenda.setFont(Fonts.MEDIUM_FONT);
    btnRegistraVenda.setForeground(Colors.WHITE);
    btnRegistraVenda.setText("Registrar venda");
    btnRegistraVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnRegistraVenda.setMaximumSize(null);
    btnRegistraVenda.setMinimumSize(null);
    btnRegistraVenda.setPreferredSize(null);
    btnRegistraVenda.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegistraVendaActionPerformed(evt);
      }
    });

    btnListaVendas.setBackground(Colors.DARK_BLUE);
    btnListaVendas.setFont(Fonts.MEDIUM_FONT);
    btnListaVendas.setForeground(Colors.WHITE);
    btnListaVendas.setText("Listar notas de venda");
    btnListaVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnListaVendas.setMinimumSize(null);
    btnListaVendas.setPreferredSize(null);

    javax.swing.GroupLayout panelMenuVendasLayout = new javax.swing.GroupLayout(panelMenuVendas);
    panelMenuVendas.setLayout(panelMenuVendasLayout);
    panelMenuVendasLayout.setHorizontalGroup(
      panelMenuVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(btnRegistraVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(btnListaVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
      .addGroup(panelMenuVendasLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelMenuVendasLayout.setVerticalGroup(
      panelMenuVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelMenuVendasLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnRegistraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelMenuCompras.setBackground(Colors.BLUE);
    panelMenuCompras.setForeground(new java.awt.Color(0, 51, 153));

    labelCompras.setFont(Fonts.LARGE_FONT);
    labelCompras.setForeground(Colors.WHITE);
    labelCompras.setLabelFor(panelMenuCompras);
    labelCompras.setText("Compras");
    labelCompras.setMinimumSize(null);
    labelCompras.setPreferredSize(null);

    btnRegistraCompra.setBackground(Colors.DARK_BLUE);
    btnRegistraCompra.setFont(Fonts.MEDIUM_FONT);
    btnRegistraCompra.setForeground(Colors.WHITE);
    btnRegistraCompra.setText("Registrar compra");
    btnRegistraCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnRegistraCompra.setMaximumSize(null);
    btnRegistraCompra.setMinimumSize(null);
    btnRegistraCompra.setPreferredSize(null);
    btnRegistraCompra.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegistraCompraActionPerformed(evt);
      }
    });

    btnListaCompras.setBackground(Colors.DARK_BLUE);
    btnListaCompras.setFont(Fonts.MEDIUM_FONT);
    btnListaCompras.setForeground(Colors.WHITE);
    btnListaCompras.setText("Listar notas de compra");
    btnListaCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnListaCompras.setMaximumSize(null);
    btnListaCompras.setMinimumSize(null);
    btnListaCompras.setPreferredSize(null);

    javax.swing.GroupLayout panelMenuComprasLayout = new javax.swing.GroupLayout(panelMenuCompras);
    panelMenuCompras.setLayout(panelMenuComprasLayout);
    panelMenuComprasLayout.setHorizontalGroup(
      panelMenuComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(btnRegistraCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(btnListaCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
      .addGroup(panelMenuComprasLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelMenuComprasLayout.setVerticalGroup(
      panelMenuComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelMenuComprasLayout.createSequentialGroup()
        .addComponent(labelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnRegistraCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelMenuProdutos.setBackground(Colors.BLUE);

    labelProdutos.setFont(Fonts.LARGE_FONT);
    labelProdutos.setForeground(Colors.WHITE);
    labelProdutos.setLabelFor(panelMenuProdutos);
    labelProdutos.setText("Produtos");
    labelProdutos.setMinimumSize(null);
    labelProdutos.setPreferredSize(null);

    btnCadastraProduto.setBackground(Colors.DARK_BLUE);
    btnCadastraProduto.setFont(Fonts.MEDIUM_FONT);
    btnCadastraProduto.setForeground(Colors.WHITE);
    btnCadastraProduto.setText("Cadastrar produto");
    btnCadastraProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnCadastraProduto.setMaximumSize(null);
    btnCadastraProduto.setMinimumSize(null);
    btnCadastraProduto.setPreferredSize(null);
    btnCadastraProduto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCadastraProdutoActionPerformed(evt);
      }
    });

    btnListaProdutos.setBackground(Colors.DARK_BLUE);
    btnListaProdutos.setFont(Fonts.MEDIUM_FONT);
    btnListaProdutos.setForeground(Colors.WHITE);
    btnListaProdutos.setText("Listar produtos");
    btnListaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnListaProdutos.setMaximumSize(null);
    btnListaProdutos.setMinimumSize(null);
    btnListaProdutos.setPreferredSize(null);
    btnListaProdutos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnListaProdutosActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelMenuProdutosLayout = new javax.swing.GroupLayout(panelMenuProdutos);
    panelMenuProdutos.setLayout(panelMenuProdutosLayout);
    panelMenuProdutosLayout.setHorizontalGroup(
      panelMenuProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(btnCadastraProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
      .addComponent(btnListaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(panelMenuProdutosLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelMenuProdutosLayout.setVerticalGroup(
      panelMenuProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelMenuProdutosLayout.createSequentialGroup()
        .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnCadastraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelMenuFornecedores.setBackground(Colors.BLUE);

    labelFornecedores.setFont(Fonts.LARGE_FONT);
    labelFornecedores.setForeground(Colors.WHITE);
    labelFornecedores.setLabelFor(panelMenuFornecedores);
    labelFornecedores.setText("Fornecedores");
    labelFornecedores.setMinimumSize(null);
    labelFornecedores.setPreferredSize(null);

    btnCadastraFornecedor.setBackground(Colors.DARK_BLUE);
    btnCadastraFornecedor.setFont(Fonts.MEDIUM_FONT);
    btnCadastraFornecedor.setForeground(Colors.WHITE);
    btnCadastraFornecedor.setText("Cadastrar fornecedor");
    btnCadastraFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnCadastraFornecedor.setMaximumSize(null);
    btnCadastraFornecedor.setMinimumSize(null);
    btnCadastraFornecedor.setPreferredSize(null);
    btnCadastraFornecedor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCadastraFornecedorActionPerformed(evt);
      }
    });

    btnListaFornecedores.setBackground(Colors.DARK_BLUE);
    btnListaFornecedores.setFont(Fonts.MEDIUM_FONT);
    btnListaFornecedores.setForeground(Colors.WHITE);
    btnListaFornecedores.setText("Listar Fornecedores");
    btnListaFornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnListaFornecedores.setMaximumSize(null);
    btnListaFornecedores.setMinimumSize(null);
    btnListaFornecedores.setPreferredSize(null);
    btnListaFornecedores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnListaFornecedoresActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelMenuFornecedoresLayout = new javax.swing.GroupLayout(panelMenuFornecedores);
    panelMenuFornecedores.setLayout(panelMenuFornecedoresLayout);
    panelMenuFornecedoresLayout.setHorizontalGroup(
      panelMenuFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(btnCadastraFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
      .addComponent(btnListaFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(panelMenuFornecedoresLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelMenuFornecedoresLayout.setVerticalGroup(
      panelMenuFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelMenuFornecedoresLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnCadastraFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnListaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
    sidebarPanel.setLayout(sidebarPanelLayout);
    sidebarPanelLayout.setHorizontalGroup(
      sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelMenuCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(panelMenuProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(panelMenuFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(panelMenuVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    sidebarPanelLayout.setVerticalGroup(
      sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(sidebarPanelLayout.createSequentialGroup()
        .addComponent(panelMenuVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(panelMenuCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(panelMenuProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(panelMenuFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    desktopPane.setBackground(Colors.BACKGROUND_COLOR);
    desktopPane.setMinimumSize(null);
    desktopPane.setPreferredSize(null);

    javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
    desktopPane.setLayout(desktopPaneLayout);
    desktopPaneLayout.setHorizontalGroup(
      desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 826, Short.MAX_VALUE)
    );
    desktopPaneLayout.setVerticalGroup(
      desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 525, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnRegistraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraVendaActionPerformed
    //showInternalFrame(new FormularioRegistroVenda(controllerFactory));
  }//GEN-LAST:event_btnRegistraVendaActionPerformed

    private void btnCadastraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraProdutoActionPerformed
      showInternalFrame(new FormularioProduto(controllerFactory));
    }//GEN-LAST:event_btnCadastraProdutoActionPerformed

  private void btnListaFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaFornecedoresActionPerformed
    showInternalFrame(new ListaFornecedor(controllerFactory));
  }//GEN-LAST:event_btnListaFornecedoresActionPerformed

  private void btnListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProdutosActionPerformed
    showInternalFrame(new ListaProduto(controllerFactory));
  }//GEN-LAST:event_btnListaProdutosActionPerformed

  private void btnRegistraCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraCompraActionPerformed
    showInternalFrame(new FormularioRegistroCompra(controllerFactory));
  }//GEN-LAST:event_btnRegistraCompraActionPerformed

  private void btnCadastraFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraFornecedorActionPerformed
    showInternalFrame(new FormularioFornecedor(controllerFactory));
  }//GEN-LAST:event_btnCadastraFornecedorActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCadastraFornecedor;
  private javax.swing.JButton btnCadastraProduto;
  private javax.swing.JButton btnListaCompras;
  private javax.swing.JButton btnListaFornecedores;
  private javax.swing.JButton btnListaProdutos;
  private javax.swing.JButton btnListaVendas;
  private javax.swing.JButton btnRegistraCompra;
  private javax.swing.JButton btnRegistraVenda;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JLabel labelCompras;
  private javax.swing.JLabel labelFornecedores;
  private javax.swing.JLabel labelProdutos;
  private javax.swing.JLabel labelVendas;
  private javax.swing.JPanel panelMenuCompras;
  private javax.swing.JPanel panelMenuFornecedores;
  private javax.swing.JPanel panelMenuProdutos;
  private javax.swing.JPanel panelMenuVendas;
  private javax.swing.JPanel sidebarPanel;
  // End of variables declaration//GEN-END:variables
}
