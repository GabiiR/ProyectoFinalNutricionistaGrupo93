package proyectofinalnutricionistagrupo93.Entidades;

public class Dieta {
    private int idDieta; //ID.    
    private Comida comida;
    private PlanNutricional dieta;
    private Horario horario; //Horario.
    private int idPlanNutricional;
    private int idComida;
    private int porcion;
    private boolean estado;
    

    public Dieta() {
    }

    public Dieta(Comida comida, PlanNutricional dieta, Horario horario) {
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
    }

    public Dieta(int idDieta, Comida comida, PlanNutricional dieta, Horario horario) {
        this.idDieta = idDieta;
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDietaComida) {
        this.idDieta = idDietaComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public PlanNutricional getDieta() {
        return dieta;
    }

    public void setDieta(PlanNutricional dieta) {
        this.dieta = dieta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    public int getIdPlanNutricional() {
        return idPlanNutricional;
    }

   
    public void setIdPlanNutricional(int idPlanNutricional) {
        this.idPlanNutricional = idPlanNutricional;
    }

    
    public int getIdComida() {
        return idComida;
    }

   
    public void setIdComida(int idComida) {
        this.idComida = idComida;
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
        return "DietaComida{" + "comida=" + getComida() + ", dieta=" + getDieta() + ", horario=" + getHorario() + '}';
    }   
}
