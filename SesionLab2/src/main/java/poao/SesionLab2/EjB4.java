package poao.SesionLab2;

public class EjB4 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num1=Integer.parseInt(System.console().readLine());
        System.out.print("Otro: ");
        int num2=Integer.parseInt(System.console().readLine());
        System.out.println(num1==num2?"Los dos números son iguales":"El mayor es "+Math.max(num1,num2)+" y el menor es "+Math.min(num1,num2)+".");
    }
}
