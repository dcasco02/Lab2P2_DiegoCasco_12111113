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
        while (opcion != 11) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("1- agregar edad\n"
                            + "2- agregar nombrescientifico\n"
                            + "3- agregar nombre comun\n"
                            + "4- agregar habitat\n"
                            + "5- agregar alimentacion\n"
                            + "6- agregar distribucion geografica\n"
                            + "7- agregar profesor\n"
                            + "8- agregar Celulares\n"
                            + "9- editar todo\n"
                            + "10- eliminar\n"
                            + "11- salida"));
            if (opcion == 1) {
                int l = Integer.parseInt(
                        JOptionPane.showInputDialog("ingrese vida"));
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
            if (opcion == 3) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String nombrecomun = JOptionPane.showInputDialog("nombre comun");
                        ((Animales) animales.get(pos)).getnombrecomun().add(nombrecomun);
                    }
                }
            }
            if (opcion == 4) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String habitat = JOptionPane.showInputDialog("nombre comun");
                        ((Animales) animales.get(pos)).gethabitat().add(habitat);
                    }
                }
            }
            if (opcion == 5) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String alimentacion = JOptionPane.showInputDialog("nombre comun");
                        ((Animales) animales.get(pos)).getalimentacion().add(alimentacion);
                    }
                }
            }
            if (opcion == 6) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String rasgos = JOptionPane.showInputDialog("nombre comun");
                        ((Animales) animales.get(pos)).getrasgos().add(rasgos);
                    }
                }
            }
            if (opcion == 7) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion animales a agregar nombrescientifico"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        String distribuciongeo = JOptionPane.showInputDialog("nombre comun");
                        ((Animales) animales.get(pos)).getgeo().add(distribuciongeo);
                    }
                }
            }
            if (opcion == 8) {
                String salida = "";
                for (Object temp : animales) {
                    if (temp instanceof Animales) {
                        salida += "" + animales.indexOf(temp) + " -" + temp+ "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }
            if (opcion == 9) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion a modificar"));

                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        int l = Integer.parseInt(
                                JOptionPane.showInputDialog("ingrese el nuevo largo"));
                        ((Animales) animales.get(pos)).setedad(l);
                        String distribuciongeo = JOptionPane.showInputDialog("nombre comun");
                        //((Animales)animales.get(pos)).setgeo(distribuciongeo);
                        
                    }
                }
            }
            if (opcion == 10) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("posicion a eliminar"));
                if (pos < animales.size()) {
                    if (animales.get(pos) instanceof Animales) {
                        animales.remove(pos);
                        JOptionPane.showMessageDialog(null, "Elemento eliminado exitosamente");
                    }
                }
            }    
        }

    }
}


