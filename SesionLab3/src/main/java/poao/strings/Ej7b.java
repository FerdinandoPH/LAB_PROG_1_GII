package poao.strings;
import java.util.Scanner;
public class Ej7b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        sc.close();
        String[] palabras=cadena.split(" ");
        StringBuilder sb=new StringBuilder();
        for (String i: palabras) {
            sb.insert(0," "+i);
        }
        System.out.println("La cadena al revés es: "+sb.toString().substring(1));
    }
}
