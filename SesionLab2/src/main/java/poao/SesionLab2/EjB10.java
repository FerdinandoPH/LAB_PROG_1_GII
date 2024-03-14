package poao.SesionLab2;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Arrays;
public class EjB10 {
    public static void main(String[] args) {
        Random rand=new Random();
        Object[] datos=new Object[] {new int[12],new double[12],new double[12]};
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i=0;i<12;i++){
            ((int[])datos[0])[i]=rand.nextInt(501)+1000;
            ((double[])datos[1])[i]=Double.valueOf(df.format(0.5+rand.nextDouble()).replace(',','.'));
            ((double[])datos[2])[i]=Double.valueOf(df.format((double)((int[])datos[0])[i]*((double[])datos[1])[i]).replace(',','.'));
        }
        System.out.println("Litros  | Precio  | Total");
        System.out.println("--------|---------|-------");
        for (int i=0;i<12;i++){
            System.out.println(((int[])datos[0])[i]+"    | "+df.format(((double[])datos[1])[i]).replace(',','.')+"    | "+((double[])datos[2])[i]);
        }
        System.out.println("--------------------------");
        System.out.println("El total de ganancias es: "+df.format(Arrays.stream((double[])datos[2]).sum()).replace(',','.')+"€");
    }
}
