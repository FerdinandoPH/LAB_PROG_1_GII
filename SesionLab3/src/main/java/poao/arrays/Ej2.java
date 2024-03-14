package poao.arrays;
import java.util.Random;
public class Ej2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int letras[] = new int[50];
        int numeroVocales=0;
        for (int i = 0; i < 50; i++) {
            letras[i] = rand.nextInt(97,123);
            if ("aeiou".indexOf(letras[i])!=-1){
                numeroVocales++;
            }
        }
        System.out.println("El número de vocales es: " + numeroVocales);
    }
}
