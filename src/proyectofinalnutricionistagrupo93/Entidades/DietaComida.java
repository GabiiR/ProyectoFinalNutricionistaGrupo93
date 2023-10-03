package proyectofinalnutricionistagrupo93.Entidades;

public class DietaComida {
    protected int id; //ID.
    
    protected Comida comida;
    protected Dieta dieta;

    public DietaComida() {
    }

    public DietaComida(Comida comida, Dieta dieta) {
        this.comida = comida;
        this.dieta = dieta;
    }

    public DietaComida(int id, Comida comida, Dieta dieta) {
        this.id = id;
        this.comida = comida;
        this.dieta = dieta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
