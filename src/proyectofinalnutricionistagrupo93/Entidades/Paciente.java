package proyectofinalnutricionistagrupo93.Entidades;

import java.time.LocalDate;

public class Paciente {
    private int idPaciente; //ID.
    
    private String nombre;
    private String apellido;
    private int dni;
    private String genero;
    private int edad;
    private float altura;
    private String mail;
    private String domicilio;
    private int telefono;
    private double pesoActual;
    private double pesoDeseado;
    private boolean estado = false;
    private LocalDate fechaFin; 

    public Paciente() {
    }

    public Paciente(int idPaciente, String nombre, int dni, String domicilio, int telefono, double pesoActual, double pesoDeseado, boolean estado) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.pesoActual = pesoActual;
        this.pesoDeseado = pesoDeseado;
        this.estado = estado;
    }

    public Paciente(String nombre, int dni, String domicilio, int telefono, double pesoActual, double pesoDeseado, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.pesoActual = pesoActual;
        this.pesoDeseado = pesoDeseado;
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoDeseado() {
        return pesoDeseado;
    }

    public void setPesoDeseado(double pesoDeseado) {
        this.pesoDeseado = pesoDeseado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
        public String getApellido() {
        return apellido;
    }

 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }
        
    public LocalDate getFechaFin() {
        return fechaFin;
    }

   
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    @Override
    public String toString() {
        return getNombre() +", "+ getDni();
    }


}
