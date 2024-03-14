package poao.ejercicios;

public class Ej5 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num=Integer.parseInt(System.console().readLine());
        System.out.println("El número "+num+" tiene "+(int)Math.floor((double)Math.log10(Math.abs(num))+1)+" cifras.");
    }
}
