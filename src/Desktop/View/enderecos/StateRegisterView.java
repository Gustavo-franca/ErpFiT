package View.enderecos;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class StateRegisterView extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastroDeEstado
     */
    public StateRegisterView() {
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

        jPanelTitulo = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        JLabelEstado = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxCountries = new javax.swing.JComboBox<>();
        JLabelEstado1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBUscar = new javax.swing.JButton();
        jButtonSAir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(255, 236, 0));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(699, 75));

        jTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(1, 1, 1));
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("Estado");
        jTitulo.setToolTipText("");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelTitulo, java.awt.BorderLayout.NORTH);

        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLabelEstado.setText("Nome do Estado:");

        jLabelPais.setText("Pais");

        jTextFieldNome.setCaretColor(new java.awt.Color(255, 236, 0));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxCountries.setToolTipText("");

        JLabelEstado1.setText("Id ");

        jTextFieldId.setCaretColor(new java.awt.Color(255, 236, 0));
        jTextFieldId.setEnabled(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelEstado)
                            .addComponent(jLabelPais)
                            .addComponent(jComboBoxCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(JLabelEstado1)
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 384, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelEstado1)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCountries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDados, java.awt.BorderLayout.CENTER);

        jPanelBotoes.setBackground(new java.awt.Color(255, 236, 0));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setPreferredSize(new java.awt.Dimension(699, 75));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        jPanelBotoes.setLayout(flowLayout1);

        jButtonNovo.setBackground(new java.awt.Color(254, 254, 254));
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("");
        jButtonNovo.setAlignmentY(0.0F);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 50));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonCancelar.setBackground(new java.awt.Color(254, 254, 254));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("");
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(100, 50));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCancelar);

        jButtonGravar.setBackground(new java.awt.Color(254, 254, 254));
        jButtonGravar.setText("Gravar");
        jButtonGravar.setToolTipText("");
        jButtonGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(100, 50));
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonGravar);

        jButtonBUscar.setBackground(new java.awt.Color(254, 254, 254));
        jButtonBUscar.setText("Buscar");
        jButtonBUscar.setToolTipText("");
        jButtonBUscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBUscar.setPreferredSize(new java.awt.Dimension(100, 50));
        jButtonBUscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUscarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonBUscar);

        jButtonSAir.setBackground(new java.awt.Color(254, 254, 254));
        jButtonSAir.setText("Sair");
        jButtonSAir.setToolTipText("");
        jButtonSAir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSAir.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanelBotoes.add(jButtonSAir);

        getContentPane().add(jPanelBotoes, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonBUscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUscarActionPerformed

    }//GEN-LAST:event_jButtonBUscarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

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
            java.util.logging.Logger.getLogger(StateRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StateRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StateRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StateRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StateRegisterView().setVisible(true);
            }
        });
    }

    public JButton getjButtonBuscar() {
        return jButtonBUscar;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSAir;
    }

    public JComboBox<String> getjComboBoxPaises() {
        return jComboBoxCountries;
    }

    public JTextField getTextInputId() {
        return jTextFieldId;
    }

    public JTextField getTextInputNome() {
        return jTextFieldNome;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelEstado;
    private javax.swing.JLabel JLabelEstado1;
    private javax.swing.JButton jButtonBUscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSAir;
    private javax.swing.JComboBox<String> jComboBoxCountries;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}