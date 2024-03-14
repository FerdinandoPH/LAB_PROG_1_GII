package poo.pl1_perez_holguin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarjeta {
    private long numero;
    private LocalDateTime fechaCaducidad;
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public LocalDateTime getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public Tarjeta(long numero, LocalDateTime fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
    @Override
    public String toString() {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy: HH:mm");
        return "numero=" + numero + ", fechaCaducidad=" + fechaCaducidad.format(dtf);
    }
    
}
