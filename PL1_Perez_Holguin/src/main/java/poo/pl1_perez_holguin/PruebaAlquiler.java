package poo.pl1_perez_holguin;
import java.time.LocalDateTime;
import java.time.Month;
public class PruebaAlquiler {
    public static void main(String[] args) {
        System.out.println("\n\n");
        Cliente cl1=new Cliente("Pepito", "pepitoprueba@gmail.com", 913456789, new Tarjeta(454594325493249L,LocalDateTime.of(2028,Month.MARCH,12,15,54,00)));
        Patin p1=new Patin("123XA10", "Shiaomi", "Mi100", 264, 25, 99, 70);
        Alquiler alq1=new Alquiler(p1, cl1, LocalDateTime.of(2024,Month.MARCH,12,15,54,00), LocalDateTime.of(2024,Month.MARCH,12,16,05,00));
        System.out.println("Datos del alquiler alq1: ["+alq1.toString()+"]");
        System.out.println("El precio del alquiler 1 es de "+ alq1.calcularImporte()+"€");
        //Bicicleta b1=new Bicicleta("123XA10", "TheCatLong", "SuperBike", 999, 142, 96, 7); //Daría error por tener el mismo id
        Bicicleta b1=new Bicicleta("123XA11", "TheCatLong", "SuperBike", 999, 142, 96, 7);
        b1.setCargaActual(55); 
        System.out.println("Datos de la bicicleta b1: "+b1.toString());
        System.out.println("Nivel de batería de b1: "+b1.cadenaNivelBateria());
        Alquiler alq2=new Alquiler(b1, cl1, LocalDateTime.of(2024,Month.MARCH,12,15,54,00), LocalDateTime.of(2024,Month.MARCH,12,16,54,00));
        //alq2.setFechaFinal( LocalDateTime.of(2024,Month.FEBRUARY,23,16,38,00)); //Daría error porque la fecha de finalización no puede ser anterior a la fecha de comienzo
        alq2.setFechaFinal( LocalDateTime.of(2024,Month.MARCH,23,16,38,00));
        System.out.println("El precio del alquiler 2 es de "+ alq2.calcularImporte()+"€");
    }
}
