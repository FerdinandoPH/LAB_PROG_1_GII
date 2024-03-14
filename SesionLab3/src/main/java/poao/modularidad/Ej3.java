package poao.modularidad;

public class Ej3 {
    public static int Mayor(int a, int b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        System.out.print("Dime el primer número: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Dime el segundo número: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("El número mayor es: " + Mayor(a,b));
    }
}
