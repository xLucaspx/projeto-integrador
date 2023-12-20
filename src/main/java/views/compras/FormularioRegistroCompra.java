package views.compras;

import controller.CompraController;
import controller.FornecedorController;
import controller.ProdutoController;
import exceptions.ValidationException;
import factory.ControllerFactory;
import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.compra.DadosCompraProduto;
import models.compra.DadosRegistroNotaCompra;
import models.fornecedor.Fornecedor;
import views.constants.Colors;

public class FormularioRegistroCompra extends javax.swing.JInternalFrame {

  private DefaultTableModel model;
  private final ProdutoController produtoController;
  private final FornecedorController fornecedorController;
  private List<DadosCompraProduto> produtos;
  private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  private final Format dateFormat = dateFormatter.toFormat();
  private final CompraController compraController;

  public FormularioRegistroCompra(ControllerFactory controllerFactory) {
    this.compraController  = controllerFactory.createCompraController();
    this.produtoController = controllerFactory.createProdutoController();
    this.fornecedorController = controllerFactory.createFornecedorController();
    this.produtos = new ArrayList<>();
    initComponents();
  }

  private void adicionaProduto() {
    try {
      var codigo = inputCodigo.getText();
      var quantidade = Double.parseDouble(inputQuantidade.getText());
      var custo = Float.parseFloat(inputCusto.getText());

      var dados = new DadosCompraProduto(codigo, quantidade, custo);

      if (!produtoController.existePorCodigoAndAtivo(codigo)) {
        throw new ValidationException("O produto de código %s não se encontra ativo no sistema!".formatted(codigo));
      }

      produtos.add(dados);
      preencheTabela();
      limpaCamposProduto();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Erro ao tentar adicionar produto:\n" + e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }

  private void preencheTabela() {
    model.getDataVector().clear();

    if (produtos.isEmpty()) {
      tabelaProdutos.repaint();
      return;
    }

    for (int i = 0; i < produtos.size(); i++) {
      var dados = produtos.get(i);
      var produto = produtoController.buscaPorCodigo(dados.codigoProduto());
      var subtotal = String.format("R$ %.2f", dados.quantidade() * dados.precoCusto());

      model.addRow(new Object[]{i + 1, dados.codigoProduto(), produto.getDescricao(), dados.quantidade(), String.format("R$ %.2f", dados.precoCusto()), subtotal});
    }
  }

  private void limpaCamposProduto() {
    inputCodigo.setText("");
    inputQuantidade.setText("");
    inputCusto.setText("");
  }

  private void removeProduto() {
    var linhaSelecionada = tabelaProdutos.getSelectedRow();

    if (linhaSelecionada < 0 || linhaSelecionada > model.getRowCount())
      throw new RuntimeException("Você deve selecionar um produto!");

    produtos.remove(linhaSelecionada);
    preencheTabela();
  }

  private Fornecedor selecionaFornecedor() {
    if (comboFornecedor.getSelectedIndex() < 0) {
      throw new ValidationException("Selecione um fornecedor");
    }
    return (Fornecedor) comboFornecedor.getSelectedItem();
  }

  private DadosRegistroNotaCompra criaDadosCompra() {
    var numeroNota = inputNumeroNota.getText();
    var dataCompra = LocalDate.parse(inputDataCompra.getText(), dateFormatter);
    var fornecedor = selecionaFornecedor();

    return new DadosRegistroNotaCompra(numeroNota, dataCompra, fornecedor.getCnpj(), produtos);
  }
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbRegistroCompra = new javax.swing.JLabel();
    lbNumNota = new javax.swing.JLabel();
    lbDataCompra = new javax.swing.JLabel();
    lbFornecedor = new javax.swing.JLabel();
    var listaFornecedores = fornecedorController.listaTodos();
    var fornecedorComboModel = new DefaultComboBoxModel<>(listaFornecedores.toArray(Fornecedor[]::new));
    fornecedorComboModel.insertElementAt(null, 0);
    comboFornecedor = new javax.swing.JComboBox<>();
    inputNumeroNota = new javax.swing.JTextField();
    btnRemoveProduto = new javax.swing.JButton();
    btnRegistraCompra = new javax.swing.JButton();
    btCancela = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    var nomeColunas = new String[]{"Nº" , "Código", "Descrição", "Quantidade", "Valor un.", "Subtotal"};
    model = new DefaultTableModel(nomeColunas, 0){
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    tabelaProdutos = new javax.swing.JTable();
    btnAddProduto = new javax.swing.JButton();
    lbCodigo = new javax.swing.JLabel();
    inputCodigo = new javax.swing.JTextField();
    lbQuantidade = new javax.swing.JLabel();
    inputQuantidade = new javax.swing.JFormattedTextField();
    lbFornecedor1 = new javax.swing.JLabel();
    inputCusto = new javax.swing.JFormattedTextField();
    jSeparator1 = new javax.swing.JSeparator();
    inputDataCompra = new JFormattedTextField(dateFormat);

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Registro de compra");
    setVisible(true);

    lbRegistroCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lbRegistroCompra.setText("Registro de compra");

    lbNumNota.setText("Numero da nota");

    lbDataCompra.setText("Data da compra");

    lbFornecedor.setText("Fornecedor");

    comboFornecedor.setModel(fornecedorComboModel);
    comboFornecedor.setSelectedItem(null);

    btnRemoveProduto.setBackground(Colors.DARK_RED);
    btnRemoveProduto.setForeground(Colors.WHITE);
    btnRemoveProduto.setText("Remover produto");
    btnRemoveProduto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveProdutoActionPerformed(evt);
      }
    });

    btnRegistraCompra.setBackground(Colors.DARK_BLUE);
    btnRegistraCompra.setForeground(Colors.WHITE);
    btnRegistraCompra.setText("Registrar compra");
    btnRegistraCompra.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegistraCompraActionPerformed(evt);
      }
    });

    btCancela.setBackground(Colors.RED);
    btCancela.setForeground(Colors.WHITE);
    btCancela.setText("Cancelar");

    tabelaProdutos.setModel(model);
    jScrollPane1.setViewportView(tabelaProdutos);

    btnAddProduto.setBackground(Colors.BLUE);
    btnAddProduto.setForeground(Colors.WHITE);
    btnAddProduto.setText("Adicionar produto");
    btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddProdutoActionPerformed(evt);
      }
    });

    lbCodigo.setText("Código");

    lbQuantidade.setText("Quantidade");

    lbFornecedor1.setText("Preço de custo");

    jSeparator1.setPreferredSize(null);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lbRegistroCompra)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnRemoveProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnRegistraCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnAddProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(61, 61, 61))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(44, 44, 44)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQuantidade))
                  .addGap(46, 46, 46)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumNota)
                    .addComponent(inputNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(44, 44, 44)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDataCompra)
                    .addComponent(inputDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(26, 26, 26)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addComponent(lbRegistroCompra)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lbNumNota)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(inputNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lbDataCompra)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(inputDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lbFornecedor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnAddProduto, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(lbCodigo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(lbQuantidade)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(inputCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(lbFornecedor1))
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnRemoveProduto)
            .addGap(41, 41, 41)
            .addComponent(btnRegistraCompra)
            .addGap(39, 39, 39)
            .addComponent(btCancela))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

	private void btnRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProdutoActionPerformed
    removeProduto();
	}//GEN-LAST:event_btnRemoveProdutoActionPerformed

	private void btnRegistraCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraCompraActionPerformed
    try{
      compraController.cadastra(criaDadosCompra());
      
      JOptionPane.showMessageDialog(this, "Nota de compra registrada com sucesso!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
      dispose();
    }catch (Exception e){
      JOptionPane.showMessageDialog(this, "Erro ao registrar nota de compra:\n" + e.getMessage(), this.getTitle(), JOptionPane.ERROR_MESSAGE);
    }
	}//GEN-LAST:event_btnRegistraCompraActionPerformed

  private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
    adicionaProduto();
  }//GEN-LAST:event_btnAddProdutoActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btCancela;
  private javax.swing.JButton btnAddProduto;
  private javax.swing.JButton btnRegistraCompra;
  private javax.swing.JButton btnRemoveProduto;
  private javax.swing.JComboBox<Fornecedor> comboFornecedor;
  private javax.swing.JTextField inputCodigo;
  private javax.swing.JFormattedTextField inputCusto;
  private javax.swing.JFormattedTextField inputDataCompra;
  private javax.swing.JTextField inputNumeroNota;
  private javax.swing.JFormattedTextField inputQuantidade;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel lbCodigo;
  private javax.swing.JLabel lbDataCompra;
  private javax.swing.JLabel lbFornecedor;
  private javax.swing.JLabel lbFornecedor1;
  private javax.swing.JLabel lbNumNota;
  private javax.swing.JLabel lbQuantidade;
  private javax.swing.JLabel lbRegistroCompra;
  private javax.swing.JTable tabelaProdutos;
  // End of variables declaration//GEN-END:variables
}
