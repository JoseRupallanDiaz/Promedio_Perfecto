import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.IOException;

public class Main {
        
    public static void main(String[] args) throws IOException, SQLException {
        Log log;
        log = new Log();

        //Inicio DB e input
        Database database = new Database();
        Scanner input = new Scanner(System.in);
        //Menu
        Menu1(input);
        //nuevoSemestre(diego);
        //nuevaMateria(diego, materia, 0);
        //nuevaNotaTeorica(diego, evaluacion, 0, 0);
        //diego.getSemestre(0).getRamos().get(0).getTeorica().modificarNotas();
        //diego.getSemestre(0).verNotas();
        String nombre = "Diego";
        log.addLine("ingreso "+nombre);
        String materia = "Programacion";
        String evaluacion = "Prueba 1";
        

    }

    public static void nuevoSemestre(Alumno alumno, Database db){
        Semestre nuevoSemestre = new Semestre();
        alumno.addSemestre(nuevoSemestre);
    }

    public static void nuevaMateria(Alumno alumno, String nombreMateria, int indiceSemestre, Database db){
        Materia ramo = new Materia(nombreMateria);
        alumno.getSemestre(indiceSemestre).agregarRamo(ramo);
    }

    public static void nuevaNotaTeorica(Alumno alumno, String nombreEvaluacion, int indiceSemestre, int indiceMateria, Database db){
        Nota nota = new Nota(nombreEvaluacion);
        alumno.getSemestre(indiceSemestre).getRamo(indiceMateria).getTeorica().ingresarNota(nota);
    }

    public static void nuevoAlumno(String nombre, Database db) throws SQLException {
        Alumno alumno = new Alumno(nombre);
        db.add("alumno","nombre",nombre);
    }

    public static void ListaAlumnos(Database database) throws SQLException {
        ResultSet usuarios = database.getTable("alumno");
        System.out.println("ID\tNombre\t\tPGA");
        while (usuarios.next()){
            System.out.print(usuarios.getString("id")+"\t");
            System.out.print(usuarios.getString("nombre")+"\t\t");
            System.out.print(usuarios.getString("pga"));
            System.out.println("");
        }
    }

    public static void Menu1(Scanner input){
        boolean menu1;
        do {
            menu1 = true;
            System.out.println("Seleccione una opción:");
            System.out.println("1. Iniciar con ID");
            System.out.println("2. Lista de Alumnos");
            System.out.println("3. Crear Alumnos");
            System.out.println("4. Salir");
            int opcion = input.nextInt();

        } while (menu1);
    }

}
