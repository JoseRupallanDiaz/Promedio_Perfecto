
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class parte_test {

    @Test
    public void hayValoresTest(){
        //este metodo es para determinar si no hay valores para calular en las notas
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1"));
        notas.add(new Nota("prueba2"));
        notas.add(new Nota("prueba3"));
        Parte p1 = new Parte();
        assert(p1.no_hay_valores(notas));
    }
    @Test
    public void hayValoresTest2(){
        //este metodo es para determinar si no hay valores para calular en las notas
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1"));
        notas.add(new Nota("prueba2"));
        notas.add(new Nota("prueba3",50.0,5.5));
        Parte p1 = new Parte();
        assert(!p1.no_hay_valores(notas));
    }

    @Test
    public void calcularPorcentajeTest(){
        // este metodo esta hecho para ver si el porcentaje se puede sumar para no llegar a
        // mas de 100 sumandolas antes de hagregarlo a la nota del arreglo
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0));
        notas.add(new Nota("prueba2",25.0));
        notas.add(new Nota("prueba3",25.0));
        Parte p1 = new Parte();
        assertEquals(75.0,p1.calcular_porcentaje_t(0,notas));
    }
    @Test
    public void calcularPorcentajeTest2(){
        // este metodo esta hecho para ver si el porcentaje se puede sumar para no llegar a
        // mas de 100 sumandolas antes de hagregarlo a la nota del arreglo
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0));
        notas.add(new Nota("prueba2",25.0));
        notas.add(new Nota("prueba3",30.0));
        Parte p1 = new Parte();
        assertEquals(90.0,p1.calcular_porcentaje_t(10.0,notas));
    }

    @Test
    public void carculerNotaNeceTest(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,7.0));
        notas.add(new Nota("prueba2",25.0,5.0));
        notas.add(new Nota("prueba3",25.0,5.0));
        Parte p1 = new Parte();
        p1.setNotas(notas);
        p1.setNota_ideal(6.0);
        assertEquals(7.0,p1.calcularNotaNecesaria());
    }
    @Test
    public void carculerNotaNeceTest2(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,5.0));
        notas.add(new Nota("prueba2",25.0,5.0));
        notas.add(new Nota("prueba3",25.0,5.0));
        Parte p1 = new Parte();
        p1.setNotas(notas);
        p1.setNota_ideal(5.0);
        assertEquals(5.0,p1.calcularNotaNecesaria());
    }
    @Test
    public void carculerNotaNeceTest3(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",30.0,6.0));
        notas.add(new Nota("prueba2",30.0,5.0));
        notas.add(new Nota("prueba3",30.0,3.0));
        Parte p1 = new Parte();
        p1.setNotas(notas);
        p1.setNota_ideal(4.5);
        assertEquals(3.0,(double) Math.round(p1.calcularNotaNecesaria()*100.0/100.0));
    }

    @Test
    public void calcularPromedioActualTest(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,5.0));
        notas.add(new Nota("prueba2",25.0,5.0));
        notas.add(new Nota("prueba3",25.0,5.0));
        Parte p1 = new Parte();
        assertEquals(3.75,p1.calcular_promedio_actual(notas));
    }

    @Test
    void calcularPromedioActualTest2(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0,4.0));
        notas.add(new Nota("prueba2",25.0,4.0));
        notas.add(new Nota("prueba3",25.0,4.0));
        Parte p1 = new Parte();
        assertEquals(3,p1.calcular_promedio_actual(notas));
    }


}
