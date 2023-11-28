/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import classes.Dados;
import classes.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.valnasio
 */
public class frmUsuarios extends javax.swing.JInternalFrame {
   private Dados msDados;
   private int usuAtual = 0;
   private boolean novo = false;
   
   public void setDados(Dados msDados){
       
   this.msDados = msDados;
   }
   
    public frmUsuarios() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSnome = new javax.swing.JTextField();
        btnProximocadstro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        btnCadastroanterior = new javax.swing.JButton();
        btnPrimeiocadastro = new javax.swing.JButton();
        btnUltimocadastro = new javax.swing.JButton();
        txtConfSenhaUsr = new javax.swing.JPasswordField();
        txtSenhaUsr = new javax.swing.JPasswordField();
        btnEditarUsuario = new javax.swing.JButton();
        btnDeletarUsuário = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();
        btnPesquisarUsuario = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Usuário:");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID Usuário:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("S_nome:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Senha:");
        jLabel4.setToolTipText("");

        txtId.setEnabled(false);

        txtNome.setEnabled(false);

        txtSnome.setEnabled(false);

        btnProximocadstro.setText("PROXIMO");
        btnProximocadstro.setToolTipText("");
        btnProximocadstro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximocadstroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Perfil:");
        jLabel5.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Conf Senha:");
        jLabel7.setToolTipText("");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Um Perfil", "Administrador", "Funcionário" }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        btnCadastroanterior.setText("ANTERIOR");
        btnCadastroanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroanteriorActionPerformed(evt);
            }
        });

        btnPrimeiocadastro.setText("←");
        btnPrimeiocadastro.setToolTipText("");
        btnPrimeiocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiocadastroActionPerformed(evt);
            }
        });

        btnUltimocadastro.setText("→");
        btnUltimocadastro.setToolTipText("");
        btnUltimocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimocadastroActionPerformed(evt);
            }
        });

        txtConfSenhaUsr.setEnabled(false);

        txtSenhaUsr.setEnabled(false);

        btnEditarUsuario.setText("EDITAR");
        btnEditarUsuario.setToolTipText("");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnDeletarUsuário.setText("DELETAR");
        btnDeletarUsuário.setToolTipText("");
        btnDeletarUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarUsuárioActionPerformed(evt);
            }
        });

        btnNovoUsuario.setText("NOVO USUÁRIO");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        btnPesquisarUsuario.setText("PESQUISAR");

        btnSalvar.setText("SALVAR");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSnome))
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConfSenhaUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(txtSenhaUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(btnPrimeiocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovoUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnEditarUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnDeletarUsuário)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnProximocadstro)
                .addGap(18, 18, 18)
                .addComponent(btnUltimocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenhaUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtConfSenhaUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroanterior)
                    .addComponent(btnPrimeiocadastro)
                    .addComponent(btnProximocadstro)
                    .addComponent(btnUltimocadastro)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnDeletarUsuário)
                    .addComponent(btnNovoUsuario)
                    .addComponent(btnPesquisarUsuario))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximocadstroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximocadstroActionPerformed
        usuAtual++;
        if(usuAtual == msDados.numeroUsuarios()){
            usuAtual = 0;
            
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximocadstroActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
       btnPrimeiocadastro.setEnabled(false);
       btnProximocadstro.setEnabled(false);
       btnCadastroanterior.setEnabled(false);
       btnDeletarUsuário.setEnabled(false);
       btnUltimocadastro.setEnabled(false);
       btnNovoUsuario.setEnabled(false);
       btnUltimocadastro.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnPesquisarUsuario.setEnabled(false);
       btnEditarUsuario.setEnabled(false);
       btnCancelar.setEnabled(true);
       
       //habilitar caixas de dialogo
       
   
       txtNome.setEnabled(true);
       txtSenhaUsr.setEnabled(true);
       txtSnome.setEnabled(true);         
       txtConfSenhaUsr.setEnabled(true);
       cmbPerfil.setEnabled(true);
       
       
       //desativar novo
       novo = false;
       //garantir que inicie no campo de id 
       txtNome.requestFocus();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnDeletarUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarUsuárioActionPerformed
        
    }//GEN-LAST:event_btnDeletarUsuárioActionPerformed

    //ação do botão novo usuário 
    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
      // esconde os botões ao criar novos cadastros 
       btnPrimeiocadastro.setEnabled(false);
       btnProximocadstro.setEnabled(false);
       btnCadastroanterior.setEnabled(false);
       btnDeletarUsuário.setEnabled(false);
       btnUltimocadastro.setEnabled(false);
       btnNovoUsuario.setEnabled(false);
       btnUltimocadastro.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnPesquisarUsuario.setEnabled(false);
       btnEditarUsuario.setEnabled(false);
       btnCancelar.setEnabled(true);
       
       //habilitar caixas de dialogo
       
       txtId.setEnabled(true);
       txtNome.setEnabled(true);
       txtSenhaUsr.setEnabled(true);
       txtSnome.setEnabled(true);         
       txtConfSenhaUsr.setEnabled(true);
       cmbPerfil.setEnabled(true);
       
       //limpar as entrdas de texto
       
       txtId.setText("");
       txtNome.setText("");
       txtSenhaUsr.setText("");
       txtSnome.setText("");         
       txtConfSenhaUsr.setText("");
       cmbPerfil.setSelectedIndex(0);
       
        //variavel novo
       novo = true;
       //garantir que inicie no campo de id 
       txtId.requestFocus();
       
     
       
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      //impede que salve sem as informações vazias
       if( txtId.getText().equals("") || txtNome.getText().equals("") || txtSnome.getText().equals("") || txtSenhaUsr.getText().equals("") || txtConfSenhaUsr.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane,"Insira todas as  informações de usuário");
           txtId.requestFocusInWindow();
           
} 
        if(cmbPerfil.getSelectedIndex() == 0){
        
        JOptionPane.showMessageDialog(rootPane,"Escolha o tipo do perfil");
        cmbPerfil.requestFocusInWindow();
        }
       //cria as strings para confirmação dos valores das senhas 
       String senha = new String(txtSenhaUsr.getPassword());
       String confirmar = new String(txtConfSenhaUsr.getPassword());
       
         // evita que o campo de senha esteja vazio 
       if(senha.equals("")){
           
           JOptionPane.showMessageDialog(rootPane,"Insira todas as  informações de usuário");
           txtSenhaUsr.requestFocusInWindow();
           
       }
         // evita que o campo de senha esteja vazio 
       if(confirmar.equals("")){
           
           JOptionPane.showMessageDialog(rootPane,"Insira todas as  informações de usuário");
           txtConfSenhaUsr.requestFocusInWindow();
           
       }
       // verifica se as senhas são iguais 
       if(!senha.equals(confirmar)){
       
       JOptionPane.showMessageDialog(rootPane,"As senhas não são identicas");
         txtSenhaUsr.requestFocusInWindow();
           
       
       }
       //utiliza as informações obitidas em dados para validar se os usuários já existem 
       int pos = msDados.posicaoUsuario(txtId.getText());// cria a variavel pos
       if(novo){
       if(pos != -1){
         JOptionPane.showMessageDialog(rootPane,"Usuário já cadastrado");
         txtId.requestFocusInWindow();
         return;
       }
       }else{
        if(pos == -1){
            
            JOptionPane.showMessageDialog(rootPane,"Usuário não cadastrado");
            txtId.requestFocusInWindow();
            return;
        
        }
       }
       
       Usuario  msUsuario = new Usuario(txtId.getText(),
               txtNome.getText(), txtSnome.getText(),
               senha, cmbPerfil.getSelectedIndex());
       
               String msg = msDados.addUsuario(msUsuario);
               JOptionPane.showMessageDialog(rootPane, msg);
       
       
       
       
       
       
       
       
       
       
       btnPrimeiocadastro.setEnabled(true);
       btnProximocadstro.setEnabled(true);
       btnCadastroanterior.setEnabled(true);
       btnDeletarUsuário.setEnabled(true);
       btnUltimocadastro.setEnabled(true);
       btnNovoUsuario.setEnabled(true);
       btnUltimocadastro.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnPesquisarUsuario.setEnabled(true);
       btnEditarUsuario.setEnabled(true);
       btnCancelar.setEnabled(false);
       cmbPerfil.setEnabled(false);
       
       //desabilitar caixas de dailogo
       txtId.setEnabled(false);
       txtNome.setEnabled(false);
       txtSenhaUsr.setEnabled(false);
       txtSnome.setEnabled(false);         
       txtConfSenhaUsr.setEnabled(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimeiocadastro.setEnabled(true);
       btnProximocadstro.setEnabled(true);
       btnCadastroanterior.setEnabled(true);
       btnDeletarUsuário.setEnabled(true);
       btnUltimocadastro.setEnabled(true);
       btnNovoUsuario.setEnabled(true);
       btnUltimocadastro.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnPesquisarUsuario.setEnabled(true);
       btnEditarUsuario.setEnabled(true);
       btnCancelar.setEnabled(false);
       cmbPerfil.setEnabled(false);
       
          //desabilitar caixas de dailogo
       txtId.setEnabled(false);
       txtNome.setEnabled(false);
       txtSenhaUsr.setEnabled(false);
       txtSnome.setEnabled(false);         
       txtConfSenhaUsr.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      mostrarRegistro();
      
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiocadastroActionPerformed
        usuAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiocadastroActionPerformed

    private void btnUltimocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimocadastroActionPerformed
       usuAtual = msDados.numeroUsuarios()-1;
       mostrarRegistro();
    }//GEN-LAST:event_btnUltimocadastroActionPerformed

    private void btnCadastroanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroanteriorActionPerformed
        usuAtual--;
        if(usuAtual == -1){
            usuAtual = msDados.numeroUsuarios() -1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnCadastroanteriorActionPerformed
    private void mostrarRegistro(){
    
    txtId.setText(msDados.getUsuarios()[usuAtual].getIdUsuario());
        txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
         txtSnome.setText(msDados.getUsuarios()[usuAtual].getSnome());
          txtSenhaUsr.setText(msDados.getUsuarios()[usuAtual].getSenha());
           txtConfSenhaUsr.setText(msDados.getUsuarios()[usuAtual].getSenha());
            cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil());
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroanterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletarUsuário;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JButton btnPrimeiocadastro;
    private javax.swing.JButton btnProximocadstro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimocadastro;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtConfSenhaUsr;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenhaUsr;
    private javax.swing.JTextField txtSnome;
    // End of variables declaration//GEN-END:variables
}
