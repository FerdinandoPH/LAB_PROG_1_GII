package poao.strings;
import java.util.Scanner;
public class Ej5b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un nº de tfno: ");
        String tfno=sc.nextLine();
        sc.close();
        String[] partes=tfno.split("-");
        System.out.println("Prefijo: "+partes[0]);
        System.out.println("resto: "+partes[1]);
    }
}
