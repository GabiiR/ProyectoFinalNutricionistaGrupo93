package proyectofinalnutricionistagrupo93.Entidades;

import java.time.LocalDate;

public class Dieta {
    protected int idDieta; //ID.
    protected String nombre;
    
    protected Paciente paciente; //Paciente.java
    
    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal; //Finalizar dieta.
    
    protected double pesoInicial;
    protected double pesoFinal;
    protected boolean estado;

    public Dieta() {
    }

    public Dieta(String nombre, Paciente paciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(int idDieta, String nombre, Paciente paciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
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
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "nombre=" + nombre + ", paciente=" + paciente.getNombre() + ", fechaInicial=" +
                fechaInicial + ", fechaFinal=" + fechaFinal + ", pesoInicial=" + pesoInicial 
                + ", pesoFinal=" + pesoFinal + '}';
    }

}
