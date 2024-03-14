package poao.sesionlab4.vehiculosYLamparas;

public class TesteoLampara {
    public static void main(String[] args) {
        Lampara l1 = new Lampara();
        Lampara l2 = new Lampara(true, 12.5);
        l1.setIntensidad(10);
        System.out.println(l1);
        System.out.println(l2);
    }
}
