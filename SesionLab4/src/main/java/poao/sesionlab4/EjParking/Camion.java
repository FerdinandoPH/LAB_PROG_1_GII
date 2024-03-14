package poao.sesionlab4.EjParking;
import java.time.LocalDate;
import java.time.Duration;
public class Camion extends Vehiculo{
    private int ejes;
    //region gettersYsetters
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    //endregion
    //region constructores
    public Camion(String matricula, boolean abonado, int ejes) {
        super(matricula, abonado);
        this.ejes = ejes;
    }
    public Camion(String matricula, LocalDate fechaEntrada, boolean abonado, int ejes) {
        super(matricula, fechaEntrada, abonado);
        this.ejes = ejes;
    }
    //endregion
    @Override
    public double calcularImporte(LocalDate fechaSalida){
        double descuentoSiAbono=abonado?0.6:1;
        double minutos = Duration.between(fechaEntrada, fechaSalida).toMinutes();
        return minutos * (ejes>3?6.5:4.5)/60*descuentoSiAbono;
    }
    @Override
    public String toString() {
        return "Camion{" + "matricula=" + matricula + ", fechaEntrada=" + fechaEntrada + ", abonado=" + abonado + ", ejes=" + ejes + '}';
    }
}
