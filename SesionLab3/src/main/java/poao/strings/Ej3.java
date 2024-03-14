package poao.strings;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena:");
        String cadena=sc.nextLine();
        sc.close();
        char [] vocales=new char[]{'a', 'e', 'i', 'o', 'u'};
        int [] contadorVocales=new int[5];
        for (int i=0; i<cadena.length(); i++) {
            for (int j=0; j<vocales.length; j++) {
                if (Character.toLowerCase(cadena.charAt(i))==vocales[j]) {
                    contadorVocales[j]++;
                }
            }
        }
        for (int i=0; i<vocales.length; i++) {
            System.out.println("La vocal "+vocales[i]+" aparece "+contadorVocales[i]+" veces");
        }
    }
}
