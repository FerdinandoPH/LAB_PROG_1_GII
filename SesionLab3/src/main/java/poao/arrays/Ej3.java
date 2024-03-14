package poao.arrays;

import java.util.Scanner;
public class Ej3 {
    public static char letraDNI(int num){
        char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[num%23];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.println("Introduce el número de tu DNI:");
        int num = sc.nextInt();
        char letra = letraDNI(num);
        sc.close();
        //System.out.println("Tu DNI completo es: " + num + "-"+letra);
        System.out.println(num+"-"+letra);
    }
}
