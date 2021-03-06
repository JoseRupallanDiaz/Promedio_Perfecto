
import com.promedioperfecto.Materia;
import com.promedioperfecto.Nota;
import com.promedioperfecto.Parte;
import com.promedioperfecto.Semestre;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class semestreTest {

    @Test
    void calcularNotaNecesariaTest(){
        Semestre sem = new Semestre();
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("",100,6.0));
        ArrayList<Nota> notas2 = new ArrayList<Nota>();
        notas2.add(new Nota("nota",100,5.0));
        ArrayList<Nota> notas3 = new ArrayList<Nota>();
        notas3.add(new Nota("nota",50,3.0));
        Parte teorica= new Parte(50);
        Parte practica= new Parte(50);
        Parte practica2= new Parte(50);
        teorica.setNotas(notas);
        practica.setNotas(notas2);

        ArrayList<Materia> ramos = new ArrayList<Materia>();
        ramos.add(new Materia("1",teorica,practica));
        ramos.add(new Materia("2",teorica,practica2));
        sem.setNota_ideal(6.0);
        sem.setRamos(ramos);
        assertEquals(6.5,sem.calcularNotaNecesaria());
    }

    @Test
    void calcularNotaNecesariaTest2(){
        Semestre sem = new Semestre();
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("",100,6.0));
        ArrayList<Nota> notas2 = new ArrayList<Nota>();
        notas2.add(new Nota("nota",100,2.0));
        ArrayList<Nota> notas3 = new ArrayList<Nota>();
        notas3.add(new Nota("nota",50,3.0));
        Parte teorica= new Parte(50);
        Parte practica= new Parte(50);
        Parte practica2= new Parte(50);
        teorica.setNotas(notas);
        practica.setNotas(notas2);

        ArrayList<Materia> ramos = new ArrayList<Materia>();
        ramos.add(new Materia("1",teorica,practica));
        ramos.add(new Materia("2",teorica,practica2));
        sem.setNota_ideal(5.0);
        sem.setRamos(ramos);
        assertEquals(6.0,sem.calcularNotaNecesaria());
    }

    @Test
    void calcularNotaNecesariaTest3(){
        Semestre sem = new Semestre();
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("",100,7.0));
        ArrayList<Nota> notas2 = new ArrayList<Nota>();
        notas2.add(new Nota("nota",100,5.0));
        ArrayList<Nota> notas3 = new ArrayList<Nota>();
        notas3.add(new Nota("nota",50,3.0));
        Parte teorica= new Parte(50);
        Parte practica= new Parte(50);
        Parte practica2= new Parte(50);
        teorica.setNotas(notas);
        practica.setNotas(notas2);

        ArrayList<Materia> ramos = new ArrayList<Materia>();
        ramos.add(new Materia("1",teorica,practica));
        ramos.add(new Materia("2",teorica,practica2));
        sem.setNota_ideal(6.5);
        sem.setRamos(ramos);
        assertEquals(7.0,sem.calcularNotaNecesaria());
    }


}
