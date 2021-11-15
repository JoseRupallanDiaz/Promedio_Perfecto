public class Materia implements gestionarNotas {

    private String nombre;
    private double notaIdeal;
    private Maestro maestro;
    private Parte teorica;
    private Parte practica;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.practica = new Parte();
        this.teorica = new Parte(100);
    }

    public Materia(String nombre,Parte teorica,Parte practica) {
        this.nombre = nombre;
        this.practica =practica;
        this.teorica = teorica;
    }

    public void setPractica(Parte practica) {
        this.practica = practica;
    }

    public Parte getTeorica(){
        return this.teorica;
    }

    public Parte getPractica(){
        return this.practica;
    }

    public void setTeorica(Parte teorica) {
        this.teorica = teorica;
    }

    public void setNotaIdeal(double notaIdeal) {
        this.notaIdeal = notaIdeal;
    }

    public double getNotaIdeal() {
        return notaIdeal;
    }

    public void agregar_maestro(String nombre) {
        this.maestro = new Maestro(nombre);
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void verNotas() {
        System.out.println("Practico (" + this.practica.getPorcentaje() + "%)");
        this.practica.verNotas();
        System.out.println("Teorico (" + this.teorica.getPorcentaje() + "%)");
        this.teorica.verNotas();
    }

    @Override
    public double calcularNotaNecesaria() {
        double nota_necesaria = 0;
        if(practica.estanTosdasLasNotas()&& !teorica.estanTosdasLasNotas()){
            nota_necesaria = (notaIdeal -(practica.calcularPromedioActual(practica.getNotas()) *practica.getPorcentaje()/100))*(Math.pow(teorica.getPorcentaje()/100,-1));
        }
        else if(teorica.estanTosdasLasNotas() && !practica.estanTosdasLasNotas()){
            nota_necesaria=(notaIdeal -(teorica.calcularPromedioActual(teorica.getNotas()) *teorica.getPorcentaje()/100))*(Math.pow(practica.getPorcentaje()/100,-1));
        }
        else if(teorica.estanTosdasLasNotas() && practica.estanTosdasLasNotas()){
            nota_necesaria = 0;
        }
        else {
            nota_necesaria = notaIdeal;
        }
        return nota_necesaria;
    }

    public boolean  todoCalificado(){
        if(practica.estanTosdasLasNotas() && teorica.estanTosdasLasNotas()){
            return true;
        }
        return false;
    }

    public double calcularPromedio(){
        return ((practica.calcularPromedioActual(practica.getNotas())+teorica.calcularPromedioActual(teorica.getNotas()))/2);
    }
}
