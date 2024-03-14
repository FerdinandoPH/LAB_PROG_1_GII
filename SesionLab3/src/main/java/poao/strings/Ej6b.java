package poao.strings;
import java.util.Scanner;

public class Ej6b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        sc.close();
        String[] palabras=cadena.split(" ");
        System.out.println("La cadena tiene "+palabras.length+" palabras");
        System.out.println("Las palabras son:");
        for (String i: palabras) {
            System.out.println(i);
        }
    }
}
