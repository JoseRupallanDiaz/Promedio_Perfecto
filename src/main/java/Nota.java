
/**
 *
 *
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "| "+nombre+"\t\t\t | "+valor+"\t\t | "+porcentaje+"%\t|";
    }
}

