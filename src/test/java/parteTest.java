
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class parteTest {

    @Test
    void hayValoresTest(){
        //este metodo es para determinar si no hay valores para calular en las notas
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1"));
        notas.add(new Nota("prueba2"));
        notas.add(new Nota("prueba3"));
        Parte p1 = new Parte();
        assert(p1.noHayValores(notas));
    }
    @Test
    void hayValoresTest2(){
        //este metodo es para determinar si no hay valores para calular en las notas
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1"));
        notas.add(new Nota("prueba2"));
        notas.add(new Nota("prueba3",50.0,5.5));
        Parte p1 = new Parte();
        assert(!p1.noHayValores(notas));
    }

    @Test
    void calcularPorcentajeTest(){
        // este metodo esta hecho para ver si el porcentaje se puede sumar para no llegar a
        // mas de 100 sumandolas antes de hagregarlo a la nota del arreglo
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0));
        notas.add(new Nota("prueba2",25.0));
        notas.add(new Nota("prueba3",25.0));
        Parte p1 = new Parte();
        assertEquals(75.0,p1.calcularPorcentajeT(0,notas));
    }
    @Test
    void calcularPorcentajeTest2(){
        // este metodo esta hecho para ver si el porcentaje se puede sumar para no llegar a
        // mas de 100 sumandolas antes de hagregarlo a la nota del arreglo
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0));
        notas.add(new Nota("prueba2",25.0));
        notas.add(new Nota("prueba3",30.0));
        Parte p1 = new Parte();
        assertEquals(90.0,p1.calcularPorcentajeT(10.0,notas));
    }

    @Test
    void carculerNotaNeceTest(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,7.0));
        notas.add(new Nota("prueba2",25.0,5.0));
        notas.add(new Nota("prueba3",25.0,5.0));
        Parte p1 = new Parte();
        p1.setNotas(notas);
        p1.setNotaIdeal(6.0);
        assertEquals(7.0,p1.calcularNotaNecesaria());
    }
    @Test
    void carculerNotaNeceTest2(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,5.0));
        notas.add(new Nota("prueba2",25.0,5.0));
        notas.add(new Nota("prueba3",25.0,5.0));
        Parte p1 = new Parte();
        p1.setNotas(notas);
        p1.setNotaIdeal(5.0);
        assertEquals(5.0,p1.calcularNotaNecesaria());
    }
    @Test
    void carculerNotaNeceTest3(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",30.0,6.0));
        notas.add(new Nota("prueba2",30.0,5.0));
        notas.add(new Nota("prueba3",30.0,3.0));
        Parte p1 = new Parte();
        p1.setNotas(notas);
        p1.setNotaIdeal(4.5);
        assertEquals(3.0,(double) Math.round(p1.calcularNotaNecesaria()*100.0/100.0));
    }

    @Test
    void calcularPromedioActualTest(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,5.0));
        notas.add(new Nota("prueba2",25.0,5.0));
        notas.add(new Nota("prueba3",25.0,5.0));
        Parte p1 = new Parte();
        assertEquals(3.75,p1.calcularPromedioActual(notas));
    }

    @Test
    void calcularPromedioActualTest2(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,4.0));
        notas.add(new Nota("prueba2",25.0,4.0));
        notas.add(new Nota("prueba3",25.0,4.0));
        Parte p1 = new Parte();
        assertEquals(3,p1.calcularPromedioActual(notas));
    }


}
