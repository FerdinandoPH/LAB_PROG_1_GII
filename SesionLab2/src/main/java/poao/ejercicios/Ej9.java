package poao.ejercicios;

public class Ej9 {
    static int proximoPrimo(int num){
        for (int i=num+1;;i++){
            if (Ej8.esPrimo(i)){
                return i;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int n=Integer.parseInt(System.console().readLine());
        System.out.println("El siguiente número primo es "+proximoPrimo(n)+".");
    }
}
