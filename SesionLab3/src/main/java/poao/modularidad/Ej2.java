package poao.modularidad;

public class Ej2{
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
    public static void ImprimirRango(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (esPar(i)) {
                System.out.print(i);
                if (i < b) {
                    System.out.print(", ");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Dame el número inicial: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Dame el número final: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("Los números pares entre " + a + " y " + b + " son:");
        ImprimirRango(a, b);
    }
}

