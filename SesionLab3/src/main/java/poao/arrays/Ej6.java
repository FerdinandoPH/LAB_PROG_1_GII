package poao.arrays;
import java.util.Scanner;
import java.util.Random;
public class Ej6 {
    public static void main(String[] args) {
        System.out.print("Introduce 0 para piedra, 1 para papel y 2 para tijeras: ");
        Scanner sc=new Scanner(System.in);
        int usuario=sc.nextInt();
        int pc=new Random().nextInt(3);
        sc.close();
        int [][] tablaVictorias=new int[][]{{0,1,-1},{-1,0,1},{1,-1,0}};
        switch (tablaVictorias[pc][usuario]) {
            case 1:
                System.out.println("Gana el usuario");
                break;
            case -1:
                System.out.println("Gana el PC");
                break;
            case 0:
                System.out.println("Empate");
                break;
        }
    }
}
