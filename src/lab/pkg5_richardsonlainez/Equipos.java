/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_richardsonlainez;

import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Equipos {
    public String nombre;
    public double presupuesto;
    public int copas_ganadas;
    public String estadio;
    public ArrayList<Jugadores> jugadores;

    public Equipos() {
        jugadores = new ArrayList();
    }

    public Equipos(String nombre, double presupuesto, int copas_ganadas, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copas_ganadas = copas_ganadas;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas_ganadas() {
        return copas_ganadas;
    }

    public void setCopas_ganadas(int copas_ganadas) {
        this.copas_ganadas = copas_ganadas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
    
}
