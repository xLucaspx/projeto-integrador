package views;

import controller.ProdutoController;
import factory.ControllerFactory;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Produto;
import views.constants.Colors;
import views.constants.Fonts;

public class ListaProduto extends javax.swing.JInternalFrame {
  private final ProdutoController produtoController;
  private ControllerFactory contrFactory;
  private DefaultTableModel model;
  
  public ListaProduto(ControllerFactory controllerFactory) {
    this.produtoController = controllerFactory.createProdutoController();
    this.contrFactory = controllerFactory;
    initComponents();
  }

  private void preencheTabela(List<Produto> produtos) {
    model.getDataVector().clear();
    produtos.forEach(p -> model.addRow(new Object[]{p.getCodigo(), p.getDescricao(), p.getPrecoCusto(), p.getPrecoVenda(), p.getFormato(), p.getEstoque()}));
  }
  
  private Produto getProdutoSelecionado() {
    var linhaSelecionada = tabelaProdutos.getSelectedRow();
    if (linhaSelecionada == -1 || linhaSelecionada >= model.getRowCount()) {
      throw new RuntimeException("Um produto deve ser selecionado!");
    }
    var codigo = (String) model.getValueAt(linhaSelecionada, 0);
    return produtoController.buscaPorCodigo(codigo);
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbListaProdutos = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    var produtos = produtoController.listaTodos();
    String[] columnNames = {
      "Código",
      "Descrição",
      "Preço custo",
      "Preço venda",
      "Formato",
      "Estoque"
    };
    model = new DefaultTableModel(columnNames, 0) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    tabelaProdutos = new javax.swing.JTable();
    btnExcluir = new javax.swing.JButton();
    btnSelecionar = new javax.swing.JButton();
    btnEditar = new javax.swing.JButton();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Lista de produtos");
    setVisible(true);
    addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
      public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
        formInternalFrameActivated(evt);
      }
      public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
      }
    });

    lbListaProdutos.setText("Lista de produtos");

    tabelaProdutos.setBackground(Colors.WHITE);
    tabelaProdutos.setFont(Fonts.SMALL_FONT);
    tabelaProdutos.setForeground(Colors.FONT_COLOR);
    tabelaProdutos.setModel(model);
    tabelaProdutos.setGridColor(Colors.FONT_COLOR);
    tabelaProdutos.setIntercellSpacing(new java.awt.Dimension(5, 5));
    tabelaProdutos.setSelectionBackground(Colors.DARK_GREEN);
    tabelaProdutos.setSelectionForeground(Colors.WHITE);
    tabelaProdutos.setShowHorizontalLines(true);
    jScrollPane1.setViewportView(tabelaProdutos);
    preencheTabela(produtos);

    btnExcluir.setText("Excluir");
    btnExcluir.setMinimumSize(new java.awt.Dimension(80, 30));
    btnExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcluirActionPerformed(evt);
      }
    });

    btnSelecionar.setText("Selecionar");
    btnSelecionar.setMaximumSize(new java.awt.Dimension(88, 30));
    btnSelecionar.setMinimumSize(null);
    btnSelecionar.setPreferredSize(null);

    btnEditar.setText("Editar");
    btnEditar.setMinimumSize(new java.awt.Dimension(80, 30));
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbListaProdutos)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGap(50, 50, 50))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(36, Short.MAX_VALUE)
        .addComponent(lbListaProdutos)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32)
            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    try {
      var produto = getProdutoSelecionado();
      var form = new FormularioProduto(contrFactory, produto);
      getDesktopPane().add(form);
      form.moveToFront();
      form.requestFocus();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar abrir tela de edição:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnEditarActionPerformed

  private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    try {
      var produto = getProdutoSelecionado();
      String[] opcoes = {"Sim", "Não"};
      
      int res = JOptionPane.showOptionDialog(this, String.format("Tem certeza que deseja excluir o produto %s?\nNão é possível desfazer esta ação",
        produto.getDescricao()),
        getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
      if (res != 0) {
        return;
      }
      produtoController.exclui(produto);
      preencheTabela(produtoController.listaTodos());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar excluir produto", e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE));
    }
  }//GEN-LAST:event_btnExcluirActionPerformed

  private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    preencheTabela(produtoController.listaTodos());
  }//GEN-LAST:event_formInternalFrameActivated


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnExcluir;
  private javax.swing.JButton btnSelecionar;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbListaProdutos;
  private javax.swing.JTable tabelaProdutos;
  // End of variables declaration//GEN-END:variables
}
