
package classes;


public class Dados {
    //cria a string que define a quantidade de usuários
    private int maxUsu = 200;
    //ARAY DE USUARIO
    
    private Usuario msUsuarios[]=new Usuario [maxUsu];//define a quantidade de usuários 
    
    //contador de usuarios 
    private int conUsu =0; // variavel criada para fazer a contagem de usuários
    
    //criadno o usuario
    
    public Dados(){
        Usuario mUsuario = new Usuario("1", "admin","Administrador",  "Admin123@", 1 );//cria o usuário administrador do sistema 
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
    }
    
    public int numeroUsuarios(){
    return conUsu;
    }
    
    public Usuario[]getUsuarios(){
    return msUsuarios;
    }
    
    public boolean validarUsuario(String usuario, String senha){
     boolean aux = false;
     for(int i = 0; i < conUsu; i++){
     if(msUsuarios[i].getIdUsuario().equals(usuario)&& 
             msUsuarios[i].getSenha().equals(senha)){
     return true;
     } 
             
     }
     return false;
    }
    // evitando duplicidade nos usuários 
     public int posicaoUsuario(String usuario){
     
     for(int i = 0; i < conUsu; i++){
     if(msUsuarios[i].getIdUsuario().equals(usuario)){
     return i;
     } 
             
     }
     return -1;
    }
     
     public String addUsuario(Usuario msUsuario){
         //ALERTA SOBRE A QUANTIDADE DE USUÁRIO ATINGIDA
         if(conUsu == maxUsu){
         return "NÚMERO  MÁXIMO DE USUÁRIOS ATINGIDO ";
         }
         // ALERTA PARA EXITO NA CRIAÇÃO DE USUÁRIO
        msUsuarios[conUsu] = msUsuario;
        conUsu++;
        return "CADASTRO REALIZADO COM SUCESSO";
     }
}
