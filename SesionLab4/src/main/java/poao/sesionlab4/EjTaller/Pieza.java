package poao.sesionlab4.EjTaller;

public class Pieza {
    private String nombre;
    private double precio;
    //region gettersYsetters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //endregion
    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Pieza{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
}
