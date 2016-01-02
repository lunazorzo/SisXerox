/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Paines;

import NewSisXerox.Classes.Validador;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.DAO.GenericDAO;
import javax.swing.JOptionPane;
import NewSisXerox.Entity.Unidade;
import NewSisXerox.Tabelas.tabUnidade;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Allan
 */
public class JPUnidade extends javax.swing.JPanel {

    /**
     * Creates new form JPInstituica
     */
    private Unidade unidade;
    private tabUnidade tabunidade;

    public JPUnidade() {
        initComponents();
        tabunidade = new tabUnidade();
        jtBusca.setModel(tabunidade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void limparDados() {
        jtfUnidade.setText("");
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Unidade.class,
                    "FROM Unidade nmUnidade");  // consulta no banco
            tabunidade.setDados(l);
            jtBusca.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a tabela Unidade de Medida!" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jlInstituicao = new javax.swing.JLabel();
        jtfUnidade = new UpperCaseField();
        jbGravar = new javax.swing.JButton();

        Busca.setTitle("Busca");
        Busca.setMinimumSize(new java.awt.Dimension(500, 335));

        jtBusca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtBusca);

        jbSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/selecionar - 16.png"))); // NOI18N
        jbSelecionar.setText("Selecionar");
        jbSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscaLayout = new javax.swing.GroupLayout(Busca.getContentPane());
        Busca.getContentPane().setLayout(BuscaLayout);
        BuscaLayout.setHorizontalGroup(
            BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSelecionar)
                .addContainerGap())
        );
        BuscaLayout.setVerticalGroup(
            BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSelecionar)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        setPreferredSize(new java.awt.Dimension(377, 81));

        jlInstituicao.setText("Unidade Medida:");

        jtfUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUnidadeKeyPressed(evt);
            }
        });

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGravar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlInstituicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInstituicao)
                    .addComponent(jtfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
        if (Validador.vldStringMinMax(jtfUnidade.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a descriçãod a Unidade de Medida!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jtfUnidade.requestFocus();
            return;
        }

        try {

            if (unidade == null) {
                unidade = new Unidade();
            }
            unidade.setNmUnidade(jtfUnidade.getText());
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().persist(unidade);
            GenericDAO.getInstance().flush();
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Unidade de Medida " + jtfUnidade.getText() + " gravada com Sucesso!");
            limparDados();
        } catch (Exception ex) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Unidade de Medida já existente!" + ex.getMessage());
            limparDados();
        }
        jtfUnidade.requestFocus();
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jtfUnidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUnidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfUnidadeKeyPressed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            unidade = (Unidade) tabunidade.getDadoAt(jtBusca.getSelectedRow());
            if (unidade != null) {
                jtfUnidade.setText(unidade.getNmUnidade());
                Busca.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Instituição!" + "\n" + t.getMessage());
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JLabel jlInstituicao;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfUnidade;
    // End of variables declaration//GEN-END:variables
}
