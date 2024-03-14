package poao.strings;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el DNI: ");
        String dni=sc.nextLine();
        sc.close();
        if (dni.length()!=9) {
            System.out.println("El DNI debe tener 9 caracteres");
            return;
        }
        int numero=Integer.parseInt(dni.substring(0, dni.length()-1));
        char letra=dni.charAt(dni.length()-1);
        char [] tablaDNI=new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        if (tablaDNI[numero%23]==letra) {
            System.out.println("El DNI es correcto");
        } else {
            System.out.println("El DNI es incorrecto");
        }
    }
}
