package poao.arrays;
import java.util.Random;
import java.util.Arrays;
public class Ej1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nums[] = new int[100];
        char paridad[]= new char[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = rand.nextInt(1,501);
        }
        Arrays.sort(nums);
        for (int i = 0; i < 100; i++) {
            paridad[i]= nums[i]%2==0 ? 'p' : 'i';
        }
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(nums[i*10+j] + ""+ paridad[i*10+j] + "-");
            }
            System.out.println();
        }
    }
}
