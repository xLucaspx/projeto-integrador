package views.fornecedor;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.FornecedorController;
import models.fornecedor.Fornecedor;
import factory.ControllerFactory;
import views.constants.Colors;
import views.constants.Fonts;

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

    jLabel1 = new javax.swing.JLabel();
    btnExclui = new javax.swing.JButton();
    btnEdita = new javax.swing.JButton();
    btnSeleciona = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
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

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Listagem de fornecedores");
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

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel1.setText("Lista de Fornecedores");

    btnExclui.setText("excluir");
    btnExclui.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcluiActionPerformed(evt);
      }
    });

    btnEdita.setText("editar");
    btnEdita.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditaActionPerformed(evt);
      }
    });

    btnSeleciona.setText("detalhes");
    btnSeleciona.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDetalhesActionPerformed(evt);
      }
    });

    tabelaFornecedores.setBackground(Colors.WHITE);
    tabelaFornecedores.setFont(Fonts.SMALL_FONT);
    tabelaFornecedores.setForeground(Colors.FONT_COLOR);
    tabelaFornecedores.setModel(model);
    tabelaFornecedores.setGridColor(Colors.FONT_COLOR);
    tabelaFornecedores.setIntercellSpacing(new java.awt.Dimension(5, 5));
    tabelaFornecedores.setSelectionBackground(Colors.DARK_GREEN);
    tabelaFornecedores.setSelectionForeground(Colors.WHITE);
    tabelaFornecedores.setShowHorizontalLines(true);
    jScrollPane2.setViewportView(tabelaFornecedores);
    preencheTabela(fornecedores);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(50, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(204, 204, 204)
            .addComponent(jLabel1)))
        .addContainerGap(50, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(35, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(btnSeleciona)
            .addGap(51, 51, 51)
            .addComponent(btnEdita)
            .addGap(56, 56, 56)
            .addComponent(btnExclui))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(50, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
    try {
      var fornecedor = getFornecedorSelecionado();
      var mensagem = """
                    Nome: %s
                    CNPJ: %s
                    e-mail: %s
                    Telefone: %s
                    Endereço: %s
                    """.formatted(fornecedor.getNome(), fornecedor.getCnpj(), fornecedor.getEmail(), fornecedor.getTelefone(), fornecedor.getEndereco());
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
  private javax.swing.JButton btnEdita;
  private javax.swing.JButton btnExclui;
  private javax.swing.JButton btnSeleciona;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable tabelaFornecedores;
  // End of variables declaration//GEN-END:variables
}
