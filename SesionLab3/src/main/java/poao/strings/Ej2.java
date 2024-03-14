package poao.strings;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        System.out.print("Introduce un caracter: ");
        char caracter=sc.next().charAt(0);
        sc.close();
        //Poner los índices en los que aparece el caracter
        System.out.println("El caracter "+caracter+" aparece en la cadena en los siguientes índices:");
        for (int i=0; i<cadena.length(); i++) {
            if (cadena.charAt(i)==caracter) {
                System.out.print((i+1)+", ");
            }
        }
    }
}
