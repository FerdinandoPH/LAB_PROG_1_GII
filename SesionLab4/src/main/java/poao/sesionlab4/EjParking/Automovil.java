package poao.sesionlab4.EjParking;

import java.time.LocalDate;
import java.time.Duration;
public class Automovil extends Vehiculo{
    public enum Tipo{
        TURISMO, TODOTERRENO, FURGONETA
    }
    private Tipo tipo;
    //region gettersYsetters
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    //endregion
    //region constructores
    public Automovil(String matricula, boolean abonado, Tipo tipo) {
        super(matricula, abonado);
        this.tipo = tipo;
    }
    public Automovil(String matricula, LocalDate fechaEntrada, boolean abonado, Tipo tipo) {
        super(matricula, fechaEntrada, abonado);
        this.tipo = tipo;
    }
    //endregion
    public double calcularImporte(LocalDate fechaSalida){
        double descuentoSiAbono=abonado?0.6:1;
        double minutos = Duration.between(fechaEntrada.atStartOfDay(), fechaSalida.atStartOfDay()).toMinutes();
        switch (this.tipo){
            case TURISMO:
                return minutos * 1.5/60*descuentoSiAbono;
            case TODOTERRENO:
                return minutos * 2.5/60*descuentoSiAbono;
            case FURGONETA:
                return minutos * 3.5/60*descuentoSiAbono;
            default:
                return 0;
        }
    }
    @Override
    public String toString() {
        return "Automovil{" + "matricula=" + matricula + ", fechaEntrada=" + fechaEntrada + ", abonado=" + abonado + ", tipo=" + tipo + '}';
    }

}
