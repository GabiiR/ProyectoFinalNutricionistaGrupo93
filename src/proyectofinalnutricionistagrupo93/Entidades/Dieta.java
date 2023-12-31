package proyectofinalnutricionistagrupo93.Entidades;

import java.time.LocalDate;

public class Dieta {
    protected int idDieta; //ID.
    protected String nombre;
    
    protected int idPaciente; //Paciente.java
    
    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal; //Finalizar dieta.
    
    protected double pesoInicial;
    protected double pesoObjetivo;
    protected boolean estado;

    public Dieta() {
    }

    public Dieta(String nombre, int idPaciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoObjetivo, boolean estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoObjetivo = pesoObjetivo;
        this.estado = estado;
    }

    public Dieta(int idDieta, String nombre, int idPaciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoObjetivo, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoObjetivo = pesoObjetivo;
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

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public double getPesoObjetivo() {
        return pesoObjetivo;
    }

    public void setPesoObjetivo(double pesoObjetivo) {
        this.pesoObjetivo = pesoObjetivo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre + ", idPaciente=" + idPaciente +", pesoInicial=" + pesoInicial + ", pesoObjetivo=" + pesoObjetivo;
    }

   
}
