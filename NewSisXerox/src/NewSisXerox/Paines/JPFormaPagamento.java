/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Paines;

import NewSisXerox.Classes.Validador;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Formpgto;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class JPFormaPagamento extends javax.swing.JPanel {

//    private Formpgto formapagamento;
//    tabCadFormaPagamento tabformapagamento;

    public JPFormaPagamento() {
        initComponents();
//        tabformapagamento = new tabCadFormaPagamento();
//        jtlPagamento.setModel(tabformapagamento);
    }

    public void carregaTabela() {
//        try {
//            List l = GenericDAO.getInstance().getList(Formapagto.class,
//                    "SELECT f FROM Formapagto f order by f.dsForma");  // consulta no banco 
//            tabformapagamento.setDados(l);
//            jtlPagamento.updateUI();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela das Formas de Pagamento!" + "\n" + e.getMessage());
//        }
    }

    public void limparDados() {
        jtflPagamento.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscaFormaPagamento = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtlPagamento = new javax.swing.JTable();
        jbSelecionarlPagamento = new javax.swing.JButton();
        jlPagamento = new javax.swing.JLabel();
        jtflPagamento = new UpperCaseField();
        jbGravarlPagamento = new javax.swing.JButton();

        BuscaFormaPagamento.setTitle("Busca Forma de Pagamento");
        BuscaFormaPagamento.setMinimumSize(new java.awt.Dimension(500, 335));

        jtlPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtlPagamento);

        jbSelecionarlPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SisXerox/Imagens/selecionar - 16.png"))); // NOI18N
        jbSelecionarlPagamento.setText("Selecionar");
        jbSelecionarlPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarlPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscaFormaPagamentoLayout = new javax.swing.GroupLayout(BuscaFormaPagamento.getContentPane());
        BuscaFormaPagamento.getContentPane().setLayout(BuscaFormaPagamentoLayout);
        BuscaFormaPagamentoLayout.setHorizontalGroup(
            BuscaFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSelecionarlPagamento)
                .addContainerGap())
        );
        BuscaFormaPagamentoLayout.setVerticalGroup(
            BuscaFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaFormaPagamentoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSelecionarlPagamento)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jlPagamento.setText("Fgto Pagamento");

        jtflPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtflPagamentoKeyPressed(evt);
            }
        });

        jbGravarlPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravarlPagamento.setText("Gravar");
        jbGravarlPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarlPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtflPagamento)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jbGravarlPagamento)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPagamento)
                    .addComponent(jtflPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravarlPagamento)
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtflPagamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtflPagamentoKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            carregaTabela();
//            BuscaFormaPagamento.show();
//            BuscaFormaPagamento.setLocationRelativeTo(this);//seta a posição da tela 
//        }
    }//GEN-LAST:event_jtflPagamentoKeyPressed

    private void jbGravarlPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarlPagamentoActionPerformed
//        if (Validador.vldStringMinMax(jtflPagamento.getText(), 3, 50) == false) {
//            JOptionPane.showMessageDialog(this, "Informe a descrição da Forma de Pagamento!");
//            jtflPagamento.requestFocus();
//            return;
//        }
//        try {
//            if (formapagamento == null) {
//                formapagamento = new Formapagto();
//            }
//            formapagamento.setDsForma(jtflPagamento.getText());
//            GenericDAO.getInstance().startTransaction();
//            GenericDAO.getInstance().persist(formapagamento);
//            GenericDAO.getInstance().commit();
//            JOptionPane.showMessageDialog(null, "Forma de Pagamento " + jtflPagamento.getText() + " gravada com Sucesso!");
//            limparDados();
//
//        } catch (Exception ex) {
//            GenericDAO.getInstance().rollback();
//            JOptionPane.showMessageDialog(null, "Forma de Pagamento já existente!" + ex.getMessage());
//            limparDados();
//        }
//        jtflPagamento.requestFocus();
    }//GEN-LAST:event_jbGravarlPagamentoActionPerformed

    private void jbSelecionarlPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarlPagamentoActionPerformed
//        try {
//            pegando a opção selecionada na grade
//            formapagamento = (Formapagto) tabformapagamento.getDadoAt(jtlPagamento.getSelectedRow());
//            if (formapagamento != null) {
//                jtflPagamento.setText(formapagamento.getDsForma());
//                BuscaFormaPagamento.dispose();
//            }
//        } catch (Throwable t) {
//            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Forma de Pagamento!" + "\n" + t.getMessage());
//            limparDados();
//        }
    }//GEN-LAST:event_jbSelecionarlPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BuscaFormaPagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravarlPagamento;
    private javax.swing.JButton jbSelecionarlPagamento;
    private javax.swing.JLabel jlPagamento;
    private javax.swing.JTextField jtflPagamento;
    private javax.swing.JTable jtlPagamento;
    // End of variables declaration//GEN-END:variables
}
