package views.fornecedor;

import javax.swing.JOptionPane;

import controller.FornecedorController;

import factory.ControllerFactory;
import models.fornecedor.DadosBasicosFornecedor;
import models.fornecedor.Endereco;
import models.fornecedor.Fornecedor;
import views.constants.Colors;
import views.constants.Fonts;

public class FormularioFornecedor extends javax.swing.JInternalFrame {

  private Fornecedor fornecedor;
  private final FornecedorController fornecedorController;

  public FormularioFornecedor(ControllerFactory controllerFactory) {
    this.fornecedorController = controllerFactory.createFornecedorController();
    initComponents();
  }

  public FormularioFornecedor(ControllerFactory controllerFactory, Fornecedor fornecedor) {
    this.fornecedorController = controllerFactory.createFornecedorController();
    this.fornecedor = fornecedor;
    initComponents();
  }

  private void cadastraFornecedor(DadosBasicosFornecedor dados) {
    fornecedorController.cadastra(dados);
    JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
  }

  private void editaFornecedor(DadosBasicosFornecedor dados) {
    fornecedorController.edita(dados);
    JOptionPane.showMessageDialog(this, "Fornecedor alterado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
  }
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    labelFormFornecedor = new javax.swing.JLabel();
    labelCnpj = new javax.swing.JLabel();
    inputCnpj = new javax.swing.JTextField();
    labelNome = new javax.swing.JLabel();
    inputNome = new javax.swing.JTextField();
    labelEmail = new javax.swing.JLabel();
    inputEmail = new javax.swing.JTextField();
    labelFone = new javax.swing.JLabel();
    inputFone = new javax.swing.JTextField();
    labelCep = new javax.swing.JLabel();
    inputCep = new javax.swing.JTextField();
    lbBairro = new javax.swing.JLabel();
    inputBairro = new javax.swing.JTextField();
    labelUf = new javax.swing.JLabel();
    inputUf = new javax.swing.JTextField();
    labelCidade = new javax.swing.JLabel();
    inputCidade = new javax.swing.JTextField();
    labelEndereco = new javax.swing.JLabel();
    inputEndereco = new javax.swing.JTextField();
    labelNumero = new javax.swing.JLabel();
    inputNumero = new javax.swing.JTextField();
    labelComplemento = new javax.swing.JLabel();
    inputComplemento = new javax.swing.JTextField();
    btnSalvar = new javax.swing.JButton();
    btnCancela = new javax.swing.JButton();

    setBackground(Colors.BACKGROUND_COLOR);
    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Formulário de fornecedor");
    setMinimumSize(null);
    setVisible(true);

    labelFormFornecedor.setFont(Fonts.TITLE_FONT);
    labelFormFornecedor.setForeground(Colors.FONT_COLOR);
    labelFormFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelFormFornecedor.setLabelFor(this);
    labelFormFornecedor.setText("Formulário de fornecedor");
    labelFormFornecedor.setMinimumSize(null);
    labelFormFornecedor.setPreferredSize(null);

    labelCnpj.setFont(Fonts.DEFAULT_FONT);
    labelCnpj.setForeground(Colors.FONT_COLOR);
    labelCnpj.setLabelFor(inputCnpj);
    labelCnpj.setText("CNPJ");
    labelCnpj.setMinimumSize(null);
    labelCnpj.setPreferredSize(null);

    inputCnpj.setEditable(fornecedor == null);
    inputCnpj.setBackground(Colors.WHITE);
    inputCnpj.setFont(Fonts.DEFAULT_FONT);
    inputCnpj.setForeground(Colors.FONT_COLOR);
    inputCnpj.setText(fornecedor!=null? fornecedor.getCnpj() : "");
    inputCnpj.setCaretColor(Colors.FONT_COLOR);
    inputCnpj.setMinimumSize(null);
    inputCnpj.setPreferredSize(null);
    inputCnpj.setSelectedTextColor(Colors.WHITE);
    inputCnpj.setSelectionColor(Colors.DARK_BLUE);

    labelNome.setFont(Fonts.DEFAULT_FONT);
    labelNome.setForeground(Colors.FONT_COLOR);
    labelNome.setLabelFor(inputNome);
    labelNome.setText("Nome");
    labelNome.setMinimumSize(null);
    labelNome.setPreferredSize(null);

    inputNome.setBackground(Colors.WHITE);
    inputNome.setFont(Fonts.DEFAULT_FONT);
    inputNome.setForeground(Colors.FONT_COLOR);
    inputNome.setText(fornecedor!=null? fornecedor.getNome(): "");
    inputNome.setCaretColor(Colors.FONT_COLOR);
    inputNome.setMinimumSize(null);
    inputNome.setPreferredSize(null);
    inputNome.setSelectedTextColor(Colors.WHITE);
    inputNome.setSelectionColor(Colors.DARK_BLUE);

    labelEmail.setFont(Fonts.DEFAULT_FONT);
    labelEmail.setForeground(Colors.FONT_COLOR);
    labelEmail.setLabelFor(inputEmail);
    labelEmail.setText("E-mail");
    labelEmail.setMinimumSize(null);
    labelEmail.setPreferredSize(null);

    inputEmail.setBackground(Colors.WHITE);
    inputEmail.setFont(Fonts.DEFAULT_FONT);
    inputEmail.setForeground(Colors.FONT_COLOR);
    inputEmail.setText(fornecedor!=null? fornecedor.getEmail(): "");
    inputEmail.setCaretColor(Colors.FONT_COLOR);
    inputEmail.setMinimumSize(null);
    inputEmail.setPreferredSize(null);
    inputEmail.setSelectedTextColor(Colors.WHITE);
    inputEmail.setSelectionColor(Colors.DARK_BLUE);

    labelFone.setFont(Fonts.DEFAULT_FONT);
    labelFone.setForeground(Colors.FONT_COLOR);
    labelFone.setLabelFor(inputFone);
    labelFone.setText("Telefone");
    labelFone.setMinimumSize(null);
    labelFone.setPreferredSize(null);

    inputFone.setBackground(Colors.WHITE);
    inputFone.setFont(Fonts.DEFAULT_FONT);
    inputFone.setForeground(Colors.FONT_COLOR);
    inputFone.setText(fornecedor!=null? fornecedor.getTelefone(): "");
    inputFone.setCaretColor(Colors.FONT_COLOR);
    inputFone.setMinimumSize(null);
    inputFone.setPreferredSize(null);
    inputFone.setSelectedTextColor(Colors.WHITE);
    inputFone.setSelectionColor(Colors.DARK_BLUE);

    labelCep.setFont(Fonts.DEFAULT_FONT);
    labelCep.setForeground(Colors.FONT_COLOR);
    labelCep.setLabelFor(inputCep);
    labelCep.setText("CEP");
    labelCep.setMinimumSize(null);
    labelCep.setPreferredSize(null);

    inputCep.setBackground(Colors.WHITE);
    inputCep.setFont(Fonts.DEFAULT_FONT);
    inputCep.setForeground(Colors.FONT_COLOR);
    inputCep.setText(fornecedor!=null? fornecedor.getEndereco().cep(): "");
    inputCep.setCaretColor(Colors.FONT_COLOR);
    inputCep.setMinimumSize(null);
    inputCep.setPreferredSize(null);
    inputCep.setSelectedTextColor(Colors.WHITE);
    inputCep.setSelectionColor(Colors.DARK_BLUE);

    lbBairro.setFont(Fonts.DEFAULT_FONT);
    lbBairro.setForeground(Colors.FONT_COLOR);
    lbBairro.setLabelFor(inputBairro);
    lbBairro.setText("Bairro");
    lbBairro.setMinimumSize(null);
    lbBairro.setPreferredSize(null);

    inputBairro.setBackground(Colors.WHITE);
    inputBairro.setFont(Fonts.DEFAULT_FONT);
    inputBairro.setForeground(Colors.FONT_COLOR);
    inputBairro.setText(fornecedor!=null? fornecedor.getEndereco().bairro(): "");
    inputBairro.setCaretColor(Colors.FONT_COLOR);
    inputBairro.setMinimumSize(null);
    inputBairro.setPreferredSize(null);
    inputBairro.setSelectedTextColor(Colors.WHITE);
    inputBairro.setSelectionColor(Colors.DARK_BLUE);

    labelUf.setFont(Fonts.DEFAULT_FONT);
    labelUf.setForeground(Colors.FONT_COLOR);
    labelUf.setLabelFor(inputUf);
    labelUf.setText("UF");
    labelUf.setMinimumSize(null);
    labelUf.setPreferredSize(null);

    inputUf.setBackground(Colors.WHITE);
    inputUf.setFont(Fonts.DEFAULT_FONT);
    inputUf.setForeground(Colors.FONT_COLOR);
    inputUf.setText(fornecedor!=null? fornecedor.getEndereco().uf(): "");
    inputUf.setCaretColor(Colors.FONT_COLOR);
    inputUf.setMinimumSize(null);
    inputUf.setPreferredSize(null);
    inputUf.setSelectedTextColor(Colors.WHITE);
    inputUf.setSelectionColor(Colors.DARK_BLUE);

    labelCidade.setFont(Fonts.DEFAULT_FONT);
    labelCidade.setForeground(Colors.FONT_COLOR);
    labelCidade.setLabelFor(inputCidade);
    labelCidade.setText("Cidade");
    labelCidade.setMinimumSize(null);
    labelCidade.setPreferredSize(null);

    inputCidade.setBackground(Colors.WHITE);
    inputCidade.setFont(Fonts.DEFAULT_FONT);
    inputCidade.setForeground(Colors.FONT_COLOR);
    inputCidade.setText(fornecedor!=null? fornecedor.getEndereco().cidade(): "");
    inputCidade.setCaretColor(Colors.FONT_COLOR);
    inputCidade.setMinimumSize(null);
    inputCidade.setPreferredSize(null);
    inputCidade.setSelectedTextColor(Colors.WHITE);
    inputCidade.setSelectionColor(Colors.DARK_BLUE);

    labelEndereco.setFont(Fonts.DEFAULT_FONT);
    labelEndereco.setForeground(Colors.FONT_COLOR);
    labelEndereco.setLabelFor(inputEndereco);
    labelEndereco.setText("Endereço");
    labelEndereco.setMinimumSize(null);
    labelEndereco.setPreferredSize(null);

    inputEndereco.setBackground(Colors.WHITE);
    inputEndereco.setFont(Fonts.DEFAULT_FONT);
    inputEndereco.setForeground(Colors.FONT_COLOR);
    inputEndereco.setText(fornecedor!=null? fornecedor.getEndereco().logradouro(): "");
    inputEndereco.setCaretColor(Colors.FONT_COLOR);
    inputEndereco.setMinimumSize(null);
    inputEndereco.setPreferredSize(null);
    inputEndereco.setSelectedTextColor(Colors.WHITE);
    inputEndereco.setSelectionColor(Colors.DARK_BLUE);

    labelNumero.setFont(Fonts.DEFAULT_FONT);
    labelNumero.setForeground(Colors.FONT_COLOR);
    labelNumero.setLabelFor(inputNumero);
    labelNumero.setText("Número");
    labelNumero.setMinimumSize(null);
    labelNumero.setPreferredSize(null);

    inputNumero.setBackground(Colors.WHITE);
    inputNumero.setFont(Fonts.DEFAULT_FONT);
    inputNumero.setForeground(Colors.FONT_COLOR);
    inputNumero.setText(fornecedor!=null? fornecedor.getEndereco().numero(): "");
    inputNumero.setCaretColor(Colors.FONT_COLOR);
    inputNumero.setMinimumSize(null);
    inputNumero.setPreferredSize(null);
    inputNumero.setSelectedTextColor(Colors.WHITE);
    inputNumero.setSelectionColor(Colors.DARK_BLUE);

    labelComplemento.setFont(Fonts.DEFAULT_FONT);
    labelComplemento.setForeground(Colors.FONT_COLOR);
    labelComplemento.setText("Complemento");
    labelComplemento.setMinimumSize(null);
    labelComplemento.setPreferredSize(null);

    inputComplemento.setBackground(Colors.WHITE);
    inputComplemento.setFont(Fonts.DEFAULT_FONT);
    inputComplemento.setForeground(Colors.FONT_COLOR);
    inputComplemento.setText(fornecedor!=null? fornecedor.getEndereco().complemento(): "");
    inputComplemento.setCaretColor(Colors.FONT_COLOR);
    inputComplemento.setMinimumSize(null);
    inputComplemento.setPreferredSize(null);
    inputComplemento.setSelectedTextColor(Colors.WHITE);
    inputComplemento.setSelectionColor(Colors.DARK_BLUE);

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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(labelCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(inputCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(labelCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(lbBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(labelUf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(inputUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
              .addComponent(labelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(labelFone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                  .addComponent(inputNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelComplemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(inputComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addComponent(labelCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(inputNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(inputFone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(inputCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelFormFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(45, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(labelFormFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(inputCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    try {
      var dados = criaDadosFornecedor();
      if (fornecedor != null) editaFornecedor(dados);
      else cadastraFornecedor(dados);

      dispose();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Erro ao salvar fornecedor:\n" + e.getMessage(), this.getTitle(), JOptionPane.ERROR_MESSAGE);
    }
	}//GEN-LAST:event_btnSalvarActionPerformed

	private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
    String[] options = {"Sim", "Não"};
    int resp = JOptionPane.showOptionDialog(this, "Está certo que deseja cancelar a operação?\nTodas os dados serão perdidos!", this.getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    if (resp != 0) {
      return;
    }
    dispose();
	}//GEN-LAST:event_btnCancelaActionPerformed

  private DadosBasicosFornecedor criaDadosFornecedor() {
    String cnpj = inputCnpj.getText().replace(".", "").replace("/", "").replace("-", "");
    String nome = inputNome.getText();
    String email = inputEmail.getText();
    String fone = inputFone.getText();
    String logradouro = inputEndereco.getText();
    String cep = inputCep.getText();
    String bairro = inputBairro.getText();
    String cidade = inputCidade.getText();
    String uf = inputUf.getText();
    String complemento = inputComplemento.getText();
    String numero = inputNumero.getText();

    var endereco = new Endereco(cep, logradouro, complemento, numero, bairro, cidade, uf);
    return new DadosBasicosFornecedor(cnpj, nome, email, fone, endereco);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancela;
  private javax.swing.JButton btnSalvar;
  private javax.swing.JTextField inputBairro;
  private javax.swing.JTextField inputCep;
  private javax.swing.JTextField inputCidade;
  private javax.swing.JTextField inputCnpj;
  private javax.swing.JTextField inputComplemento;
  private javax.swing.JTextField inputEmail;
  private javax.swing.JTextField inputEndereco;
  private javax.swing.JTextField inputFone;
  private javax.swing.JTextField inputNome;
  private javax.swing.JTextField inputNumero;
  private javax.swing.JTextField inputUf;
  private javax.swing.JLabel labelCep;
  private javax.swing.JLabel labelCidade;
  private javax.swing.JLabel labelCnpj;
  private javax.swing.JLabel labelComplemento;
  private javax.swing.JLabel labelEmail;
  private javax.swing.JLabel labelEndereco;
  private javax.swing.JLabel labelFone;
  private javax.swing.JLabel labelFormFornecedor;
  private javax.swing.JLabel labelNome;
  private javax.swing.JLabel labelNumero;
  private javax.swing.JLabel labelUf;
  private javax.swing.JLabel lbBairro;
  // End of variables declaration//GEN-END:variables
}
