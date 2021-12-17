package com.promedioperfecto;
/**
 * @package main/java
 */

/**
 * Clase encargada de almacenar valores correspondientes a una Nota
 */
public class Nota {

    private String nombre;
    private double porcentaje;
    private double valor;

    /**
     * Constructor que recibe nombre de la evaluación, valor de la nota y porcentaje por default 0.
     * @param nombre nombre de la evaluación PromedioPerfecto.Nota.
     */
    public Nota(String nombre){
        this.porcentaje = 0;
        this.nombre = nombre;
        this.valor = 0;
    }

    /**
     * Constructor que recibe tanto el nombre como el porcentaje de la nota, valor de la nota por default 0.
     * @param nombre nombre de la evaluación.
     * @param porcentaje valor porcentual de la evaluación.
     */
    public Nota(String nombre,double porcentaje){
        this.porcentaje = porcentaje;
        this.nombre = nombre;
        this.valor = 0;
    }

    /**
     * Constructor que recibe el nombre, el porcentaje y el valor ded la evaluación.
     * @param nombre nombre de la evaluación PromedioPerfecto.Nota.
     * @param porcentaje valor porcentual de la evaluación.
     * @param valor valor numérico de la evaluación.
     */
    public Nota(String nombre,double porcentaje ,double valor){
        this.porcentaje = porcentaje;
        this.nombre = nombre;
        this.valor = valor;
    }

    /**
     * retorna el nombre de la evaluación.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * modifica el nombre de la evaluación.
     * @param nombre nombre nuevo del objeto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * retorna el porcentaje de la evaluación.
     * @return porcentaje
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * modifica el valor del porcentaje de la evaluación.
     * @param porcentaje porcentaje nuevo del objeto.
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * retorna el valor de la evaluación.
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * modfica el valor de la evaluación.
     * @param valor valor nuevo del objeto.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * retorna un String ordenado con los valores de la evaluación.
     * @return toSting nombre, valor, porcentaje.
     */
    @Override
    public String toString() {
        return "| "+nombre+"\t\t\t | "+valor+"\t\t | "+porcentaje+"%\t|";
    }
}

