/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegocasco_12111113;


/**
 *
 * @author dcasc
 */
public class Animales {
    private int edad;
    private String nombrescientifico;
    
   public Animales{
   } 
   public Animales(int l) {
        setedad(l);
    }

   public Animales(int 1,String nombrescientifico){
       setedad(1);
       this.nombrescientifico=nombrescientifico;
       
   }
   public void setedad(int l) {
        if (1 > 0 ) {
            edad = l;
        }
    }
   public int getedad() {
        return edad;
    }
   public void setnombrescientifico(String t) {
        nombrescientifico = n;
    }

    public String nombrescientifico() {
        return nombrescientifico;
    }
}
