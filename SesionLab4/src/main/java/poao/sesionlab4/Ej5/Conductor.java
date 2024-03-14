package poao.sesionlab4.Ej5;

import java.time.LocalDate;

public class Conductor {
    private String dni;
    private String nombre;
    private CarnetConducir permiso;

    public Conductor(String dni, String nombre, String tipoPermiso) {
        this.dni = dni;
        this.nombre = nombre;
        this.permiso = new CarnetConducir(tipoPermiso);
    }
    public Conductor(String dni, String nombre, String tipoPermiso, LocalDate fechaExpedicion) {
        this.dni = dni;
        this.nombre = nombre;
        this.permiso = new CarnetConducir(tipoPermiso, fechaExpedicion);
    }
    //region gettersYSetters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public CarnetConducir getPermiso() {
        return permiso;
    }

    public void setPermiso(CarnetConducir permiso) {
        this.permiso = permiso;
    }
    //endregion
    @Override
    public String toString() {
        return "Conductor{" + "dni=" + dni + ", nombre=" + nombre
                + ", permiso=" + permiso.toString() + '}';
    }
}
