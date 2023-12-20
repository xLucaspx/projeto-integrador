package views.produtos;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.ProdutoController;
import models.produto.Produto;
import factory.ControllerFactory;
import views.constants.Colors;
import views.constants.Fonts;

public class ListaProduto extends javax.swing.JInternalFrame {
  private final ProdutoController produtoController;
  private final ControllerFactory controllerFactory;
  private DefaultTableModel model;

  public ListaProduto(ControllerFactory controllerFactory) {
    this.produtoController = controllerFactory.createProdutoController();
    this.controllerFactory = controllerFactory;
    initComponents();
  }

  private void preencheTabela(List<Produto> produtos) {
    model.getDataVector().clear();

    if (produtos.isEmpty()) {
      tabelaProdutos.repaint();
      return;
    }

    produtos.forEach(p -> model.addRow(new Object[]{p.getCodigo(), p.getDescricao(), "R$ %.2f".formatted(p.getPrecoCusto()), "R$ %.2f".formatted(p.getPrecoVenda()), p.getFormato(), p.getEstoque()}));
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

    labelListaProdutos = new javax.swing.JLabel();
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
    btnEditar = new javax.swing.JButton();
    btnAlterarVenda = new javax.swing.JButton();
    btnAlterarCusto = new javax.swing.JButton();
    btnAlterarEstoque = new javax.swing.JButton();
    btnExcluir = new javax.swing.JButton();

    setBackground(Colors.BACKGROUND_COLOR);
    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Lista de produtos");
    setMinimumSize(null);
    setNormalBounds(null);
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

    labelListaProdutos.setFont(Fonts.TITLE_FONT);
    labelListaProdutos.setForeground(Colors.FONT_COLOR);
    labelListaProdutos.setLabelFor(this);
    labelListaProdutos.setText("Lista de produtos");
    labelListaProdutos.setMaximumSize(null);
    labelListaProdutos.setMinimumSize(null);
    labelListaProdutos.setPreferredSize(null);

    jScrollPane1.setBackground(Colors.BACKGROUND_COLOR);
    jScrollPane1.setMinimumSize(null);

    tabelaProdutos.setBackground(Colors.WHITE);
    tabelaProdutos.setFont(Fonts.SMALL_FONT);
    tabelaProdutos.setForeground(Colors.FONT_COLOR);
    tabelaProdutos.setModel(model);
    tabelaProdutos.setGridColor(Colors.FONT_COLOR);
    tabelaProdutos.setIntercellSpacing(new java.awt.Dimension(5, 5));
    tabelaProdutos.setRowHeight(25);
    tabelaProdutos.setSelectionBackground(Colors.DARK_GREEN);
    tabelaProdutos.setSelectionForeground(Colors.WHITE);
    tabelaProdutos.setShowHorizontalLines(true);
    tabelaProdutos.getTableHeader().setReorderingAllowed(false);
    var colunaCodigo = tabelaProdutos.getColumnModel().getColumn(0);
    var colunaDescricao = tabelaProdutos.getColumnModel().getColumn(1);
    var colunaCusto = tabelaProdutos.getColumnModel().getColumn(2);
    var colunaVenda = tabelaProdutos.getColumnModel().getColumn(3);
    var colunaFormato = tabelaProdutos.getColumnModel().getColumn(4);
    var colunaEstoque = tabelaProdutos.getColumnModel().getColumn(5);

    colunaCodigo.setPreferredWidth(60);
    colunaDescricao.setPreferredWidth(195);
    colunaCusto.setPreferredWidth(80);
    colunaVenda.setPreferredWidth(80);
    colunaFormato.setPreferredWidth(65);
    colunaEstoque.setPreferredWidth(65);
    jScrollPane1.setViewportView(tabelaProdutos);
    preencheTabela(produtos);

    btnEditar.setBackground(Colors.BLUE);
    btnEditar.setFont(Fonts.MEDIUM_FONT);
    btnEditar.setForeground(Colors.WHITE);
    btnEditar.setText("Editar");
    btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnEditar.setMaximumSize(null);
    btnEditar.setMinimumSize(null);
    btnEditar.setPreferredSize(null);
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
      }
    });

    btnAlterarVenda.setBackground(Colors.GREEN);
    btnAlterarVenda.setFont(Fonts.MEDIUM_FONT);
    btnAlterarVenda.setForeground(Colors.WHITE);
    btnAlterarVenda.setText("Alterar venda");
    btnAlterarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAlterarVenda.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAlterarVendaActionPerformed(evt);
      }
    });

    btnAlterarCusto.setBackground(Colors.DARK_BLUE);
    btnAlterarCusto.setFont(Fonts.MEDIUM_FONT);
    btnAlterarCusto.setForeground(Colors.WHITE);
    btnAlterarCusto.setText("Alterar custo");
    btnAlterarCusto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAlterarCusto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAlterarCustoActionPerformed(evt);
      }
    });

    btnAlterarEstoque.setBackground(Colors.DARK_GREEN);
    btnAlterarEstoque.setFont(Fonts.MEDIUM_FONT);
    btnAlterarEstoque.setForeground(Colors.WHITE);
    btnAlterarEstoque.setText("Alterar estoque");
    btnAlterarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAlterarEstoque.setMaximumSize(null);
    btnAlterarEstoque.setMinimumSize(null);
    btnAlterarEstoque.setPreferredSize(null);
    btnAlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAlterarEstoqueActionPerformed(evt);
      }
    });

    btnExcluir.setBackground(Colors.RED);
    btnExcluir.setFont(Fonts.MEDIUM_FONT);
    btnExcluir.setForeground(Colors.WHITE);
    btnExcluir.setText("Excluir");
    btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnExcluir.setMaximumSize(null);
    btnExcluir.setMinimumSize(null);
    btnExcluir.setPreferredSize(null);
    btnExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcluirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(45, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(labelListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnAlterarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnAlterarCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnAlterarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(45, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(labelListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnAlterarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnAlterarCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnAlterarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    try {
      var produto = getProdutoSelecionado();
      var form = new FormularioProduto(controllerFactory, produto);
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

  private void btnAlterarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendaActionPerformed
    try {
      var produto = getProdutoSelecionado();

      var novoValor = JOptionPane.showInputDialog(this, String.format("Produto: %s\nPreço de venda atual R$ %.2f\nInsira o novo preço de venda (somente números e ponto):", produto.getDescricao(), produto.getPrecoVenda()), getTitle(), JOptionPane.PLAIN_MESSAGE);

      if (novoValor == null) return;

      produtoController.atualizaPrecoVenda(Float.parseFloat(novoValor), produto.getCodigo());
      preencheTabela(produtoController.listaTodos());
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(this, "O valor inserido é inválido...\nInsira somente números separados por ponto!", getTitle(), JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar abrir tela de edição:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnAlterarVendaActionPerformed

  private void btnAlterarCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCustoActionPerformed
    try {
      var produto = getProdutoSelecionado();

      var novoValor = JOptionPane.showInputDialog(this, String.format("Produto: %s\nPreço de custo atual R$ %.2f\nInsira o novo preço de custo (somente números e ponto):", produto.getDescricao(), produto.getPrecoCusto()), getTitle(), JOptionPane.PLAIN_MESSAGE);

      if (novoValor == null) return;

      produtoController.atualizaPrecoCusto(Float.parseFloat(novoValor), produto.getCodigo());
      preencheTabela(produtoController.listaTodos());
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(this, "O valor inserido é inválido...\nInsira somente números separados por ponto!", getTitle(), JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar abrir tela de edição:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnAlterarCustoActionPerformed

  private void btnAlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEstoqueActionPerformed
    try {
      var produto = getProdutoSelecionado();

      var novoValor = JOptionPane.showInputDialog(this, String.format("Produto: %s\nEstoque atual: %.3f %s\nInsira o novo valor (somente números e ponto):", produto.getDescricao(), produto.getEstoque(), produto.getFormato().getSigla()), getTitle(), JOptionPane.PLAIN_MESSAGE);

      if (novoValor == null) return;

      produtoController.atualizaEstoque(Double.parseDouble(novoValor), produto.getCodigo());
      preencheTabela(produtoController.listaTodos());
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(this, "O valor inserido é inválido...\nInsira somente números separados por ponto!", getTitle(), JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar abrir tela de edição:\n%s", e.getMessage()), getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnAlterarEstoqueActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAlterarCusto;
  private javax.swing.JButton btnAlterarEstoque;
  private javax.swing.JButton btnAlterarVenda;
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnExcluir;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel labelListaProdutos;
  private javax.swing.JTable tabelaProdutos;
  // End of variables declaration//GEN-END:variables
}
