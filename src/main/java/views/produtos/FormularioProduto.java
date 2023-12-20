package views.produtos;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import controller.ProdutoController;
import models.produto.DadosBasicosProduto;
import models.produto.Formato;
import models.produto.Produto;
import exceptions.ValidationException;
import factory.ControllerFactory;

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

    lbFormProd = new javax.swing.JLabel();
    lbCodigo = new javax.swing.JLabel();
    inputCodigo = new javax.swing.JTextField();
    lbDescricao = new javax.swing.JLabel();
    inputDescricao = new javax.swing.JTextField();
    lbFormato = new javax.swing.JLabel();
    DefaultComboBoxModel<Formato> model = new DefaultComboBoxModel<>(Formato.values());
    comboFormato = new javax.swing.JComboBox<>();
    btnSalvar = new javax.swing.JButton();
    btnCancela = new javax.swing.JButton();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Formulário de produto");
    setVisible(true);

    lbFormProd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lbFormProd.setText("Formulário de produto");

    lbCodigo.setText("Código ");

    inputCodigo.setEditable(produto == null);
    inputCodigo.setText(produto!=null? produto.getCodigo() : "");
    inputCodigo.setMinimumSize(null);

    lbDescricao.setText("Descrição");

    inputDescricao.setText(produto!=null? produto.getDescricao(): "");
    inputDescricao.setMinimumSize(null);

    lbFormato.setText("Formato");

    comboFormato.setModel(model);
    comboFormato.setSelectedItem(produto != null ? produto.getFormato() : null);
    comboFormato.setMinimumSize(null);
    comboFormato.setPreferredSize(null);

    btnSalvar.setBackground(new java.awt.Color(0, 102, 204));
    btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
    btnSalvar.setText("Salvar");
    btnSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarActionPerformed(evt);
      }
    });

    btnCancela.setBackground(new java.awt.Color(204, 0, 0));
    btnCancela.setForeground(new java.awt.Color(255, 255, 255));
    btnCancela.setText("Cancelar");
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
        .addContainerGap(50, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
            .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lbFormato)
          .addComponent(lbDescricao)
          .addComponent(inputDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lbFormProd)
          .addComponent(inputCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lbCodigo)
          .addComponent(comboFormato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(50, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(lbFormProd)
        .addGap(28, 28, 28)
        .addComponent(lbCodigo)
        .addGap(18, 18, 18)
        .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(32, 32, 32)
        .addComponent(lbDescricao)
        .addGap(29, 29, 29)
        .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(38, 38, 38)
        .addComponent(lbFormato)
        .addGap(18, 18, 18)
        .addComponent(comboFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSalvar)
          .addComponent(btnCancela))
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
  private javax.swing.JLabel lbCodigo;
  private javax.swing.JLabel lbDescricao;
  private javax.swing.JLabel lbFormProd;
  private javax.swing.JLabel lbFormato;
  // End of variables declaration//GEN-END:variables
}
