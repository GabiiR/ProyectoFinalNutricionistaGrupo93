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

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }
}
