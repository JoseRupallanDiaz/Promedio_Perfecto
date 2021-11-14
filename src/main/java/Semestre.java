import java.util.ArrayList;
import java.util.Scanner;

public class Semestre implements Gestionar_notas {

    private ArrayList<Materia> ramos;
    private double nota_ideal;

    public Semestre() {
    }

    public void setNota_ideal(double nota_ideal) {
        this.nota_ideal = nota_ideal;
    }

    public ArrayList<Materia> getRamos() {
        return ramos;
    }

    public void setRamos(ArrayList<Materia> ramos) {
        this.ramos = ramos;
    }

    public double getNota_ideal() {
        return nota_ideal;
    }

    public void agregar_ramos(){
        Scanner input = new Scanner(System.in);
        int cantidad = 0;
        boolean flag;
        System.out.println("Cuantos ramos desea agregar?");
        do {
            flag = false;
            try {
                cantidad = input.nextInt();
            } catch (Exception e) {
                flag = true;
                System.err.println("Debe ingresar un numero");
            }
            if (cantidad <=0){
                flag = true;
                System.err.println("El numero debe ser mayor a 0");
            }
        } while (flag);
        for (int i =0; cantidad < i;i++){
            System.out.println("Ingrese el nombre de la materia");
            this.ramos.add(new Materia(input.nextLine()));
        }
    }

    @Override
    public void verNotas() {
        ramos.forEach((ramo) -> {
            System.out.println(ramo.getNombre());
            ramo.verNotas();
        });
    }

    @Override
    public double calcularNotaNecesaria() {
        ArrayList<Materia> ramosListos = new ArrayList<Materia>();
        double promedioListo = 0;
        for (Materia ramo : ramos) {
            if (ramo.todoCalificado()) {
                ramosListos.add(ramo);
                promedioListo = promedioListo + ramo.calcularPromedio();
            }
        }
        if (ramosListos.size() == 0) {
            return nota_ideal;
        }
        promedioListo= promedioListo/ramosListos.size();
        double porsentajeListo = (double) (ramosListos.size())/ramos.size();
        return (nota_ideal-(porsentajeListo*promedioListo))*(Math.pow(1-porsentajeListo,-1));
    }
}
