import java.util.ArrayList;
import java.util.Scanner;

public class Semestre implements Gestionar_notas {

    private ArrayList<Materia> ramos;
    private Nota nota_ideal;

    public Semestre() {
        ramos = new ArrayList<Materia>();
    }

    public Materia getRamo(int index){
        return this.ramos.get(index);
    }

    public void agregarRamo(Materia ramoNuevo){
        this.ramos.add(ramoNuevo);
//        Scanner input = new Scanner(System.in);
//        int cantidad = 0;
//        boolean flag;
//        System.out.println("Cuantos ramos desea agregar?");
//        do {
//            flag = false;
//            try {
//                cantidad = input.nextInt();
//            } catch (Exception e) {
//                flag = true;
//                System.err.println("Debe ingresar un numero");
//            }
//            if (cantidad <=0){
//                flag = true;
//                System.err.println("El numero debe ser mayor a 0");
//            }
//        } while (flag);
//        for (int i =0; cantidad < i;i++){
//            System.out.println("Ingrese el nombre de la materia");
//            this.ramos.add(new Materia(input.nextLine()));
//        }
    }

    public void setNota_ideal(Nota nota_ideal) {
        this.nota_ideal = nota_ideal;
    }

    public Nota getNota_ideal() {
        return nota_ideal;
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
        return 0;
    }
}
