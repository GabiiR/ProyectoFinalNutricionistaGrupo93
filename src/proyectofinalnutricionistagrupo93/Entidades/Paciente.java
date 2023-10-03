package proyectofinalnutricionistagrupo93.Entidades;

public class Paciente {
    protected int idPaciente;
    
    protected String nombreCompleto;
    protected int dni;
    protected String domicilio;
    protected int telefono;

    public Paciente() {
    }

    public Paciente(int idPaciente, String nombreCompleto, int dni, String domicilio, int telefono) {
        this.idPaciente = idPaciente;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Paciente(String nombreCompleto, int dni, String domicilio, int telefono) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }    

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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

    public void agregarPaciente(Paciente pacienteActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
