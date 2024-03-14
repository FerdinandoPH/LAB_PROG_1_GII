package poao.sesionlab4.EjParking;

public class TestVehiculos {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("1234ABC", true, Automovil.Tipo.TURISMO);
        System.out.println(automovil);
    }
}
