package poao.strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        sc.close();
        StringTokenizer st=new StringTokenizer(cadena, " ");
        System.out.println("La cadena tiene "+st.countTokens()+" palabras");
        System.out.println("Las palabras son:");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
