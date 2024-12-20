
package br.edu.imepac.consulta;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class TelaConsulta extends javax.swing.JFrame {
 private Random randomGenerator = new Random();  // Gerador de números aleatórios
    
    public TelaConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultTableModel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        consultaIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        dataFormattedTextField = new javax.swing.JFormattedTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DefaultTableModel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DefaultTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Consulta", "Nome", "Data", "Status"
            }
        ));
        DefaultTableModel.setShowGrid(true);
        jScrollPane1.setViewportView(DefaultTableModel);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Gerenciamento de consultas");

        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("Atualizar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setText("Limpar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel2.setText("ID Consulta:");

        consultaIdTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaIdTextField.setText("Gerado Auto");
        consultaIdTextField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel4.setText("Data:");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel5.setText("Status:");

        nomeTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        try {
            dataFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        statusComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativa", "Concluida", " " }));

        jButton6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton6.setText("Cadastrar");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultaIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(140, 140, 140)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(consultaIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  int selectedRow = DefaultTableModel.getSelectedRow();
    
    // Se uma linha foi selecionada
    if (selectedRow != -1) {
        // Obtém os valores dos campos de entrada
        String idConsulta = consultaIdTextField.getText();
        String nomePaciente = nomeTextField.getText();
        String dataConsulta = dataFormattedTextField.getText();
        String statusConsulta = (String) statusComboBox.getSelectedItem();
        
        // Atualiza os valores da tabela na linha selecionada
        DefaultTableModel model = (DefaultTableModel) DefaultTableModel.getModel();
        model.setValueAt(idConsulta, selectedRow, 0);  // Atualiza o ID
        model.setValueAt(nomePaciente, selectedRow, 1);  // Atualiza o Nome
        model.setValueAt(dataConsulta, selectedRow, 2);  // Atualiza a Data
        model.setValueAt(statusConsulta, selectedRow, 3);  // Atualiza o Status
        
        // Exibe uma mensagem informando que os dados foram atualizados
        JOptionPane.showMessageDialog(null, "Consulta atualizada com sucesso!");
    } else {
        // Se nenhuma linha foi selecionada, mostra um aviso
        JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar.");
    }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  // Limpar os campos de texto
    consultaIdTextField.setText("");          // Limpa o campo ID
    nomeTextField.setText("");        // Limpa o campo Nome
    dataFormattedTextField.setText("");        // Limpa o campo Data
    statusComboBox.setSelectedItem(null);      // Limpa o campo Status

    // Limpar a seleção da tabela
    DefaultTableModel.clearSelection();  // Limpa qualquer linha selecionada na tabela
    
    // Reposiciona o foco no primeiro campo de texto
    consultaIdTextField.requestFocus();
    
    // Exibe uma mensagem para o usuário informando que os campos foram limpos
    JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
    
    
    
    
    
    
    
    
    
    
    // Pergunta ao usuário se ele deseja excluir todas as consultas, incluindo as ativas
    int resposta = JOptionPane.showConfirmDialog(null, 
        "Deseja excluir também as consultas ativas?", 
        "Confirmar Exclusão", 
        JOptionPane.YES_NO_OPTION);

    // Limpar os campos de texto
    consultaIdTextField.setText("");            // Limpa o campo ID
    nomeTextField.setText("");                  // Limpa o campo Nome
    dataFormattedTextField.setText("");         // Limpa o campo Data
    statusComboBox.setSelectedItem(null);       // Limpa a seleção do campo Status (ComboBox)

    // Obter o modelo da tabela
    DefaultTableModel modelo = (DefaultTableModel) DefaultTableModel.getModel();

    // Caso o usuário tenha aceitado excluir as consultas ativas
    if (resposta == JOptionPane.YES_OPTION) {
        modelo.setRowCount(0); // Exclui todas as consultas (ativas e concluídas)
    } else {
        // Caso contrário, exclui somente as consultas concluídas
        int linhas = modelo.getRowCount();
        for (int i = linhas - 1; i >= 0; i--) {
            // Verificar o status da consulta (por exemplo, se o status é "Ativa")
            String status = modelo.getValueAt(i, 3).toString();  // Supondo que o status esteja na coluna 3
            if (!status.equalsIgnoreCase("Ativa")) {
                modelo.removeRow(i);  // Remove a linha se a consulta não for ativa
            }
        }
    }

    // Exibe uma mensagem para o usuário informando que as consultas foram excluídas
    JOptionPane.showMessageDialog(null, "Consultas excluídas com sucesso!");
    
    
    
    
    
    
    
    
    
    
    
    
















        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   // Obter o nome do paciente
    String nomePaciente = nomeTextField.getText();

    
    
    // Obter a data da consulta
    String dataConsulta = dataFormattedTextField.getText();

    
    
    // Obter o status da consulta
    String statusConsulta = (String) statusComboBox.getSelectedItem();

    
    
    
    // Gerar o ID automaticamente
String idConsulta = String.format("%06d", randomGenerator.nextInt(1000000)); // Gera um número aleatório de 6 dígitos
        consultaIdTextField.setText(idConsulta); // Coloca o ID gerado no JTextField

    
    
    
    // Adicionar dados na JTable
    DefaultTableModel model = (DefaultTableModel) DefaultTableModel.getModel();
    model.insertRow(0, new Object[]{idConsulta, nomePaciente, dataConsulta, statusConsulta});

    
   
    
    
    
    
    
    DefaultTableModel.getSelectionModel().addListSelectionListener(e -> {
    // Verifica se há uma linha selecionada
    int selectedRow = DefaultTableModel.getSelectedRow();
    if (selectedRow != -1) {
        // Pega os valores da linha selecionada e preenche nos campos
        consultaIdTextField.setText(DefaultTableModel.getValueAt(selectedRow, 0).toString());
        nomeTextField.setText(DefaultTableModel.getValueAt(selectedRow, 1).toString());
        dataFormattedTextField.setText(DefaultTableModel.getValueAt(selectedRow, 2).toString());
        statusComboBox.setSelectedItem(DefaultTableModel.getValueAt(selectedRow, 3).toString());
    }
});
    
    
    
    
  
    
 

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Limpar campos de entrada após o cadastro
    nomeTextField.setText("");
    dataFormattedTextField.setText("");
    statusComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 // Verifica se há uma linha selecionada na tabela
    int selectedRow = DefaultTableModel.getSelectedRow();
    
    // Se uma linha foi selecionada
    if (selectedRow != -1) {
        // Obtém o status da consulta da tabela na linha selecionada (coluna 3 é o status)
        String statusConsulta = (String) DefaultTableModel.getValueAt(selectedRow, 3);
        
        // Verifica se a consulta está ativa
        if ("Ativa".equals(statusConsulta)) {
            // Exibe mensagem para o Administrador confirmar a exclusão
            int resposta = JOptionPane.showConfirmDialog(null, 
                "Consulta ativa! Somente Administradores podem excluir. Deseja continuar?", 
                "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            
            // Se o Administrador confirmar, a linha será excluída
            if (resposta == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) DefaultTableModel.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso!");
            }
        } else {
            // Se a consulta não estiver ativa, exclui normalmente
            DefaultTableModel model = (DefaultTableModel) DefaultTableModel.getModel();
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso!");
        }
    } else {
        // Se nenhuma linha foi selecionada, mostra um aviso
        JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir.");
    }













        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DefaultTableModel;
    private javax.swing.JTextField consultaIdTextField;
    private javax.swing.JFormattedTextField dataFormattedTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
