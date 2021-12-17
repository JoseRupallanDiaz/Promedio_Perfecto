import com.promedioperfecto.Materia;
import com.promedioperfecto.Nota;
import com.promedioperfecto.Parte;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class materiaTest {

    @Test
    void calcularNotaNecesariaTest(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("",100,5.5));
        ArrayList<Nota> notas2 = new ArrayList<Nota>();
        notas2.add(new Nota("nota"));
        Parte teorica= new Parte(50);
        Parte practica= new Parte(50);
        teorica.setNotas(notas);
        practica.setNotas(notas2);

        Materia mat = new Materia("mathematica");
        mat.setNotaIdeal(6.0);
        mat.setPractica(practica);
        mat.setTeorica(teorica);
        assertEquals(6.5,mat.calcularNotaNecesaria());
    }

    @Test
    void calcularNotaNecesariaTest2(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("",100,4.5));
        ArrayList<Nota> notas2 = new ArrayList<Nota>();
        notas2.add(new Nota("nota"));
        Parte teorica= new Parte(50);
        Parte practica= new Parte(50);
        teorica.setNotas(notas2);
        practica.setNotas(notas);

        Materia mat = new Materia("mathematica");
        mat.setNotaIdeal(5.5);
        mat.setPractica(practica);
        mat.setTeorica(teorica);

        assertEquals(6.5,mat.calcularNotaNecesaria());
    }
}
