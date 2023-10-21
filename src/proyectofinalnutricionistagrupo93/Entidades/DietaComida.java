package proyectofinalnutricionistagrupo93.Entidades;

public class DietaComida {
    private int idDietaComida; //ID.  
    private int idComida;
    private int idDieta;
    private Horario horario; //Horario.
    private int porcion;
    private boolean estado;
    

    public DietaComida() {
    }

    public DietaComida(int idComida, int idDieta, Horario horario, int porcion, boolean estado) {
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.horario = horario;
        this.porcion = porcion;
        this.estado = estado;
    }

    public DietaComida(int idDietaComida, int idComida, int idDieta, Horario horario, int porcion, boolean estado) {
        this.idDietaComida = idDietaComida;
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.horario = horario;
        this.porcion = porcion;
        this.estado = estado;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DietaComida{" + "horario=" + horario + ", porcion=" + porcion + ", estado=" + estado + '}';
    }

   
}
