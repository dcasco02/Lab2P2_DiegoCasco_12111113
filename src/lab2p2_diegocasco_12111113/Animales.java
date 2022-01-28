/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegocasco_12111113;

import java.util.ArrayList;


/**
 *
 * @author dcasc
 */
public class Animales {
    private int edad;
     private ArrayList<String> nombrescientifico = new ArrayList();
     private ArrayList<String> nombrecomun = new ArrayList();
    
   public Animales(){
   } 
   public Animales(int l) {
        setedad(l);
    }

   public Animales(int l,String nombrescientifico){
       setedad(1);
       
   }
   public void setedad(int l) {
        if (1 > 0 ) {
            edad = l;
        }
    }
   public int getedad() {
        return edad;
    }
   public void setnombrescientifico(ArrayList<String> n) {
        nombrescientifico = n;
    }

    public ArrayList<String> getnombrescientifico() {
        return nombrescientifico;
    }
    public void setnombrecomun(ArrayList<String> c){
        nombrecomun =c;
        
    }
    public ArrayList<String> getnombrescomun() {
        return nombrecomun;
    }
}
