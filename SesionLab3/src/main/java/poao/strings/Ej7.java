package poao.strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        sc.close();
        StringTokenizer st=new StringTokenizer(cadena, " ");
        StringBuilder sb=new StringBuilder();
        while(st.hasMoreTokens()) {
            sb.insert(0," "+st.nextToken());
        }
        System.out.println("La cadena al revés es: "+sb.toString().substring(1));
    }
}
