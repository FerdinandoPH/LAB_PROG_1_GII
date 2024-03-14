package poao.sesionlab4.Ej5;

import java.time.LocalDate;

public class CarnetConducir {
    private String tipoPermiso;
    private LocalDate fechaExpedicion;
    //region gettersYSetters
    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }
    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
    public String getTipoPermiso() {
        return tipoPermiso;
    }
    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
    //endregion
    public CarnetConducir(String tipoPermiso, LocalDate fechaExpedicion) {
        this.tipoPermiso = tipoPermiso;
        this.fechaExpedicion = fechaExpedicion;
    }
    public CarnetConducir(String tipoPermiso) {
        this(tipoPermiso, LocalDate.now());
    }
    @Override
    public String toString() {
        return "CarnetConducir{" + "tipoPermiso=" + tipoPermiso + ", fechaExpedicion=" + fechaExpedicion + '}';
    }

    public LocalDate getFechaCaducidad(int años) {
        return fechaExpedicion.plusYears(años);
    }
}
