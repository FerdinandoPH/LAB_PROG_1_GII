package poo.pl1_perez_holguin;

public class Cliente {
    private String nombre;
    private String correoElectronico;
    private long telefono;
    private Tarjeta tarjeta;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    public Cliente(String nombre, String correoElectronico, long telefono, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.tarjeta = tarjeta;
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono
                + ", tarjeta=[" + tarjeta.toString() + "]";
    }
    
}
