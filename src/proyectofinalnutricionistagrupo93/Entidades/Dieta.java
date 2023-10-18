package proyectofinalnutricionistagrupo93.Entidades;

public class Dieta {
    protected int idDieta; //ID.    
    protected Comida comida;
    protected PlanNutricional dieta;
    protected Horario horario; //Horario.

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

    @Override
    public String toString() {
        return "DietaComida{" + "comida=" + comida + ", dieta=" + dieta + ", horario=" + horario + '}';
    }
    

   
}
