package poao.SesionLab2;

public class EjB9 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int n=Integer.parseInt(System.console().readLine());
        System.out.println("El triángulo rectángulo formado es: ");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
