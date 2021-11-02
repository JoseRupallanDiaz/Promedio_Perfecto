import java.util.ArrayList;
import java.util.Scanner;

public class Parte implements Gestionar_notas {

    private ArrayList<Nota> notas;
    private double porcentaje;
    private Nota nota_ideal;

    public Parte() {
        this.porcentaje = 0;
        this.notas = new ArrayList<Nota>();
    }

    public Parte(double porcentaje){
        this.porcentaje = porcentaje;
        this.notas = new ArrayList<Nota>();
    }


    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Nota getNota_ideal() {
        return nota_ideal;
    }

    public void setNota_ideal(Nota nota_ideal) {
        this.nota_ideal = nota_ideal;
    }

    @Override
    public void ver_notas() {
        System.out.println("| nombre\t\t\t| valor\t\t| porcentaje\t|");
        notas.stream().forEach(System.out::println);
    }

    @Override
    public boolean ingresar_notas() {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el nombre de la evaluacion:");
        notas.add(new Nota(leer.nextLine()));
        return false;
    }

    @Override
    public void modificar_notas(){
        Scanner leer = new Scanner(System.in);
        int i=1;
        for(Nota n : notas){
            System.out.println("| °n | nombre\t\t\t| valor\t\t|  %\t|");
            System.out.println("| "+i+"  "+n);
            i++;
        }
        System.out.print("Seleccione la nota a modificar :");
        int opcion = leer.nextInt()-1;
        System.out.println("Desea modificar el valor de "+notas.get(opcion).getNombre()+"? (Y/N)");
        leer.nextLine();
        if(leer.nextLine().equalsIgnoreCase("Y")){
            System.out.print("Ingrese el valor de la nota(con´,´): ");
            notas.get(opcion).setValor((leer.nextDouble()));
            leer.nextLine();
        }
        System.out.println("Desea modificar el porcentaje de "+notas.get(opcion).getNombre()+"? (Y/N)");
        if(leer.nextLine().equalsIgnoreCase("Y")){
            System.out.print("Ingrese el porcentaje:");
            double porcen =leer.nextDouble();
            if (calcular_porcentaje_t(porcen,notas)<=100) {
                notas.get(opcion).setPorcentaje(porcen);
            }
            else System.out.println("el porcentaje de la nota no se a modificado por ser mas de 100%");
        }
    }

    @Override
    public double calcular_nota_necesaria() {

        return 0;
    }
    public static boolean no_hay_valores(ArrayList<Nota> notas){
        double sum_nota=0;
        for(Nota n: notas ) {
            sum_nota+=n.getValor();
        }
        if (sum_nota==0){
            return true;
        }
        return false;
    }

    public static double calcular_porcentaje_t(double porcentaje , ArrayList<Nota> notas){
        double porcentaje_t=porcentaje;
        for(Nota n: notas ) {
            porcentaje_t+=n.getPorcentaje();
        }
       return porcentaje_t;
    }

    public static double calcular_promedio_actual(ArrayList<Nota> notas){
        double promedio_actual = 0
        for(Nota n: notas){
            p += n.getValor();
        }
    }
}


