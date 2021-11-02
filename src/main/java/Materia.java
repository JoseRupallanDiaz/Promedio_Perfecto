import java.util.ArrayList;

public class Materia implements Gestionar_notas {

    private String nombre;
    private Nota nota_ideal;
    private Maestro maestro;
    private Parte teorica;
    private Parte practica;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.practica = new Parte();
        this.teorica = new Parte(100);
    }

    public void setNota_ideal(Nota nota_ideal) {
        this.nota_ideal = nota_ideal;
    }

    public Nota getNota_ideal() {
        return nota_ideal;
    }

    public void agregar_maestro(String nombre){
        this.maestro = new Maestro(nombre);
    }

    public Maestro getMaestro() {
        return maestro;
    }

    @Override
    public void ver_notas() {

    }

    @Override
    public boolean ingresar_notas() {
        return false;
    }

    @Override
    public void modificar_notas() {

    }

    @Override
    public double calcular_nota_necesaria() {
        return 0;
    }
}

