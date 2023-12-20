package views.fornecedor;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.FornecedorController;
import models.fornecedor.Fornecedor;
import factory.ControllerFactory;
import models.fornecedor.Endereco;
import views.constants.Colors;
import views.constants.Fonts;
import static utils.Validator.validaString;

public class ListaFornecedor extends javax.swing.JInternalFrame {

  private final FornecedorController fornecedorController;
  private final ControllerFactory controllerFactory;
  private DefaultTableModel model;

  public ListaFornecedor(ControllerFactory controllerFactory) {
    this.fornecedorController = controllerFactory.createFornecedorController();
    this.controllerFactory = controllerFactory;
    initComponents();
  }

  private void preencheTabela(List<Fornecedor> fornecedores) {
    model.getDataVector().clear();

    if (fornecedores.isEmpty()) {
      tabelaFornecedores.repaint();
      return;
    }

    fornecedores.forEach(f -> model.addRow(new Object[]{f.getCnpj(), f.getNome(), f.getEmail(), f.getTelefone()}));
  }

  private Fornecedor getFornecedorSelecionado() {
    var linhaSelecionada = tabelaFornecedores.getSelectedRow();
    if (linhaSelecionada == -1 || linhaSelecionada >= model.getRowCount()) {
      throw new RuntimeException("Um fornecedor deve ser selecionado!");
    }
    var cnpj = (String) model.getValueAt(linhaSelecionada, 0);
    return fornecedorController.buscaPorCnpj(cnpj);
  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    title = new javax.swing.JLabel();
    jScrollPane = new javax.swing.JScrollPane();
    var fornecedores = fornecedorController.listaTodos();
    String[] columnNames = {
      "CNPJ",
      "Nome",
      "E-mail",
      "Telefone"
    };
    model = new DefaultTableModel(columnNames, 0) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    tabelaFornecedores = new javax.swing.JTable();
    btnDetalhes = new javax.swing.JButton();
    btnEdita = new javax.swing.JButton();
    btnExclui = new javax.swing.JButton();

    setBackground(Colors.BACKGROUND_COLOR);
    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Listagem de fornecedores");
    setMinimumSize(null);
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
    title.setText("Lista de Fornecedores");
    title.setMinimumSize(null);
    title.setPreferredSize(null);

    jScrollPane.setBackground(Colors.BACKGROUND_COLOR);
    jScrollPane.setMinimumSize(null);
    jScrollPane.setPreferredSize(null);

    tabelaFornecedores.setBackground(Colors.WHITE);
    tabelaFornecedores.setFont(Fonts.SMALL_FONT);
    tabelaFornecedores.setForeground(Colors.FONT_COLOR);
    tabelaFornecedores.setModel(model);
    tabelaFornecedores.setGridColor(Colors.FONT_COLOR);
    tabelaFornecedores.setIntercellSpacing(new java.awt.Dimension(5, 5));
    tabelaFornecedores.setMinimumSize(null);
    tabelaFornecedores.setPreferredSize(null);
    tabelaFornecedores.setRowHeight(25);
    tabelaFornecedores.setSelectionBackground(Colors.DARK_GREEN);
    tabelaFornecedores.setSelectionForeground(Colors.WHITE);
    tabelaFornecedores.setShowHorizontalLines(true);
    jScrollPane.setViewportView(tabelaFornecedores);
    preencheTabela(fornecedores);

    btnDetalhes.setBackground(Colors.GREEN);
    btnDetalhes.setFont(Fonts.MEDIUM_FONT);
    btnDetalhes.setForeground(Colors.WHITE);
    btnDetalhes.setText("Detalhes");
    btnDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDetalhesActionPerformed(evt);
      }
    });

    btnEdita.setBackground(Colors.BLUE);
    btnEdita.setFont(Fonts.MEDIUM_FONT);
    btnEdita.setForeground(Colors.WHITE);
    btnEdita.setText("Editar");
    btnEdita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnEdita.setMinimumSize(null);
    btnEdita.setPreferredSize(null);
    btnEdita.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditaActionPerformed(evt);
      }
    });

    btnExclui.setBackground(Colors.RED);
    btnExclui.setFont(Fonts.MEDIUM_FONT);
    btnExclui.setForeground(Colors.WHITE);
    btnExclui.setText("Excluir");
    btnExclui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnExclui.setMinimumSize(null);
    btnExclui.setPreferredSize(null);
    btnExclui.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcluiActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(45, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(45, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private String getEnderecoFormatado(Endereco endereco) {
    var str = endereco.logradouro() + ", ";

    str += validaString(endereco.numero()) ? endereco.numero() : "S/Nº";
    
    if (validaString(endereco.complemento()))
      str += " - " + endereco.complemento();

    str += ", bairro %s, %s - %s\nCEP: %s".formatted(endereco.bairro(), endereco.cidade(), endereco.uf(), endereco.cep());

    return str;
  }

  private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
    try {
      var fornecedor = getFornecedorSelecionado();
      var mensagem = """
                    Nome: %s
                    CNPJ: %s
                    E-mail: %s
                    Telefone: %s
                    Endereço:\n%s
                    """.formatted(fornecedor.getNome(), fornecedor.getCnpj(), fornecedor.getEmail(), fornecedor.getTelefone(), getEnderecoFormatado(fornecedor.getEndereco()));
      JOptionPane.showMessageDialog(this, mensagem, getTitle(), JOptionPane.PLAIN_MESSAGE);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar mostrar detalhes do fornecedor:\n%s", e.getMessage()),
        getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnDetalhesActionPerformed

  private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
    try {
      var fornecedor = getFornecedorSelecionado();
      var form = new FormularioFornecedor(controllerFactory, fornecedor);
      getDesktopPane().add(form);
      form.moveToFront();
      form.requestFocus();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar abrir tela de edição:\n%s", e.getMessage()),
        getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnEditaActionPerformed

  private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
    try {
      var fornecedor = getFornecedorSelecionado();
      String[] options = {"Sim", "Não"};

      int res = JOptionPane.showOptionDialog(this,
        String.format("Tem certeza que deseja excluir o fornecedor %s?",
          fornecedor.getNome()),
        getTitle(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
      if (res != 0) {
        return;
      }
      fornecedorController.exclui(fornecedor);
      preencheTabela(fornecedorController.listaTodos());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, String.format("Erro ao tentar excluir:\n%s", e.getMessage()),
        getTitle(), JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnExcluiActionPerformed

  private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    preencheTabela(fornecedorController.listaTodos());
  }//GEN-LAST:event_formInternalFrameActivated

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDetalhes;
  private javax.swing.JButton btnEdita;
  private javax.swing.JButton btnExclui;
  private javax.swing.JScrollPane jScrollPane;
  private javax.swing.JTable tabelaFornecedores;
  private javax.swing.JLabel title;
  // End of variables declaration//GEN-END:variables
}
