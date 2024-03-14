package poao.strings;
import java.util.Scanner;
public class Ej1 {
    public static String rotarCadena(String cadena, int rotaciones) {
        return cadena.substring(rotaciones)+cadena.substring(0, rotaciones);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        System.out.print("Introduce el nº de rotaciones del 1er caracter: ");
        int rotaciones=sc.nextInt();
        sc.close();
        System.out.print("Te queda: ");
        System.out.println(rotarCadena(cadena, rotaciones));
    }
}
