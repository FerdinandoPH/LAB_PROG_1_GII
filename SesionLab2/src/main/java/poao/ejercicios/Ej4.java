package poao.ejercicios;

public class Ej4 {
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
    if(!Ej3.esTriangulo(lados)){
      System.out.println("Estos lados no hay quien se los trague, no podrían ser un triángulo.");
    }
    else{
      double s=(lados[0]+lados[1]+lados[2])/2.0;
      System.out.println("El área del triángulo es "+Math.sqrt(s*(s-lados[0])*(s-lados[1])*(s-lados[2])));
    }
  }
}
