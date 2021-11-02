
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {

    @Test
    public void hay_valores_test(){
        //este metodo es para determinar si no hay valores para calular en las notas
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1"));
        notas.add(new Nota("prueba2"));
        notas.add(new Nota("prueba3"));
        Parte p1 = new Parte();
        assert(p1.no_hay_valores(notas));
    }

    @Test
    public void calcular_porcentaje_t_test(){
        // este metodo esta hecho para ver si el porcentaje se puede sumar para no llegar a
        // mas de 100 sumandolas antes de hagregarlo a la nota del arreglo
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0));
        notas.add(new Nota("prueba2",25.0));
        notas.add(new Nota("prueba3",25.0));
        Parte p1 = new Parte();
        assertEquals(100.0,p1.calcular_porcentaje_t(25.0,notas));
    }
    
    @Test
    public void carculer_nota_nece_test(){
        ArrayList<Nota> notas = new ArrayList<Nota>();
        notas.add(new Nota("prueba1",25.0));
        notas.add(new Nota("prueba2",25.0));
        notas.add(new Nota("prueba3",25.0));
        Parte p1 = new Parte();

        assertEquals(100.0,p1.calcular_porcentaje_t(25.0,notas));
    }
}
