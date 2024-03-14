package poao.arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ej5 {
    public static int numerosAJugar=6;
    public static int[] jugar(){
        int [] numeros=new int[numerosAJugar];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<numerosAJugar;i++){
            System.out.println("Introduce el número "+(i+1)+" que vas a jugar: ");
            int respuesta=sc.nextInt();
            if (respuesta<1 || respuesta>49||Arrays.stream(numeros).anyMatch(x -> x == respuesta)){
                System.out.println("El número introducido no es válido");
                i--;
            }else{
                numeros[i]=respuesta;
            }
        }
        sc.close();
        return numeros;
    }
    public static int[] sortear(){
        int [] numeros=new int[numerosAJugar];
        Random rand = new Random();
        for (int i=0;i<numerosAJugar;i++){
            int respuesta=rand.nextInt(49)+1;
            if (Arrays.stream(numeros).anyMatch(x -> x == respuesta)){
                i--;
            }else{
                numeros[i]=respuesta;
            }
        }
        return numeros;
    }
    public static int comprobar(int[] jugados,int[] sorteados){
        int aciertos=0;
        for (int numero:jugados){
            if (Arrays.stream(sorteados).anyMatch(x -> x == numero)){
                aciertos++;
            }
        }
        return aciertos;
    }
    public static void imprimir(int[] jugados,int[] sorteados,int aciertos){
        System.out.println("Números jugados: "+Arrays.toString(jugados));
        System.out.println("Números sorteados: "+Arrays.toString(sorteados));
        System.out.println("Aciertos: "+aciertos);
    }
    public static void main(String[] args) {
        int[] jugados=jugar();
        int[] sorteados=sortear();
        int aciertos=comprobar(jugados,sorteados);
        imprimir(jugados,sorteados,aciertos);
    }
    
}
