public class Nota {
    private String nombre;
    private double porcentaje;
    private double valor;

    public Nota(String nombre){
        this.porcentaje = 0;
        this.nombre = nombre;
        this.valor = 0;
    }
    public Nota(String nombre,double porcentaje){
        this.porcentaje = porcentaje;
        this.nombre = nombre;
        this.valor = 0;
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

