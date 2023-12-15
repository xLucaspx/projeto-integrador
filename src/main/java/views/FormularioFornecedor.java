package views;

import controller.FornecedorController;
import factory.ControllerFactory;
import javax.swing.JOptionPane;
import models.Endereco;
import models.Fornecedor;

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
    
    private void cadastraFornecedor(Fornecedor f) {
        fornecedorController.cadastra(f);
        JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }

    private void editaFornecedor(Fornecedor f) {
        fornecedorController.edita(f);
        JOptionPane.showMessageDialog(this, "Fornecedor alterado com sucesso!", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFormFornecedor = new javax.swing.JLabel();
        inputCnpj = new javax.swing.JTextField();
        labelCnpj = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        inputFone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputCep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputUf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputCidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputComplemento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        lbBairro = new javax.swing.JLabel();
        inputBairro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulário de fornecedor");
        setVisible(true);

        labelFormFornecedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFormFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFormFornecedor.setText("Formulário de fornecedor");

        inputCnpj.setText(fornecedor!=null? fornecedor.getCnpj() : "");
        inputCnpj.setMinimumSize(null);

        labelCnpj.setText("CNPJ");

        inputNome.setText(fornecedor!=null? fornecedor.getNome(): "");
        inputNome.setMinimumSize(null);

        labelNome.setText("Nome");

        inputEmail.setText(fornecedor!=null? fornecedor.getEmail(): "");
        inputEmail.setMinimumSize(null);

        labelEmail.setText("E-mail");

        inputFone.setText(fornecedor!=null? fornecedor.getTelefone(): "");
        inputFone.setMinimumSize(null);

        jLabel1.setText("Telefone");

        inputCep.setText(fornecedor!=null? fornecedor.getEndereco().getCep(): "");

        jLabel2.setText("CEP");

        inputUf.setText(fornecedor!=null? fornecedor.getEndereco().getUf(): "");

        jLabel3.setText("UF");

        inputCidade.setText(fornecedor!=null? fornecedor.getEndereco().getCidade(): "");
        inputCidade.setMinimumSize(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cidade");

        inputEndereco.setText(fornecedor!=null? fornecedor.getEndereco().getLogradouro(): "");
        inputEndereco.setMinimumSize(null);

        jLabel5.setText("Endereço");

        inputNumero.setText(fornecedor!=null? fornecedor.getEndereco().getNumero(): "");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Número");

        inputComplemento.setText(fornecedor!=null? fornecedor.getEndereco().getComplemento(): "");
        inputComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputComplementoActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Complemento");

        btnSalvar.setBackground(new java.awt.Color(0, 102, 204));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setPreferredSize(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancela.setBackground(new java.awt.Color(204, 0, 0));
        btnCancela.setForeground(new java.awt.Color(255, 255, 255));
        btnCancela.setText("Cancelar");
        btnCancela.setPreferredSize(null);
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        lbBairro.setText("Bairro");

        inputBairro.setText(fornecedor!=null? fornecedor.getEndereco().getBairro(): "");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFormFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelCnpj)
                                    .addComponent(inputCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbBairro)
                                            .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(inputUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(labelNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputFone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(labelFormFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCnpj)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            try {
                Fornecedor f = criaFornecedor();
                if (fornecedor != null) {
                    editaFornecedor(f);
                } else {
                    cadastraFornecedor(f);
                }
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

    private void inputComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputComplementoActionPerformed
    
    private Fornecedor criaFornecedor() {
        String cnpj = inputCnpj.getText();
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
        
        return new Fornecedor(cnpj, nome, email, fone, new Endereco(cep, logradouro, bairro, cidade, uf, numero, complemento));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFormFornecedor;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel lbBairro;
    // End of variables declaration//GEN-END:variables
}
