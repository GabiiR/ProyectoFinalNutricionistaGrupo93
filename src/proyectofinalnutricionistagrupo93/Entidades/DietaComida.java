package proyectofinalnutricionistagrupo93.Entidades;

public class DietaComida {
    protected int idDietaComida; //ID.
    
    protected Comida comida;
    protected Dieta dieta;
    protected Horario horario;

    public DietaComida() {
    }

    public DietaComida(Comida comida, Dieta dieta) {
        this.comida = comida;
        this.dieta = dieta;
    }

    public DietaComida(int idDietaComida, Comida comida, Dieta dieta) {
        this.idDietaComida = idDietaComida;
        this.comida = comida;
        this.dieta = dieta;
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

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
}
