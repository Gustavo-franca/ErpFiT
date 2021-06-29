package Desktop.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */

import View.enderecos.*;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;


public class MainMenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MainMenuView() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        pessoa = new javax.swing.JMenu();
        aluno = new javax.swing.JMenuItem();
        fornecedor = new javax.swing.JMenuItem();
        personal = new javax.swing.JMenuItem();
        mercadoria = new javax.swing.JMenu();
        servico = new javax.swing.JMenuItem();
        produto = new javax.swing.JMenuItem();
        endereco = new javax.swing.JMenu();
        bairro = new javax.swing.JMenuItem();
        cep = new javax.swing.JMenuItem();
        cidade = new javax.swing.JMenuItem();
        estado = new javax.swing.JMenuItem();
        country = new javax.swing.JMenuItem();
        movimentacao = new javax.swing.JMenu();
        venda = new javax.swing.JMenuItem();
        compra = new javax.swing.JMenuItem();
        geracaoDeMensalidades = new javax.swing.JMenuItem();
        contaAReceber = new javax.swing.JMenuItem();
        contaAPagar = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        faturamentoRelatorio = new javax.swing.JMenuItem();
        comprasRelatorio = new javax.swing.JMenuItem();
        pessoasRelatorio = new javax.swing.JMenu();
        alunosRelatorio = new javax.swing.JMenuItem();
        fornecedoresRelatorio = new javax.swing.JMenuItem();
        funcionariosRelatorio = new javax.swing.JMenuItem();
        contasRelatorio = new javax.swing.JMenu();
        pagarRelatorio = new javax.swing.JMenuItem();
        receberRelatorio = new javax.swing.JMenuItem();
        enderecoRelatorio = new javax.swing.JMenu();
        CepRelatorio = new javax.swing.JMenuItem();
        bairrosRelatorio = new javax.swing.JMenuItem();
        cidadeRelatorio = new javax.swing.JMenu();
        estadosRelatorio = new javax.swing.JMenuItem();
        paisesRelatorio = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 236, 0));

        jPanel1.setBackground(new java.awt.Color(255, 236, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 236, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cadastro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cadastro.setText("Cadastro");
        cadastro.setHideActionText(true);

        pessoa.setText("Pessoa");

        aluno.setText("Aluno");
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });
        pessoa.add(aluno);

        fornecedor.setText("Fornecedor");
        fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorActionPerformed(evt);
            }
        });
        pessoa.add(fornecedor);

        personal.setText("Personal");
        personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalActionPerformed(evt);
            }
        });
        pessoa.add(personal);

        cadastro.add(pessoa);

        mercadoria.setText("Mercadoria");

        servico.setText("serviço");
        servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicoActionPerformed(evt);
            }
        });
        mercadoria.add(servico);

        produto.setText("Produto");
        produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoActionPerformed(evt);
            }
        });
        mercadoria.add(produto);

        cadastro.add(mercadoria);

        endereco.setText("Endereço");

        bairro.setText("Bairro");
        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });
        endereco.add(bairro);

        cep.setText("CEP");
        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });
        endereco.add(cep);

        cidade.setText("Cidade");
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        endereco.add(cidade);

        estado.setText("Estado");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        endereco.add(estado);

        country.setText("País");
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });
        endereco.add(country);

        cadastro.add(endereco);

        jMenuBar1.add(cadastro);

        movimentacao.setText("Movimentação");

        venda.setText("Venda");
        movimentacao.add(venda);

        compra.setText("Compra");
        movimentacao.add(compra);

        geracaoDeMensalidades.setText("Geração de Mensalidades");
        movimentacao.add(geracaoDeMensalidades);

        contaAReceber.setText("Contas à Receber");
        movimentacao.add(contaAReceber);

        contaAPagar.setText("Contas à Pagar");
        movimentacao.add(contaAPagar);

        jMenuBar1.add(movimentacao);

        relatorios.setText("Relatórios");

        faturamentoRelatorio.setText("Faturamento");
        faturamentoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturamentoRelatorioActionPerformed(evt);
            }
        });
        relatorios.add(faturamentoRelatorio);

        comprasRelatorio.setText("Compras");
        relatorios.add(comprasRelatorio);

        pessoasRelatorio.setText("Pessoas");

        alunosRelatorio.setText("Alunos");
        pessoasRelatorio.add(alunosRelatorio);

        fornecedoresRelatorio.setText("Fornecedores");
        pessoasRelatorio.add(fornecedoresRelatorio);

        funcionariosRelatorio.setText("Funcionários");
        pessoasRelatorio.add(funcionariosRelatorio);

        relatorios.add(pessoasRelatorio);

        contasRelatorio.setText("Contas");

        pagarRelatorio.setText("Pagar");
        contasRelatorio.add(pagarRelatorio);

        receberRelatorio.setText("Receber");
        contasRelatorio.add(receberRelatorio);

        relatorios.add(contasRelatorio);

        enderecoRelatorio.setText("Endereço");

        CepRelatorio.setText("CEP");
        CepRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CepRelatorioActionPerformed(evt);
            }
        });
        enderecoRelatorio.add(CepRelatorio);

        bairrosRelatorio.setText("Bairros");
        enderecoRelatorio.add(bairrosRelatorio);

        cidadeRelatorio.setText("Cidades");
        enderecoRelatorio.add(cidadeRelatorio);

        estadosRelatorio.setText("Estados");
        enderecoRelatorio.add(estadosRelatorio);

        paisesRelatorio.setText("Países");
        enderecoRelatorio.add(paisesRelatorio);

        relatorios.add(enderecoRelatorio);

        jMenuBar1.add(relatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalActionPerformed

    }//GEN-LAST:event_personalActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
     
    }//GEN-LAST:event_bairroActionPerformed

    private void CepRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CepRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CepRelatorioActionPerformed

    private void faturamentoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturamentoRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faturamentoRelatorioActionPerformed

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_alunoActionPerformed

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_fornecedorActionPerformed

    private void servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicoActionPerformed

    }//GEN-LAST:event_servicoActionPerformed

    private void produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoActionPerformed
    
    }//GEN-LAST:event_produtoActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
    
    }//GEN-LAST:event_cepActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
   
    }//GEN-LAST:event_cidadeActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
      
    }//GEN-LAST:event_estadoActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
     
    }//GEN-LAST:event_countryActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuView().setVisible(true);
            }
        });
    }

    public void addActionListenerForCountry(ActionListener l ) {
        country.addActionListener(l);
    }
    public void addActionListenerForState(ActionListener l ) {
        state.addActionListener(l);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CepRelatorio;
    private javax.swing.JMenuItem aluno;
    private javax.swing.JMenuItem alunosRelatorio;
    private javax.swing.JMenuItem bairro;
    private javax.swing.JMenuItem bairrosRelatorio;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem cep;
    private javax.swing.JMenuItem cidade;
    private javax.swing.JMenu cidadeRelatorio;
    private javax.swing.JMenuItem compra;
    private javax.swing.JMenuItem comprasRelatorio;
    private javax.swing.JMenuItem contaAPagar;
    private javax.swing.JMenuItem contaAReceber;
    private javax.swing.JMenu contasRelatorio;
    private javax.swing.JMenuItem country;
    private javax.swing.JMenu endereco;
    private javax.swing.JMenu enderecoRelatorio;
    private javax.swing.JMenuItem estado;
    private javax.swing.JMenuItem estadosRelatorio;
    private javax.swing.JMenuItem faturamentoRelatorio;
    private javax.swing.JMenuItem fornecedor;
    private javax.swing.JMenuItem fornecedoresRelatorio;
    private javax.swing.JMenuItem funcionariosRelatorio;
    private javax.swing.JMenuItem geracaoDeMensalidades;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mercadoria;
    private javax.swing.JMenu movimentacao;
    private javax.swing.JMenuItem pagarRelatorio;
    private javax.swing.JMenuItem paisesRelatorio;
    private javax.swing.JMenuItem personal;
    private javax.swing.JMenu pessoa;
    private javax.swing.JMenu pessoasRelatorio;
    private javax.swing.JMenuItem produto;
    private javax.swing.JMenuItem receberRelatorio;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem servico;
    private javax.swing.JMenuItem venda;
    // End of variables declaration//GEN-END:variables
}
