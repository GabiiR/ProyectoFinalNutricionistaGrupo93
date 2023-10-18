package proyectofinalnutricionistagrupo93.Entidades;

public class Dieta {
    protected int idDietaComida; //ID.
    
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

    public Dieta(int idDietaComida, Comida comida, PlanNutricional dieta, Horario horario) {
        this.idDietaComida = idDietaComida;
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
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
