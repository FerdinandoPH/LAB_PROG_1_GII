package poao.strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un nº de tfno: ");
        String tfno=sc.nextLine();
        sc.close();
        StringTokenizer st=new StringTokenizer(tfno, "-");
        System.out.println("Prefijo: "+st.nextToken());
        System.out.println("resto: "+st.nextToken());
    }
}
