package proyectofinalnutricionistagrupo93.Entidades;

public class Comida {
    protected String nombre;
    protected String detalle;
    protected int gramos;

    public Comida(String nombre, String detalle, int gramos) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.gramos = gramos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }
}
