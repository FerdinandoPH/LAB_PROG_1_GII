package poao.sesionlab4.EjTaller;

public class Taller {
    private String nombre;
    private String telefono;
    private double precioHora;
    //region gettersYsetters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public double getPrecioHora() {
        return precioHora;
    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    //endregion
    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }
    @Override
    public String toString() {
        return "Taller{" + "nombre=" + nombre + ", telefono=" + telefono + ", precioHora=" + precioHora + '}';
    }
    public double repararVehiculo(Vehiculo vehiculo, double horas){
        double precio=0;
        for (Pieza pieza: vehiculo.getPiezasArregladas()) {
            precio+=pieza.getPrecio();
        }
        return precio+precioHora*horas;
    }
}
