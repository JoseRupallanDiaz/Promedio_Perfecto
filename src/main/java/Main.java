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
        //Menu1(input, database);
        //nuevoSemestre(diego);
        //nuevaMateria(diego, materia, 0);
        //nuevaNotaTeorica(diego, evaluacion, 0, 0);
        //diego.getSemestre(0).getRamos().get(0).getTeorica().modificarNotas();
        //diego.getSemestre(0).verNotas();
        String nombre = "Diego";
        log.addLine("ingreso Alumno: "+nombre);
        nuevoAlumno(nombre,database,log);
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

    public static void nuevoAlumno(String nombre, Database db, Log log) throws SQLException, IOException {
        db.add("alumno","nombre",nombre);
        log.addLine("Alumno "+nombre+"ingresado a la base de datos");
    }

    public static Alumno seleccionarAlumno(int id, Database db) throws SQLException {
        String nombre = db.getById("alumno",id).getString("nombre");
        Alumno alumnoDefault = new Alumno(nombre);
        return alumnoDefault;
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

    public static void Menu1(Scanner input, Database db) throws SQLException {
        boolean menu1;
        do {
            Alumno alumnodefault;
            menu1 = true;
            System.out.println("Seleccione una opción:");
            System.out.println("1. Iniciar con ID");
            System.out.println("2. Lista de Alumnos");
            System.out.println("3. Crear Alumnos");
            System.out.println("4. Salir");
            switch(input.nextInt()){
                default:
                    menu1=false;
                    break;
                case 1:
                    System.out.print("Ingrese ID de alumno: ");
                    int id = input.nextInt();
                    alumnodefault = seleccionarAlumno(id, db);
                    break;
                case 2:
                    ListaAlumnos(db);
                    break;
                case 3:
                    System.out.print("Nombre alumno: ");
                    String nombre = input.nextLine();
                    break;
            }
        } while (menu1);
    }

}
