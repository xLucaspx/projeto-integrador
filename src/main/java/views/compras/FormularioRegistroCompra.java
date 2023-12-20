package views.compras;

import controller.CompraController;
import controller.FornecedorController;
import controller.ProdutoController;
import exceptions.ValidationException;
import factory.ControllerFactory;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
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
import views.constants.Fonts;

public class FormularioRegistroCompra extends javax.swing.JInternalFrame {

  private final ProdutoController produtoController;
  private final FornecedorController fornecedorController;
  private final CompraController compraController;

  private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  private final Format dateFormat = dateFormatter.toFormat();
  private final NumberFormat precoFormat = DecimalFormat.getInstance();
  private final NumberFormat quantidadeFormat = DecimalFormat.getInstance();
  private DefaultTableModel tableModel;

  private List<DadosCompraProduto> produtos;

  public FormularioRegistroCompra(ControllerFactory controllerFactory) {
    this.compraController = controllerFactory.createCompraController();
    this.produtoController = controllerFactory.createProdutoController();
    this.fornecedorController = controllerFactory.createFornecedorController();
    this.produtos = new ArrayList<>();
    initComponents();
  }

  private void adicionaProduto() {
    try {
      var codigo = inputCodigoProduto.getText();
      var quantidade = Double.parseDouble(inputQuantidade.getText().replace(".", "").replace(",", "."));
      var custo = Float.parseFloat(inputCusto.getText().replace(".", "").replace(",", "."));

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
    tableModel.getDataVector().clear();

    if (produtos.isEmpty()) {
      tabelaProdutos.repaint();
      return;
    }

    for (int i = 0; i < produtos.size(); i++) {
      var dados = produtos.get(i);
      var produto = produtoController.buscaPorCodigo(dados.codigoProduto());
      var subtotal = String.format("R$ %.2f", dados.quantidade() * dados.precoCusto());

      tableModel.addRow(new Object[]{i + 1, dados.codigoProduto(), produto.getDescricao(), dados.quantidade(), String.format("R$ %.2f", dados.precoCusto()), subtotal});
    }
  }

  private void limpaCamposProduto() {
    inputCodigoProduto.setText("");
    inputQuantidade.setText("");
    inputCusto.setText("");
  }

  private void removeProduto() {
    var linhaSelecionada = tabelaProdutos.getSelectedRow();

    if (linhaSelecionada < 0 || linhaSelecionada > tableModel.getRowCount())
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

    title = new javax.swing.JLabel();
    labelNumeroNota = new javax.swing.JLabel();
    inputNumeroNota = new javax.swing.JTextField();
    labelDataCompra = new javax.swing.JLabel();
    inputDataCompra = new JFormattedTextField(dateFormat);
    labelFornecedor = new javax.swing.JLabel();
    var listaFornecedores = fornecedorController.listaTodos();
    var fornecedorComboModel = new DefaultComboBoxModel<>(listaFornecedores.toArray(Fornecedor[]::new));
    fornecedorComboModel.insertElementAt(null, 0);
    comboFornecedor = new javax.swing.JComboBox<>();
    jSeparator1 = new javax.swing.JSeparator();
    labelCodigoProduto = new javax.swing.JLabel();
    inputCodigoProduto = new javax.swing.JTextField();
    labelQuantidade = new javax.swing.JLabel();
    quantidadeFormat.setMaximumIntegerDigits(4);
    quantidadeFormat.setMaximumFractionDigits(3);
    quantidadeFormat.setRoundingMode(RoundingMode.HALF_EVEN);
    inputQuantidade = new JFormattedTextField(quantidadeFormat);
    labelCusto = new javax.swing.JLabel();
    precoFormat.setMaximumIntegerDigits(4);
    precoFormat.setMaximumFractionDigits(2);
    precoFormat.setRoundingMode(RoundingMode.HALF_EVEN);
    inputCusto = new JFormattedTextField(precoFormat);
    btnAdicionaProduto = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    var nomeColunas = new String[]{"Nº" , "Código", "Descrição", "Qtd.", "Valor un.", "Subtotal"};
    tableModel = new DefaultTableModel(nomeColunas, 0){
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    tabelaProdutos = new javax.swing.JTable();
    btnRemoveProduto = new javax.swing.JButton();
    btnRegistraCompra = new javax.swing.JButton();
    btnCancela = new javax.swing.JButton();

    setBackground(Colors.BACKGROUND_COLOR);
    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Registro de compra");
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

    title.setFont(Fonts.TITLE_FONT);
    title.setForeground(Colors.FONT_COLOR);
    title.setLabelFor(this);
    title.setText("Formulário de compra");
    title.setMinimumSize(null);
    title.setPreferredSize(null);

    labelNumeroNota.setFont(Fonts.DEFAULT_FONT);
    labelNumeroNota.setForeground(Colors.FONT_COLOR);
    labelNumeroNota.setLabelFor(inputNumeroNota);
    labelNumeroNota.setText("Numero da nota");
    labelNumeroNota.setMaximumSize(null);
    labelNumeroNota.setMinimumSize(null);
    labelNumeroNota.setPreferredSize(null);

    inputNumeroNota.setBackground(Colors.WHITE);
    inputNumeroNota.setFont(Fonts.DEFAULT_FONT);
    inputNumeroNota.setForeground(Colors.FONT_COLOR);
    inputNumeroNota.setCaretColor(Colors.FONT_COLOR);
    inputNumeroNota.setMinimumSize(null);
    inputNumeroNota.setPreferredSize(null);
    inputNumeroNota.setSelectedTextColor(Colors.WHITE);
    inputNumeroNota.setSelectionColor(Colors.DARK_BLUE);

    labelDataCompra.setFont(Fonts.DEFAULT_FONT);
    labelDataCompra.setForeground(Colors.FONT_COLOR);
    labelDataCompra.setLabelFor(inputDataCompra);
    labelDataCompra.setText("Data da compra");
    labelDataCompra.setMaximumSize(null);
    labelDataCompra.setMinimumSize(null);
    labelDataCompra.setPreferredSize(null);

    inputDataCompra.setBackground(Colors.WHITE);
    inputDataCompra.setForeground(Colors.FONT_COLOR);
    inputDataCompra.setCaretColor(Colors.FONT_COLOR);
    inputDataCompra.setFont(Fonts.DEFAULT_FONT);
    inputDataCompra.setMinimumSize(null);
    inputDataCompra.setPreferredSize(null);
    inputDataCompra.setSelectedTextColor(Colors.WHITE);
    inputDataCompra.setSelectionColor(Colors.DARK_BLUE);

    labelFornecedor.setFont(Fonts.DEFAULT_FONT);
    labelFornecedor.setForeground(Colors.FONT_COLOR);
    labelFornecedor.setLabelFor(comboFornecedor);
    labelFornecedor.setText("Fornecedor");
    labelFornecedor.setMaximumSize(null);
    labelFornecedor.setMinimumSize(null);
    labelFornecedor.setPreferredSize(null);

    comboFornecedor.setBackground(Colors.WHITE);
    comboFornecedor.setFont(Fonts.DEFAULT_FONT);
    comboFornecedor.setForeground(Colors.FONT_COLOR);
    comboFornecedor.setMaximumRowCount(10);
    comboFornecedor.setModel(fornecedorComboModel);
    comboFornecedor.setSelectedItem(null);
    comboFornecedor.setMinimumSize(null);
    comboFornecedor.setPreferredSize(null);

    jSeparator1.setBackground(Colors.FONT_COLOR);
    jSeparator1.setForeground(Colors.FONT_COLOR);
    jSeparator1.setPreferredSize(null);

    labelCodigoProduto.setFont(Fonts.DEFAULT_FONT);
    labelCodigoProduto.setForeground(Colors.FONT_COLOR);
    labelCodigoProduto.setLabelFor(inputCodigoProduto);
    labelCodigoProduto.setText("Código");
    labelCodigoProduto.setMaximumSize(null);
    labelCodigoProduto.setMinimumSize(null);
    labelCodigoProduto.setPreferredSize(null);

    inputCodigoProduto.setBackground(Colors.WHITE);
    inputCodigoProduto.setFont(Fonts.DEFAULT_FONT);
    inputCodigoProduto.setForeground(Colors.FONT_COLOR);
    inputCodigoProduto.setCaretColor(Colors.FONT_COLOR);
    inputCodigoProduto.setMinimumSize(null);
    inputCodigoProduto.setPreferredSize(null);
    inputCodigoProduto.setSelectedTextColor(Colors.WHITE);
    inputCodigoProduto.setSelectionColor(Colors.DARK_BLUE);

    labelQuantidade.setFont(Fonts.DEFAULT_FONT);
    labelQuantidade.setForeground(Colors.FONT_COLOR);
    labelQuantidade.setLabelFor(inputQuantidade);
    labelQuantidade.setText("Quantidade");
    labelQuantidade.setMaximumSize(null);
    labelQuantidade.setMinimumSize(null);
    labelQuantidade.setPreferredSize(null);

    inputQuantidade.setBackground(Colors.WHITE);
    inputQuantidade.setForeground(Colors.FONT_COLOR);
    inputQuantidade.setCaretColor(Colors.FONT_COLOR);
    inputQuantidade.setFont(Fonts.DEFAULT_FONT);
    inputQuantidade.setMinimumSize(null);
    inputQuantidade.setPreferredSize(null);
    inputQuantidade.setSelectedTextColor(Colors.WHITE);
    inputQuantidade.setSelectionColor(Colors.DARK_BLUE);

    labelCusto.setFont(Fonts.DEFAULT_FONT);
    labelCusto.setForeground(Colors.FONT_COLOR);
    labelCusto.setLabelFor(inputCusto);
    labelCusto.setText("Preço de custo");
    labelCusto.setMaximumSize(null);
    labelCusto.setMinimumSize(null);
    labelCusto.setPreferredSize(null);

    inputCusto.setBackground(Colors.WHITE);
    inputCusto.setForeground(Colors.FONT_COLOR);
    inputCusto.setCaretColor(Colors.FONT_COLOR);
    inputCusto.setFont(Fonts.DEFAULT_FONT);
    inputCusto.setMinimumSize(null);
    inputCusto.setPreferredSize(null);
    inputCusto.setSelectedTextColor(Colors.WHITE);
    inputCusto.setSelectionColor(Colors.DARK_BLUE);

    btnAdicionaProduto.setBackground(Colors.DARK_GREEN);
    btnAdicionaProduto.setFont(Fonts.MEDIUM_FONT);
    btnAdicionaProduto.setForeground(Colors.WHITE);
    btnAdicionaProduto.setText("Incluir");
    btnAdicionaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAdicionaProduto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAdicionaProdutoActionPerformed(evt);
      }
    });

    tabelaProdutos.setBackground(Colors.WHITE);
    tabelaProdutos.setFont(Fonts.SMALL_FONT);
    tabelaProdutos.setForeground(Colors.FONT_COLOR);
    tabelaProdutos.setModel(tableModel);
    tabelaProdutos.setGridColor(Colors.FONT_COLOR);
    tabelaProdutos.setIntercellSpacing(new java.awt.Dimension(5, 5));
    tabelaProdutos.setRowHeight(25);
    tabelaProdutos.setSelectionBackground(Colors.DARK_GREEN);
    tabelaProdutos.setSelectionForeground(Colors.WHITE);
    tabelaProdutos.setShowHorizontalLines(true);
    tabelaProdutos.getTableHeader().setReorderingAllowed(false);
    var colunaIndice = tabelaProdutos.getColumnModel().getColumn(0);
    var colunaCodigo = tabelaProdutos.getColumnModel().getColumn(1);
    var colunaDescricao = tabelaProdutos.getColumnModel().getColumn(2);
    var colunaQuantidade = tabelaProdutos.getColumnModel().getColumn(3);
    var colunaValorUn = tabelaProdutos.getColumnModel().getColumn(4);
    var colunaSubtotal = tabelaProdutos.getColumnModel().getColumn(5);

    colunaIndice.setPreferredWidth(30);
    colunaCodigo.setPreferredWidth(70);
    colunaDescricao.setPreferredWidth(195);
    colunaQuantidade.setPreferredWidth(60);
    colunaValorUn.setPreferredWidth(65);
    colunaSubtotal.setPreferredWidth(65);
    jScrollPane1.setViewportView(tabelaProdutos);

    btnRemoveProduto.setBackground(Colors.DARK_RED);
    btnRemoveProduto.setFont(Fonts.MEDIUM_FONT);
    btnRemoveProduto.setForeground(Colors.WHITE);
    btnRemoveProduto.setText("Remover");
    btnRemoveProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnRemoveProduto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveProdutoActionPerformed(evt);
      }
    });

    btnRegistraCompra.setBackground(Colors.BLUE);
    btnRegistraCompra.setFont(Fonts.MEDIUM_FONT);
    btnRegistraCompra.setForeground(Colors.WHITE);
    btnRegistraCompra.setText("Registrar compra");
    btnRegistraCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnRegistraCompra.setMinimumSize(null);
    btnRegistraCompra.setPreferredSize(null);
    btnRegistraCompra.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegistraCompraActionPerformed(evt);
      }
    });

    btnCancela.setBackground(Colors.RED);
    btnCancela.setFont(Fonts.MEDIUM_FONT);
    btnCancela.setForeground(Colors.WHITE);
    btnCancela.setText("Cancelar");
    btnCancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnCancela.setMinimumSize(null);
    btnCancela.setPreferredSize(null);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(45, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(inputNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(61, 61, 61)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(inputDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(62, 62, 62)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(45, 45, 45)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(45, 45, 45)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistraCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addComponent(btnRemoveProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addGap(0, 45, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inputNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(inputDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36))
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addComponent(btnAdicionaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(labelCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(inputCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
              .addGroup(layout.createSequentialGroup()
                .addComponent(labelCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addGap(25, 25, 25)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(btnRemoveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistraCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

	private void btnRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProdutoActionPerformed
    removeProduto();
	}//GEN-LAST:event_btnRemoveProdutoActionPerformed

	private void btnRegistraCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraCompraActionPerformed
    try {
      compraController.cadastra(criaDadosCompra());

      JOptionPane.showMessageDialog(this, "Nota de compra registrada com sucesso!", getTitle(), JOptionPane.INFORMATION_MESSAGE);
      dispose();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Erro ao registrar nota de compra:\n" + e.getMessage(), this.getTitle(), JOptionPane.ERROR_MESSAGE);
    }
	}//GEN-LAST:event_btnRegistraCompraActionPerformed

  private void btnAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaProdutoActionPerformed
    adicionaProduto();
  }//GEN-LAST:event_btnAdicionaProdutoActionPerformed

  private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    var fornecedores = fornecedorController.listaTodos();
    var model = new DefaultComboBoxModel<>(fornecedores.toArray(Fornecedor[]::new));
    model.insertElementAt(null, 0);

    var selecionado = comboFornecedor.getSelectedItem();
    comboFornecedor.setModel(model);
    comboFornecedor.setSelectedItem(selecionado);
  }//GEN-LAST:event_formInternalFrameActivated

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdicionaProduto;
  private javax.swing.JButton btnCancela;
  private javax.swing.JButton btnRegistraCompra;
  private javax.swing.JButton btnRemoveProduto;
  private javax.swing.JComboBox<Fornecedor> comboFornecedor;
  private javax.swing.JTextField inputCodigoProduto;
  private javax.swing.JFormattedTextField inputCusto;
  private javax.swing.JFormattedTextField inputDataCompra;
  private javax.swing.JTextField inputNumeroNota;
  private javax.swing.JFormattedTextField inputQuantidade;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel labelCodigoProduto;
  private javax.swing.JLabel labelCusto;
  private javax.swing.JLabel labelDataCompra;
  private javax.swing.JLabel labelFornecedor;
  private javax.swing.JLabel labelNumeroNota;
  private javax.swing.JLabel labelQuantidade;
  private javax.swing.JTable tabelaProdutos;
  private javax.swing.JLabel title;
  // End of variables declaration//GEN-END:variables
}
