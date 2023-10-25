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
    protected int idPaciente;
    protected double pesoControl;
    protected LocalDate fechaRegistro;
    private boolean estado;

    public Historial() {
    }

    public Historial(int idPaciente, double pesoControl, LocalDate fechaRegistro, boolean estado) {
        this.idPaciente = idPaciente;
        this.pesoControl = pesoControl;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public Historial(int idHistorial, int idPaciente, double pesoControl, LocalDate fechaRegistro, boolean estado) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.pesoControl = pesoControl;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getPesoControl() {
        return pesoControl;
    }

    public void setPesoControl(double pesoControl) {
        this.pesoControl = pesoControl;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Historial{" + "idPaciente=" + idPaciente + ", pesoControl=" + pesoControl + ", fechaRegistro=" + fechaRegistro + '}';
    }

   
 
}
