
/**
 * @package main/java
 */

/**
 * este objeto esta hecha para ser usada como compocicion para otros objetos en el programa
 */
public class Nota {

    private String nombre;
    private double porcentaje;
    private double valor;

    /**
     * Constructor que recibe nombre de la evaluación, valor de la nota y porcentaje por default 0.
     * @param nombre nombre de la evaluación Nota.
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
     * @param nombre nombre de la evaluación Nota.
     * @param porcentaje valor porcentual de la evaluación.
     * @param valor valor numérico de la evaluación.
     */
    public Nota(String nombre,double porcentaje ,double valor){
        this.porcentaje = porcentaje;
        this.nombre = nombre;
        this.valor = valor;
    }

    /**
     * retorna el nombre del objeto
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * modijica el nombre del objeto
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * retorna el porsentaje prara ser utilizado en su emvocador
     * @return porcentaje
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * recibe un double para intercambiar por el prosentaje
     * @param porcentaje
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * reorna el valor para ser utilizado
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * recibe un double para intercambiar por el valor
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * guarda todos los atributos de forma estetica para devolverlo al impromir el objeto
     * @return toSting nombre , valor , porcentaje
     */
    @Override
    public String toString() {
        return "| "+nombre+"\t\t\t | "+valor+"\t\t | "+porcentaje+"%\t|";
    }
}

