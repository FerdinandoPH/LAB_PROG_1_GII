package poao.ejercicios;

public class Ej2 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero positivo: ");
    int num=Integer.parseInt(System.console().readLine());
    long res=1;
    for (int i=1;i<=num;i++){
      res*=i;
    }
    System.out.println("El factorial de "+num+" es "+res);
  }
}
