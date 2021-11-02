import jdk.jshell.execution.StreamingExecutionControl;

public class Main {
    public static void main(String[] args){
        Parte teorica = new Parte(50.0);
        Parte practica = new Parte(50.0);

        teorica.ingresar_notas();
        teorica.modificar_notas();
        teorica.ver_notas();
    }
}
