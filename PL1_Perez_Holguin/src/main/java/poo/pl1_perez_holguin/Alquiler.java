package poo.pl1_perez_holguin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Alquiler {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDateTime fechaComienzo;
    private LocalDateTime fechaFinal;
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDateTime getFechaComienzo() {
        return fechaComienzo;
    }
    public void setFechaComienzo(LocalDateTime fechaComienzo) {
        if (ChronoUnit.MINUTES.between(fechaComienzo,this.fechaFinal)<0)
        throw new IllegalArgumentException("La fecha de finalización no puede ser anterior a la fecha de comienzo");
        this.fechaComienzo = fechaComienzo;
    }
    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaFinal(LocalDateTime fechaFinal) {
        if (ChronoUnit.MINUTES.between(this.fechaComienzo,fechaFinal)<0)
        throw new IllegalArgumentException("La fecha de finalización no puede ser anterior a la fecha de comienzo");
        this.fechaFinal = fechaFinal;
    }
    public Alquiler(Vehiculo vehiculo, Cliente cliente, LocalDateTime fechaComienzo, LocalDateTime fechaFinal) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        if (ChronoUnit.MINUTES.between(fechaComienzo,fechaFinal)<0)
            throw new IllegalArgumentException("La fecha de finalización no puede ser anterior a la fecha de comienzo");
        this.fechaComienzo = fechaComienzo;
        this.fechaFinal = fechaFinal;
    }
    public double minutosAlquiler(){
        return ChronoUnit.MINUTES.between(fechaComienzo,fechaFinal);
    }
    public double calcularImporte(){
        // switch (this.vehiculo.getClass().getSimpleName()) {
        //     case "Patin":
        //         return this.minutosAlquiler()*0.1;
        //     case "Bicicleta":
        //         return this.minutosAlquiler()*0.2;
        //     default:
        //         return -1;
        // }
        if (this.vehiculo instanceof Patin)
            return this.minutosAlquiler()*0.1;
        else if (this.vehiculo instanceof Bicicleta)
            return this.minutosAlquiler()*0.2;
        else
            return -1;
    }
    @Override
    public String toString() {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy: HH:mm");
        return "vehiculo=[" + vehiculo.toString() + "], cliente=[" + cliente.toString() + "], fechaComienzo=" + fechaComienzo.format(dtf)
                + ", fechaFinal=" + fechaFinal.format(dtf);
    }
}
