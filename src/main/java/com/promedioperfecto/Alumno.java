package com.promedioperfecto;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private double pga;
    private ArrayList<Semestre> semestres;

    public Alumno(String nombre) {
        this.nombre = nombre;
        semestres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPga() {
        return pga;
    }

    public void setPga(double pga) {
        this.pga = pga;
    }

    public Semestre getSemestre(int indice) {
        return this.semestres.get(indice);
    }

    public void addSemestre(Semestre semestre){
        semestres.add(semestre);
    }
}
