package poao.SesionLab2;

public class EjB5 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num=Integer.parseInt(System.console().readLine());
        System.out.println(num%2==0?"El número "+num+" es par.":"El número "+num+" es impar.");
    }
}
