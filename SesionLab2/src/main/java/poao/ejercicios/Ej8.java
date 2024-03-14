package poao.ejercicios;

public class Ej8 {
    static boolean esPrimo(int num){
        if (num<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int n=Integer.parseInt(System.console().readLine());
        if (esPrimo(n)){
            System.out.println("El número "+n+" es primo.");
        }
        else{
            System.out.println("El número "+n+" no es primo.");
        }
    }
}
