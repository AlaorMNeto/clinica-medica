
package br.edu.imepac.paciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import java.util.Date;


public class TelaPaciente extends javax.swing.JFrame {
    

    
    
 private boolean isDataValida(String data) {
        try {
            String[] partes = data.split("/");
            if (partes.length != 3) {
                return false;
            }
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900 || ano > 2024) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
        
        
        
        
        
    
        
        
        
        
        
        
        
        
    }
 
 
 
 



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    
    
    
  
  private boolean isCpfValido(String cpf) {
      
        return cpf.matches("\\d{11}");
    }
  
  
  
  
  
  
  
 













 public TelaPaciente() {
        initComponents();
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Código para lidar com o clique na tabela, por exemplo:
            int linhaSelecionada = tblPacientes.getSelectedRow();
            if (linhaSelecionada != -1) {
                // Preenche os campos com os dados da linha selecionada
                txtNome.setText(tblPacientes.getValueAt(linhaSelecionada, 0).toString());
                txtCPF.setText(tblPacientes.getValueAt(linhaSelecionada, 1).toString());
                jFormattedTextFieldDataNascimento.setText(tblPacientes.getValueAt(linhaSelecionada, 2).toString());
                txtContato.setText(tblPacientes.getValueAt(linhaSelecionada, 3).toString());
            }
        }
    });
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtContato = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Gerenciamento de pacientes");

        tblPacientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Contato"
            }
        ));
        tblPacientes.setGridColor(new java.awt.Color(153, 153, 153));
        tblPacientes.setShowGrid(true);
        jScrollPane1.setViewportView(tblPacientes);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel5.setText("Contato:");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtContato)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnDeletar)
                    .addComponent(btnLimpar))
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
 String nome = txtNome.getText();
    String cpf = txtCPF.getText();
    String dataNascimento = jFormattedTextFieldDataNascimento.getText();
    System.out.println("Data de Nascimento: " + dataNascimento);
    String contato = txtContato.getText();
    
    
    cpf = cpf.replaceAll("[^\\d]", "");  // Remove tudo que não for número
    
    
    if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {  // Verifica se a data segue o formato dd/MM/yyyy
        JOptionPane.showMessageDialog(null, "Data de nascimento inválida. O formato deve ser dd/MM/yyyy.");
        return;  // Impede o cadastro se a data estiver inválida
    }
     if (cpf.length() != 11 || !isCpfValido(cpf)) {
        JOptionPane.showMessageDialog(null, "CPF inválido. O CPF deve conter 11 dígitos numéricos.");
        return;  // Impede o cadastro se o CPF estiver inválido
    }
    
    
    
DefaultTableModel modelo = (DefaultTableModel) tblPacientes.getModel();
    modelo.addRow(new Object[] { nome, cpf, dataNascimento, contato });
    
    
  txtNome.setText("");
    txtCPF.setText("");
    jFormattedTextFieldDataNascimento.setText("");
    txtContato.setText("");
 
// TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    
    
    
    
    
    
    
    
    
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCPF.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        txtContato.setText("");// TODO add your handling code here:
        
        
        
       DefaultTableModel modelo = (DefaultTableModel) tblPacientes.getModel();
    modelo.setRowCount(0);  // Remove todas as linhas da tabela  
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnLimparActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblPacientes.getModel();
        int linhaSelecionada = tblPacientes.getSelectedRow();

        if (linhaSelecionada != -1) {
            modelo.removeRow(linhaSelecionada);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para deletar.");
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       int linhaSelecionada = tblPacientes.getSelectedRow();

    // Verifica se uma linha foi selecionada
    if (linhaSelecionada != -1) {
        // Pega os dados inseridos nos campos de texto
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String dataNascimento = jFormattedTextFieldDataNascimento.getText();
        String contato = txtContato.getText();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        // Verifica se a data de nascimento é válida
        if (!isDataValida(dataNascimento)) {
            JOptionPane.showMessageDialog(null, "Data de nascimento inválida. O formato deve ser dd/MM/yyyy.");
            return;  // Impede a atualização se a data estiver inválida
        }

        // Verifica se o CPF é válido
        if (cpf.length() != 11 || !isCpfValido(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido. O CPF deve conter 11 dígitos numéricos.");
            return;  // Impede a atualização se o CPF estiver inválido
        }
        
        
        

        // Atualiza os dados na tabela
        DefaultTableModel modelo = (DefaultTableModel) tblPacientes.getModel();
        modelo.setValueAt(nome, linhaSelecionada, 0);           // Atualiza o nome
        modelo.setValueAt(cpf, linhaSelecionada, 1);            // Atualiza o CPF
        modelo.setValueAt(dataNascimento, linhaSelecionada, 2); // Atualiza a data de nascimento
        modelo.setValueAt(contato, linhaSelecionada, 3);        // Atualiza o contato

        // Limpa os campos de entrada
        
        
        
        txtNome.setText("");
        txtCPF.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        txtContato.setText("");

        // Exibe mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso!");
    } else {
        // Caso nenhuma linha tenha sido selecionada
        JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar.");
    }   
    }//GEN-LAST:event_btnAtualizarActionPerformed
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
