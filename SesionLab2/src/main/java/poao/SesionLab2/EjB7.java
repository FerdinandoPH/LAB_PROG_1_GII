package poao.SesionLab2;

public class EjB7 {
    public static void main(String[] args) {
        System.out.print("Introduce una cadena: ");
        String cadena=System.console().readLine();
        System.out.print("¿Cuántas veces la repito?: ");
        int veces=Integer.parseInt(System.console().readLine());
        System.out.println("A sus órdenes");
        for (int i=0;i<veces;i++){
            System.out.println(cadena);
        }
    }
}
