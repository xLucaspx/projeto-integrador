package views.produtos;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import controller.ProdutoController;
import models.produto.DadosBasicosProduto;
import models.produto.Formato;
import models.produto.Produto;
import exceptions.ValidationException;
import factory.ControllerFactory;
import views.constants.Fonts;
import views.constants.Colors;

public class FormularioProduto extends javax.swing.JInternalFrame {

  private Produto produto;
  private final ProdutoController produtoController;

  public FormularioProduto(ControllerFactory controllerFactory, Produto produto) {
    this.produtoController = controllerFactory.createProdutoController();
    this.produto = produto;
    initComponents();
  }

  public FormularioProduto(ControllerFactory controllerFactory) {
    this.produtoController = controllerFactory.createProdutoController();
    initComponents();
  }

  private void cadastraProduto(DadosBasicosProduto dados) {
    produtoController.cadastra(dados);
    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
  }

  private void editaProduto(DadosBasicosProduto dados) {
    produtoController.edita(dados);
    JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
  }

  private Formato selecionaFormato() {
    if (comboFormato.getSelectedIndex() < 0) {
      throw new ValidationException("Selecione um formato");
    }
    return (Formato) comboFormato.getSelectedItem();
  }

  private DadosBasicosProduto criaDadosProduto() {
    String codigo = inputCodigo.getText();
    String descricao = inputDescricao.getText();
    Formato formato = selecionaFormato();

    return new DadosBasicosProduto(codigo, descricao, formato);
  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    title = new javax.swing.JLabel();
    labelCodigo = new javax.swing.JLabel();
    inputCodigo = new javax.swing.JTextField();
    labelDescricao = new javax.swing.JLabel();
    inputDescricao = new javax.swing.JTextField();
    labelFormato = new javax.swing.JLabel();
    DefaultComboBoxModel<Formato> model = new DefaultComboBoxModel<>(Formato.values());
    comboFormato = new javax.swing.JComboBox<>();
    btnSalvar = new javax.swing.JButton();
    btnCancela = new javax.swing.JButton();

    setBackground(Colors.BACKGROUND_COLOR);
    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Formulário de produto");
    setMinimumSize(null);
    setVisible(true);

    title.setFont(Fonts.TITLE_FONT);
    title.setForeground(Colors.FONT_COLOR);
    title.setLabelFor(this);
    title.setText("Formulário de produto");
    title.setMinimumSize(null);
    title.setPreferredSize(null);

    labelCodigo.setFont(Fonts.DEFAULT_FONT);
    labelCodigo.setForeground(Colors.FONT_COLOR);
    labelCodigo.setLabelFor(inputCodigo);
    labelCodigo.setText("Código ");
    labelCodigo.setMinimumSize(null);

    inputCodigo.setEditable(produto == null);
    inputCodigo.setBackground(Colors.WHITE);
    inputCodigo.setFont(Fonts.DEFAULT_FONT);
    inputCodigo.setForeground(Colors.FONT_COLOR);
    inputCodigo.setText(produto!=null? produto.getCodigo() : "");
    inputCodigo.setCaretColor(Colors.FONT_COLOR);
    inputCodigo.setMinimumSize(null);
    inputCodigo.setPreferredSize(null);
    inputCodigo.setSelectedTextColor(Colors.WHITE);
    inputCodigo.setSelectionColor(Colors.DARK_BLUE);

    labelDescricao.setFont(Fonts.DEFAULT_FONT);
    labelDescricao.setForeground(Colors.FONT_COLOR);
    labelDescricao.setLabelFor(labelDescricao);
    labelDescricao.setText("Descrição");
    labelDescricao.setMinimumSize(null);

    inputDescricao.setBackground(Colors.WHITE);
    inputDescricao.setFont(Fonts.DEFAULT_FONT);
    inputDescricao.setForeground(Colors.FONT_COLOR);
    inputDescricao.setText(produto!=null? produto.getDescricao(): "");
    inputDescricao.setCaretColor(Colors.FONT_COLOR);
    inputDescricao.setMinimumSize(null);
    inputDescricao.setPreferredSize(null);
    inputDescricao.setSelectedTextColor(Colors.WHITE);
    inputDescricao.setSelectionColor(Colors.DARK_BLUE);

    labelFormato.setFont(Fonts.DEFAULT_FONT);
    labelFormato.setForeground(Colors.FONT_COLOR);
    labelFormato.setLabelFor(comboFormato);
    labelFormato.setText("Formato");
    labelFormato.setMinimumSize(null);

    comboFormato.setBackground(Colors.WHITE);
    comboFormato.setFont(Fonts.DEFAULT_FONT);
    comboFormato.setForeground(Colors.FONT_COLOR);
    comboFormato.setMaximumRowCount(10);
    comboFormato.setModel(model);
    comboFormato.setSelectedItem(produto != null ? produto.getFormato() : null);
    comboFormato.setMinimumSize(null);
    comboFormato.setPreferredSize(null);

    btnSalvar.setBackground(Colors.BLUE);
    btnSalvar.setFont(Fonts.MEDIUM_FONT);
    btnSalvar.setForeground(Colors.WHITE);
    btnSalvar.setText("Salvar");
    btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnSalvar.setMinimumSize(null);
    btnSalvar.setPreferredSize(null);
    btnSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarActionPerformed(evt);
      }
    });

    btnCancela.setBackground(Colors.RED);
    btnCancela.setFont(Fonts.MEDIUM_FONT);
    btnCancela.setForeground(Colors.WHITE);
    btnCancela.setText("Cancelar");
    btnCancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnCancela.setMinimumSize(null);
    btnCancela.setPreferredSize(null);
    btnCancela.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelaActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(45, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(comboFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(45, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(labelFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(comboFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      try {
        var dados = criaDadosProduto();

        if (produto != null) editaProduto(dados);
        else cadastraProduto(dados);

        dispose();
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar produto:\n" + e.getMessage(), this.getTitle(), JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
      String[] options = {"Sim", "Não"};
      int resp = JOptionPane.showOptionDialog(this, "Está certo que deseja cancelar a operação?\nTodas as alterações serão perdidas!", this.getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
      if (resp != 0) {
        return;
      }
      dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancela;
  private javax.swing.JButton btnSalvar;
  private javax.swing.JComboBox<Formato> comboFormato;
  private javax.swing.JTextField inputCodigo;
  private javax.swing.JTextField inputDescricao;
  private javax.swing.JLabel labelCodigo;
  private javax.swing.JLabel labelDescricao;
  private javax.swing.JLabel labelFormato;
  private javax.swing.JLabel title;
  // End of variables declaration//GEN-END:variables
}
