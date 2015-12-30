/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import NewSisXerox.Classes.ClasseImagem;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Allan
 */
public class JFPrincipal extends javax.swing.JFrame {

    JIFEmpresa empresa;
    JIFInstituicao instituicao;
    JIFUnidade unidade;
    JIFMarcaModelo marca;
    JIFUsuario usuario;
    JIFAluno aluno;
    JIFRecarga recarga;
    JIFFormaTipoPagto pgto;
    JIFVenda venda;

    public JFPrincipal() {
        try {
//            Pega o padrao do windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //UIManager.put( "WindowsFocus", new Color(  140, 42, 42  ) );
        initComponents();
        URL url = this.getClass().getResource("/NewSisXerox/Imagens/Icone-64.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new ClasseImagem("/NewSisXerox/Imagens/Brazil_Flag.jpg");
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator0 = new javax.swing.JToolBar.Separator();
        Usuário = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        Dia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        Hora = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        jmAluno = new javax.swing.JMenuItem();
        jmCursoInstituicao = new javax.swing.JMenuItem();
        jmEmpresa = new javax.swing.JMenuItem();
        jmFormTPPgto = new javax.swing.JMenuItem();
        jmMarcaModelo = new javax.swing.JMenuItem();
        jmUsuarios = new javax.swing.JMenuItem();
        jmUnidadeMedida = new javax.swing.JMenuItem();
        Utilitarios = new javax.swing.JMenu();
        jmRecarga = new javax.swing.JMenuItem();
        jmVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Xerox");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToolBar1.setDoubleBuffered(true);
        jToolBar1.setEnabled(false);
        jToolBar1.setOpaque(false);
        jToolBar1.setRequestFocusEnabled(false);
        jToolBar1.setVerifyInputWhenFocusTarget(false);
        jToolBar1.add(jSeparator0);

        Usuário.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuário.setForeground(java.awt.Color.white);
        Usuário.setText("Usuário");
        jToolBar1.add(Usuário);
        jToolBar1.add(jSeparator1);

        Dia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dia.setForeground(java.awt.Color.white);
        Dia.setText("Dia");
        jToolBar1.add(Dia);
        jToolBar1.add(jSeparator2);

        Hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Hora.setForeground(java.awt.Color.white);
        Hora.setText("Hora");
        jToolBar1.add(Hora);
        jToolBar1.add(jSeparator3);

        Desktop.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addGap(0, 340, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Cadastros.setText("Cadastros");

        jmAluno.setText("Aluno");
        jmAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlunoActionPerformed(evt);
            }
        });
        Cadastros.add(jmAluno);

        jmCursoInstituicao.setText("Curso/Instituição");
        jmCursoInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCursoInstituicaoActionPerformed(evt);
            }
        });
        Cadastros.add(jmCursoInstituicao);

        jmEmpresa.setText("Empresa");
        jmEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpresaActionPerformed(evt);
            }
        });
        Cadastros.add(jmEmpresa);

        jmFormTPPgto.setText("Forma / Tipo Pgto");
        jmFormTPPgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormTPPgtoActionPerformed(evt);
            }
        });
        Cadastros.add(jmFormTPPgto);

        jmMarcaModelo.setText("Marca/Modelo");
        jmMarcaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMarcaModeloActionPerformed(evt);
            }
        });
        Cadastros.add(jmMarcaModelo);

        jmUsuarios.setText("Usuários");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        Cadastros.add(jmUsuarios);

        jmUnidadeMedida.setText("Unidade de Medida");
        jmUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUnidadeMedidaActionPerformed(evt);
            }
        });
        Cadastros.add(jmUnidadeMedida);

        jMenuBar1.add(Cadastros);

        Utilitarios.setText("Utilitários");

        jmRecarga.setText("Recarga");
        jmRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRecargaActionPerformed(evt);
            }
        });
        Utilitarios.add(jmRecarga);

        jmVenda.setText("Venda");
        jmVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVendaActionPerformed(evt);
            }
        });
        Utilitarios.add(jmVenda);

        jMenuBar1.add(Utilitarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpresaActionPerformed
        try {
            if (evt.getSource() == jmEmpresa) {
                if (empresa == null) {
                    empresa = new JIFEmpresa();
                    Desktop.add(empresa);
                    empresa.setVisible(true);
                    empresa.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(empresa);
            }
            if (empresa.isClosed()) {
                empresa = new JIFEmpresa();
                Desktop.add(empresa);
                empresa.setVisible(true);
                empresa.setPosicao();//Seta centralizado
                Desktop.moveToFront(empresa);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir tela de Configurações" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmEmpresaActionPerformed

    private void jmCursoInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCursoInstituicaoActionPerformed
        try {
            if (evt.getSource() == jmCursoInstituicao) {
                if (instituicao == null) {
                    instituicao = new JIFInstituicao();
                    Desktop.add(instituicao);
                    instituicao.setVisible(true);
                    instituicao.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(instituicao);
            }
            if (instituicao.isClosed()) {
                instituicao = new JIFInstituicao();
                Desktop.add(instituicao);
                instituicao.setVisible(true);
                instituicao.setPosicao();//Seta centralizado
                Desktop.moveToFront(instituicao);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir tela da Instituição" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmCursoInstituicaoActionPerformed

    private void jmUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUnidadeMedidaActionPerformed
        try {
            if (evt.getSource() == jmUnidadeMedida) {
                if (unidade == null) {
                    unidade = new JIFUnidade();
                    Desktop.add(unidade);
                    unidade.setVisible(true);
                    unidade.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(unidade);
            }
            if (unidade.isClosed()) {
                unidade = new JIFUnidade();
                Desktop.add(unidade);
                unidade.setVisible(true);
                unidade.setPosicao();//Seta centralizado
                Desktop.moveToFront(unidade);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela Unidade Medida" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmUnidadeMedidaActionPerformed

    private void jmMarcaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMarcaModeloActionPerformed
        try {
            if (evt.getSource() == jmMarcaModelo) {
                if (marca == null) {
                    marca = new JIFMarcaModelo();
                    Desktop.add(marca);
                    marca.setVisible(true);
                    marca.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(unidade);
            }
            if (marca.isClosed()) {
                marca = new JIFMarcaModelo();
                Desktop.add(marca);
                marca.setVisible(true);
                marca.setPosicao();//Seta centralizado
                Desktop.moveToFront(marca);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela Marca/Modelo" + "\n" + e.getMessage());
        }

    }//GEN-LAST:event_jmMarcaModeloActionPerformed

    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        try {
            if (evt.getSource() == jmUsuarios) {
                if (usuario == null) {
                    usuario = new JIFUsuario();
                    Desktop.add(usuario);
                    usuario.setVisible(true);
                    usuario.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(usuario);
            }
            if (usuario.isClosed()) {
                usuario = new JIFUsuario();
                Desktop.add(usuario);
                usuario.setVisible(true);
                usuario.setPosicao();//Seta centralizado
                Desktop.moveToFront(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Usuários" + "\n" + e.getMessage());
        }
//        JIFUsuario a = null;
//        try {
//            a = new JIFUsuario();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Não foi possível abrir Cadastro Aluno" + "/n" + e.getMessage());
//        }
//        Desktop.add(a);
//        a.setPosicao();
//        a.setVisible(true);
    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jmAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlunoActionPerformed
        try {
            if (evt.getSource() == jmAluno) {
                if (aluno == null) {
                    aluno = new JIFAluno();
                    Desktop.add(aluno);
                    aluno.setVisible(true);
                    aluno.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(aluno);
            }
            if (aluno.isClosed()) {
                aluno = new JIFAluno();
                Desktop.add(aluno);
                aluno.setVisible(true);
                aluno.setPosicao();//Seta centralizado
                Desktop.moveToFront(aluno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Usuários" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmAlunoActionPerformed

    private void jmFormTPPgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormTPPgtoActionPerformed
        try {
            if (evt.getSource() == jmFormTPPgto) {
                if (pgto == null) {
                    pgto = new JIFFormaTipoPagto();
                    Desktop.add(pgto);
                    pgto.setVisible(true);
                    pgto.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(pgto);
            }
            if (pgto.isClosed()) {
                pgto = new JIFFormaTipoPagto();
                Desktop.add(pgto);
                pgto.setVisible(true);
                pgto.setPosicao();//Seta centralizado
                Desktop.moveToFront(pgto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela da Forma / Tipo Pagamento" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmFormTPPgtoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object[] botoes = {"Sim", "Não"};//tipo de formato dos botões
        //quando abrir a janela de sair é a msg que vai ser mostrada
        int resposta = JOptionPane.showOptionDialog(null, "Confirma Encerramento do Sistama?", "ATENÇÃO",
                JOptionPane.YES_NO_OPTION,//Tipo usado para confirmar o questionamento
                JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]); //questionamento da msg
        if (resposta == JOptionPane.YES_OPTION) {//valor de retorno de método de classe
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        Timer timer = new Timer(1000, new hora());
        timer.start();
        Dia.setText(MostraData());
    }//GEN-LAST:event_formWindowOpened

    private void jmRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRecargaActionPerformed
        try {
            if (evt.getSource() == jmRecarga) {
                if (recarga == null) {
                    recarga = new JIFRecarga();
                    Desktop.add(recarga);
                    recarga.setVisible(true);
                    recarga.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(recarga);
            }
            if (recarga.isClosed()) {
                recarga = new JIFRecarga();
                Desktop.add(recarga);
                recarga.setVisible(true);
                recarga.setPosicao();//Seta centralizado
                Desktop.moveToFront(recarga);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Recarga" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmRecargaActionPerformed

    private void jmVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVendaActionPerformed
        try {
            if (evt.getSource() == jmVenda) {
                if (venda == null) {
                    venda = new JIFVenda();
                    Desktop.add(venda);
                    venda.setVisible(true);
                    venda.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(venda);
            }
            if (venda.isClosed()) {
                venda = new JIFVenda();
                Desktop.add(venda);
                venda.setVisible(true);
                venda.setPosicao();//Seta centralizado
                Desktop.moveToFront(venda);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Venda" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmVendaActionPerformed
    public String MostraData() {
        Date data = new Date();
        SimpleDateFormat dformatador = new SimpleDateFormat("dd/MM/yyyy");
        String sData = dformatador.format(data);
        return sData;
    }
//https://www.youtube.com/watch?v=55CgbuWnmNc

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            Hora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Usuário;
    private javax.swing.JMenu Utilitarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator0;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmAluno;
    private javax.swing.JMenuItem jmCursoInstituicao;
    private javax.swing.JMenuItem jmEmpresa;
    private javax.swing.JMenuItem jmFormTPPgto;
    private javax.swing.JMenuItem jmMarcaModelo;
    private javax.swing.JMenuItem jmRecarga;
    private javax.swing.JMenuItem jmUnidadeMedida;
    private javax.swing.JMenuItem jmUsuarios;
    private javax.swing.JMenuItem jmVenda;
    // End of variables declaration//GEN-END:variables
}
