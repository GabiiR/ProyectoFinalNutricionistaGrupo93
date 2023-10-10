/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Entidades;

import java.time.LocalDate;

/**
 *
 * @author aldio
 */
public class Historial {
    protected int idHistorial;
    protected Paciente paciente;
    protected double peso;
    protected LocalDate fechaRegistro;

    public Historial() {
    }

    public Historial(Paciente paciente, double peso, LocalDate fechaRegistro) {
        this.paciente = paciente;
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idHistorial, Paciente paciente, double peso, LocalDate fechaRegistro) {
        this.idHistorial = idHistorial;
        this.paciente = paciente;
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Historial{" + "paciente=" + paciente + ", peso=" + peso + ", fechaRegistro=" + fechaRegistro + '}';
    }
   
}
