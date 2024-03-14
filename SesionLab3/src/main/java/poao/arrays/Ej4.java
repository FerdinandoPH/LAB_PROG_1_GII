package poao.arrays;
import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        double tabla[][]=new double[3][20];
        Object retenciones[]=new Object [] {new int[]{17708,33008,53408,120001,175001,300001},new double[]{0.24,0.3,0.4,0.47,0.49,0.51}};
        for (int i=0;i<20;i++){
            tabla[0][i]=rand.nextInt(300001)/100.0;
            for (int j=0;j<((int[])retenciones[0]).length;j++){
                if (tabla[0][i]<((int[])retenciones[0])[j]){
                    tabla[1][i]=tabla[0][i]*(double)((double[])retenciones[1])[j];
                    break;
                }
            }
            tabla[2][i]=tabla[0][i]-tabla[1][i];
        }
        sc.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-ES"));
        nf.setMaximumFractionDigits(2);
        for (int i=0;i<20;i++){
            //System.out.println("Sueldo del empleado "+i+": SB:"+tabla[0][i]+" - R: "+tabla[1][i]+" -SN: "+tabla[2][i]);
        System.out.println("Sueldo del empleado "+i+": SB:"+nf.format(tabla[0][i])+" - R: "+nf.format(tabla[1][i])+" -SN: "+nf.format(tabla[2][i]));
        }
    }
}
