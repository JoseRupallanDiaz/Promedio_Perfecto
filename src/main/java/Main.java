import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre = "Diego";
        String materia = "Programacion";
        String evaluacion = "Prueba 1";

        Alumno diego = new Alumno(nombre);
        nuevoSemestre(diego);
        nuevaMateria(diego, materia, 0);
        nuevaNotaTeorica(diego, evaluacion, 0, 0);
        diego.getSemestre(0).getRamos().get(0).getTeorica().modificarNotas();
        diego.getSemestre(0).verNotas();

    }

    public static void nuevoSemestre(Alumno alumno){
        Semestre nuevoSemestre = new Semestre();
        alumno.addSemestre(nuevoSemestre);
    }

    public static void nuevaMateria(Alumno alumno, String nombreMateria, int indiceSemestre){
        Materia ramo = new Materia(nombreMateria);
        alumno.getSemestre(indiceSemestre).agregarRamo(ramo);
    }

    public static void nuevaNotaTeorica(Alumno alumno, String nombreEvaluacion, int indiceSemestre, int indiceMateria){
        Nota nota = new Nota(nombreEvaluacion);
        alumno.getSemestre(indiceSemestre).getRamo(indiceSemestre).getTeorica().ingresarNota(nota);
    }
}
