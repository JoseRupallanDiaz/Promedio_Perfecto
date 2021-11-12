public class Main {
    public static void main(String[] args){
        Parte teorica = new Parte(50.0);
        Parte practica = new Parte(50.0);

        teorica.ingresarNotas();
        teorica.modificarNotas();
        teorica.verNotas();
    }
}
