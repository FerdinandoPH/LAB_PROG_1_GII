package poao.sesionlab4.EjParking;

import java.time.LocalDate;

public abstract class Vehiculo {
    protected String matricula;
    protected LocalDate fechaEntrada;
    protected boolean abonado;
    //region gettersYsetters
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public boolean isAbonado() {
        return abonado;
    }
    public void setAbonado(boolean esAbonado) {
        this.abonado = esAbonado;
    }
    //endregion
    //region constructores
    public Vehiculo(String matricula, LocalDate fechaEntrada, boolean abonado) {
        this.matricula = matricula;
        this.fechaEntrada = fechaEntrada;
        this.abonado = abonado;
    }
    public Vehiculo(String matricula,boolean abonado) {
        this.matricula = matricula;
        this.fechaEntrada = LocalDate.now();
        this.abonado = abonado;
    }
    //endregion
    public abstract double calcularImporte(LocalDate fechaSalida);
}
