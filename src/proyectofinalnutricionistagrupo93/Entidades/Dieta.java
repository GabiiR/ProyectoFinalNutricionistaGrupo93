package proyectofinalnutricionistagrupo93.Entidades;

import java.time.LocalDate;

public class Dieta {
    protected int idDieta;
    protected String nombre;
    
    protected Paciente Paciente; //Paciente.java
    
    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal; //Finalizar dieta.
    
    protected double pesoInicial;
    protected double pesoFinal;

    public Dieta() {
    }

    public Dieta(int idDieta, String nombre, Paciente Paciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.Paciente = Paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
    }
    
    public Dieta(String nombre, Paciente Paciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal) {
        this.nombre = nombre;
        this.Paciente = Paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
    }
    
}
