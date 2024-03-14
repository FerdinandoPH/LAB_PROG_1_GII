package poao.strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.print("Introduce una cadena: ");
        String cadena=sc.nextLine();
        sc.close();
        if (cadena.length()==0) {
            System.out.println("");
            return;
        }
        StringTokenizer st=new StringTokenizer(cadena, " ");
        StringBuilder sb=new StringBuilder();
        while(st.hasMoreTokens()) {
            sb.insert(0," "+st.nextToken());
        }
        //System.out.println("La cadena al revés es: "+sb.toString().substring(1));
        System.out.println(sb.toString().substring(1));
    }
}
