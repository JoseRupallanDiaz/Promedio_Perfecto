import java.util.ArrayList;
import java.util.Scanner;

public class Parte implements gestionarNotas {

    private ArrayList<Nota> notas;
    private double porcentaje;
    private double notaIdeal;

    public Parte() {
        this.porcentaje = 0;
        this.notas = new ArrayList();
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

    public double getNotaIdeal() {
        return notaIdeal;
    }

    public void setNotaIdeal(double notaIdeal) {
        this.notaIdeal = notaIdeal;
    }

    @Override
    public void verNotas() {
        System.out.println("| nombre\t\t\t| valor\t\t| percentage\t|");
        notas.stream().forEach(System.out::println);
    }


    public void ingresarNota(Nota nota) {
        notas.add(nota);
    }

    public void modificarNotas(){
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
            if (calcularPorcentajeT(porcen,notas)<=100) {
                notas.get(opcion).setPorcentaje(porcen);
            }
            else System.out.println("el porcentaje de la nota no se a modificado por ser mas de 100%");
        }
    }

    @Override
    public double calcularNotaNecesaria() {
        double notaNecesaria = 0;
        if (calcularPorcentajeT(0,this.notas)<100){
            notaNecesaria = (this.notaIdeal - calcularPromedioActual(this.notas))/((100 - calcularPorcentajeT(porcentaje, notas))*0.01);
            return notaNecesaria;
        }
    return notaNecesaria;
    }

    public static boolean noHayValores(ArrayList<Nota> notas){
        double sum_nota=0;
        for(Nota n: notas ) {
            sum_nota+=n.getValor();
        }
        if (sum_nota==0){
            return true;
        }
        return false;
    }

    public static double calcularPorcentajeT(double porcentaje , ArrayList<Nota> notas){
        double porcentajeT=porcentaje;
        for(Nota n: notas ) {
            porcentajeT+=n.getPorcentaje();
        }
       return porcentajeT;
    }

    public double calcularPromedioActual(ArrayList<Nota> notas){
        double promedioActual = 0;
        for(Nota n: notas){
            promedioActual += (n.getValor()*n.getPorcentaje()/100);
        }
        return promedioActual;
    }

    public boolean estanTosdasLasNotas(){
        for(Nota nota: notas){
            if(nota.getValor()>0){
                return  true;
            }
        }
        return false;
    }
}


