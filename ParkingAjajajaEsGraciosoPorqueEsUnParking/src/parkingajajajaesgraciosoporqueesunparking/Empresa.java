/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingajajajaesgraciosoporqueesunparking;

/**
 *
 * @author dam
 */
public class Empresa {

    String[] plazas;

    public Empresa(int numeroPlazas) {
        plazas = new String[numeroPlazas];
    }

    public Empresa() {
        plazas = new String[]{"libre", "ocupado"};
    }

    public void inicializarPlaza() {

        for (int nplazas = 0; nplazas < plazas.length; nplazas++) {
            plazas[nplazas] = "LIBRE";
        }
    }
    
   public void visualizar(){
    
       
       
   }   
}
