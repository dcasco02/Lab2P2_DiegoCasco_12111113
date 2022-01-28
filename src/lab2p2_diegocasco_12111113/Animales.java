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
    private ArrayList<String> habitat = new ArrayList();
    private ArrayList<String> alimentacion = new ArrayList();
    private ArrayList<String> rasgos = new ArrayList();
    private ArrayList<String> geo = new ArrayList();
    
    public Animales() {
    }

    public Animales(int l) {
        setedad(l);
    }

    /*public Animales(int l) {
        setedad(1);

    }*/

    public void setedad(int l) {
        if (0 <= 1) {
            edad = l;
        } else {
            System.out.println("Invalido");
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

    public void setnombrecomun(ArrayList<String> c) {
        nombrecomun = c;

    }

    public ArrayList<String> getnombrecomun() {
        return nombrecomun;
    }

    public void sethabitat(ArrayList<String> h) {
        habitat = h;

    }

    public ArrayList<String> gethabitat() {
        return habitat;
    }

    public void setalimentacion(ArrayList<String> a) {
        alimentacion = a;

    }

    public ArrayList<String> getalimentacion() {
        return alimentacion;
    }

    public void setrasgos(ArrayList<String> r) {
        rasgos = r;

    }

    public ArrayList<String> getrasgos() {
        return alimentacion;
    }
    public void setgeo(ArrayList<String> g) {
        geo = g;

    }

    public ArrayList<String> getgeo() {
        return geo;
    }
}
