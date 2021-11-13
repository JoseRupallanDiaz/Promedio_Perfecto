import java.util.ArrayList;

public class Materia implements Gestionar_notas {

    private String nombre;
    private double nota_ideal;
    private Maestro maestro;
    private Parte teorica;
    private Parte practica;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.practica = new Parte();
        this.teorica = new Parte(100);
    }

    public void setPractica(Parte practica) {
        this.practica = practica;
    }

    public void setTeorica(Parte teorica) {
        this.teorica = teorica;
    }
    public void setNota_ideal(double nota_ideal) {
        this.nota_ideal = nota_ideal;
    }

    public double getNota_ideal() {
        return nota_ideal;
    }

    public void agregar_maestro(String nombre) {
        this.maestro = new Maestro(nombre);
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void verNotas() {
        System.out.println("Practico (" + this.practica.getPorcentaje() + "%)");
        this.practica.verNotas();
        System.out.println("Teorico (" + this.teorica.getPorcentaje() + "%)");
        this.teorica.verNotas();
    }

    @Override
    public double calcularNotaNecesaria() {
        double nota_necesaria = 0;
        if(practica.estanTosdasLasNotas()&& !teorica.estanTosdasLasNotas()){
            nota_necesaria = (nota_ideal-(practica.calcular_promedio_actual(practica.getNotas()) *practica.getPorcentaje()/100))*(Math.pow(teorica.getPorcentaje()/100,-1));
        }
        else if(teorica.estanTosdasLasNotas() && !practica.estanTosdasLasNotas()){
            nota_necesaria=(nota_ideal-(teorica.calcular_promedio_actual(teorica.getNotas()) *teorica.getPorcentaje()/100))*(Math.pow(practica.getPorcentaje()/100,-1));
        }
        else if(teorica.estanTosdasLasNotas() && practica.estanTosdasLasNotas()){
            nota_necesaria = 0;
        }
        else {
            nota_necesaria = nota_ideal;
        }
        return nota_necesaria;
    }
}
