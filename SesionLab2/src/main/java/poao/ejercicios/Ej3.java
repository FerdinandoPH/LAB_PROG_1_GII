package poao.ejercicios;
import java.util.Arrays;
public class Ej3 {
  public static void main(String[] args) {
    int lados[]=new int[3];
    System.out.println("Introduce los lados de un triángulo:");
    for (int i=0;i<3;i++){
      System.out.print("Lado "+(i+1)+": ");
      int nuevoLado;
      try{
        nuevoLado=Integer.parseInt(System.console().readLine());
        if (nuevoLado<=0){
          throw new Exception();
        }
      }
      catch(Exception e){
        System.out.println("El lado debe ser un número entero positivo.");
        i--;
        continue;
      }
      lados[i]=nuevoLado;
    }
    Arrays.sort(lados);
    System.out.println(Arrays.toString(lados));
    if (lados[0]+lados[1]>lados[2]){
      System.out.println("Estos lados podrían ser un triángulo.");
    }
    else{
      System.out.println("Estos lados no hay quien se los trague, no podrían ser un triángulo.");
    }
  }
  public static boolean esTriangulo(int lados[]){
    Arrays.sort(lados);
    return lados[0]+lados[1]>lados[2];
  }
}
