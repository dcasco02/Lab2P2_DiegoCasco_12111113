/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegocasco_12111113;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class Lab2P2_DiegoCasco_12111113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList animales = new ArrayList();
        int opcion = 0;
        while (opcion != 6) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("1- agregar edad\n"
                            + "2- agregar nombrescientifico\n"
                            + "3- listar pizarras\n"
                            + "4- modificar pizarra\n"
                            + "5- eliminar pizarrra\n"
                            + "6- salir\n"
                            + "7- agregar profesor\n"
                            + "8- agregar Celulares\n"
                            + "9- "));
            if (opcion == 1) {
                int l = Integer.parseInt(
                        JOptionPane.showInputDialog("ingrese largo"));
                animales.add(new Animales(l));
            }
            if (opcion == 2) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String nombrescientifico = JOptionPane.showInputDialog("nombre scientifico");
                        ((Animales) animales.get(pos)).getnombrescientifico().add(nombrescientifico);
                    }
                }

            }
            if (opcion==3){
               int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String nombrecomun = JOptionPane.showInputDialog("nombre comun");
                        ((Animales) animales.get(pos)).getnombrescientifico().add(nombrecomun);
                    }
                } 
            }
        }

    }
}


