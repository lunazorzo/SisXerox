/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Aluno;
import NewSisXerox.Entity.Formpgto;
import NewSisXerox.Entity.Produto;
import NewSisXerox.Entity.Venda;
import NewSisXerox.Tabelas.tabAlunoVenda;
import NewSisXerox.Tabelas.tabProdutoVenda;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nobre Sistemas
 */
public final class JIFVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFVenda
     */
    private Venda venda;
    private Aluno aluno;
    private Produto produto;
    private final tabAlunoVenda tabalunovenda;
    private final tabProdutoVenda tabprodutovenda;
    
    public JIFVenda() {
        initComponents();
        carregaComboFormaPgto();
        //Aluno
        tabalunovenda = new tabAlunoVenda();
        jtBuscaAluno.setModel(tabalunovenda);
        //Produto
        tabprodutovenda = new tabProdutoVenda();
        jtBuscaProduto.setModel(tabprodutovenda);
        //Carrega data do dia
        jdData.setDate(new java.util.Date());
    }
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    public void carregaTabelaAluno() {
        try {
            List l = GenericDAO.getInstance().getList(Aluno.class,
                    "FROM Aluno i order by i.nmAluno");  // consulta no banco
            System.err.println(l);
            tabalunovenda.setDados(l);
            jtBuscaAluno.updateUI();
            jtBuscaAluno.setAutoCreateRowSorter(true);//quando clicado no campo da tabela o mesmo será ordenado
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar os Alunos!" + e.getMessage());
        }
    }
    
    public void carregaTabelaProduto() {
        try {
            List l = GenericDAO.getInstance().getList(Produto.class,
                    "FROM Produto i order by i.nmProduto");  // consulta no banco
            System.err.println(l);
            tabprodutovenda.setDados(l);
            jtBuscaProduto.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os Produtos!" + "\n" + e.getMessage());
        }
    }
    
    public void carregaComboFormaPgto() {
        jcFgtoPagamento.removeAllItems();//removendo tds os itens da combo
        jcFgtoPagamento.addItem(null);
        try {
            List<Formpgto> lstist = GenericDAO.getInstance().getList(Formpgto.class,
                    "FROM Formpgto c order by c.nmFormpgto");
            for (Formpgto a : lstist) {
                jcFgtoPagamento.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as Formas de Pagamento!" + "\n" + e.getMessage());
        }
    }
    
    public void limparDados() {
        jtfAluno.setText("");
        jtfRA.setText("");
        jtfSaldo.setText("");
        jtfProduto.setText("");
        jtfValor.setText("");
        jtfQuantidade.setText("");
        jcFgtoPagamento.setSelectedItem(null);
        jtfTLProduto.setText("");
        jtfDesconto.setText("");
        jtfTotal.setText("");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscaAluno = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBuscaAluno = new javax.swing.JTable();
        jbSelecionarAluno = new javax.swing.JButton();
        BuscaProduto = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBuscaProduto = new javax.swing.JTable();
        jbSelecionarProduto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfAluno = new javax.swing.JTextField();
        jtfRA = new javax.swing.JTextField();
        jtfSaldo = new javax.swing.JTextField();
        jdData = new com.toedter.calendar.JDateChooser();
        jlData = new javax.swing.JLabel();
        jbFinalizarCompra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtfProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jbAdicionar = new javax.swing.JButton();
        jbtRemover = new javax.swing.JButton();
        jtfValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfTLProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcFgtoPagamento = new javax.swing.JComboBox();

        BuscaAluno.setTitle("Busca");
        BuscaAluno.setMinimumSize(new java.awt.Dimension(500, 335));

        jtBuscaAluno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtBuscaAluno);

        jbSelecionarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/selecionar - 16.png"))); // NOI18N
        jbSelecionarAluno.setText("Selecionar");
        jbSelecionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscaAlunoLayout = new javax.swing.GroupLayout(BuscaAluno.getContentPane());
        BuscaAluno.getContentPane().setLayout(BuscaAlunoLayout);
        BuscaAlunoLayout.setHorizontalGroup(
            BuscaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSelecionarAluno)
                .addContainerGap())
        );
        BuscaAlunoLayout.setVerticalGroup(
            BuscaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaAlunoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSelecionarAluno)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        BuscaProduto.setTitle("Busca");
        BuscaProduto.setMinimumSize(new java.awt.Dimension(500, 335));

        jtBuscaProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtBuscaProduto);

        jbSelecionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/selecionar - 16.png"))); // NOI18N
        jbSelecionarProduto.setText("Selecionar");
        jbSelecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscaProdutoLayout = new javax.swing.GroupLayout(BuscaProduto.getContentPane());
        BuscaProduto.getContentPane().setLayout(BuscaProdutoLayout);
        BuscaProdutoLayout.setHorizontalGroup(
            BuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSelecionarProduto)
                .addContainerGap())
        );
        BuscaProdutoLayout.setVerticalGroup(
            BuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaProdutoLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSelecionarProduto)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("RA:");

        jLabel3.setText("Saldo:");

        jtfAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfAlunoKeyPressed(evt);
            }
        });

        jtfRA.setEnabled(false);
        jtfRA.setOpaque(false);

        jtfSaldo.setEnabled(false);
        jtfSaldo.setOpaque(false);

        jdData.setEnabled(false);

        jlData.setText("Data Cadastro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jtfRA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdData, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfSaldo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jtfRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jbFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/basket-full.png"))); // NOI18N
        jbFinalizarCompra.setText("Finalizar Venda");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Produto:");

        jtfProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfProdutoKeyPressed(evt);
            }
        });

        jLabel5.setText("Qtde.:");

        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/basket-add.png"))); // NOI18N
        jbAdicionar.setText("Adicionar");

        jbtRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/basket-remove.png"))); // NOI18N
        jbtRemover.setText("Remover");

        jtfValor.setEditable(false);
        jtfValor.setOpaque(false);

        jLabel6.setText("Valor:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtRemover)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfQuantidade)
                    .addComponent(jbAdicionar)
                    .addComponent(jbtRemover)
                    .addComponent(jtfValor)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jLabel7.setText("Total Produto:");

        jtfTLProduto.setEditable(false);
        jtfTLProduto.setEnabled(false);

        jLabel8.setText("Desconto:");

        jLabel9.setText("Total:");

        jtfTotal.setEnabled(false);

        jLabel10.setText("Fgto Pag.:");

        jcFgtoPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcFgtoPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTLProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFinalizarCompra)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jtfTLProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jcFgtoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbFinalizarCompra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAlunoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabelaAluno();
            BuscaAluno.show();
            BuscaAluno.setLocationRelativeTo(this);//seta a posição da tela
        }
    }//GEN-LAST:event_jtfAlunoKeyPressed

    private void jbSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarAlunoActionPerformed
        try {
            //pegando a opção selecionada na grade
            aluno = (Aluno) tabalunovenda.getDadoAt(jtBuscaAluno.getSelectedRow());
            if (aluno != null) {
                jtfAluno.setText(aluno.getNmAluno());
                jtfRA.setText(aluno.getRaAluno());
                jtfSaldo.setText(aluno.getVlSaldo().toString().replace(".", ","));
                BuscaAluno.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o Aluno!" + "\n" + t.getMessage());
        }
    }//GEN-LAST:event_jbSelecionarAlunoActionPerformed

    private void jtfProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabelaProduto();
            BuscaProduto.show();
            BuscaProduto.setLocationRelativeTo(this);//seta a posição da tela
        }
    }//GEN-LAST:event_jtfProdutoKeyPressed

    private void jbSelecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarProdutoActionPerformed
        try {
            //pegando a opção selecionada na grade
            produto = (Produto) tabprodutovenda.getDadoAt(jtBuscaProduto.getSelectedRow());
            if (produto != null) {
                jtfProduto.setText(produto.getNmProduto());
                jtfValor.setText(produto.getVlVenda().toString().replace(".", ","));
                BuscaProduto.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Produto!" + "\n" + t.getMessage());
        }
    }//GEN-LAST:event_jbSelecionarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BuscaAluno;
    private javax.swing.JDialog BuscaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbFinalizarCompra;
    private javax.swing.JButton jbSelecionarAluno;
    private javax.swing.JButton jbSelecionarProduto;
    private javax.swing.JButton jbtRemover;
    private javax.swing.JComboBox jcFgtoPagamento;
    private com.toedter.calendar.JDateChooser jdData;
    private javax.swing.JLabel jlData;
    private javax.swing.JTable jtBuscaAluno;
    private javax.swing.JTable jtBuscaProduto;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfProduto;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfRA;
    private javax.swing.JTextField jtfSaldo;
    private javax.swing.JTextField jtfTLProduto;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
