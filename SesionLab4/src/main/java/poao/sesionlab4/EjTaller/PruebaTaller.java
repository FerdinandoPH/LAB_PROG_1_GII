package poao.sesionlab4.EjTaller;

public class PruebaTaller {
    public static void main(String[] args) {
        Taller taller = new Taller("Taller de Prueba", "123456789", 50);
        Vehiculo vehiculo = new Vehiculo("1234ABC", "Seat", "Ibiza");
        Pieza pieza1 = new Pieza("Rueda", 100);
        Pieza pieza2 = new Pieza("Faro", 200);
        vehiculo.addPieza(pieza1);
        vehiculo.addPieza(pieza2);
        System.out.println(taller.repararVehiculo(vehiculo, 2));
    }
}
