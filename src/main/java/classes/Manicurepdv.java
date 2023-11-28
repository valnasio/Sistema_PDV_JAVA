/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;

import formularios.frmLogin;



/**
 *
 * @author Rafael Valnásio
 */
public class Manicurepdv {

    public static void main(String[] args) {
      Dados msDados = new Dados();
      frmLogin miLogin = new frmLogin();
      miLogin.setDados(msDados);
      miLogin.setLocationRelativeTo(null);
      miLogin.setVisible(true);
    }
}
