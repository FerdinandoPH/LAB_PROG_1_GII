package poao.sesionlab4.vehiculosYLamparas;

public class PruebaVehiculos2 {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1234ABC", "Ford", "Focus");
        Vehiculo v2 = new Vehiculo("5678DEF", "Seat", "Ibiza", 100, true);
        Vehiculo v3 = new Vehiculo("91011GHI", "Renault", "Clio", 2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
