package poao.ejercicios;

public class Ej1 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero positivo: ");
    int num=Integer.parseInt(System.console().readLine());
    int suma=0;
    for (int i=0;i<=num;i++){
      suma+=i;
    }
    System.out.println("La suma de los "+num+" primeros números enteros es "+suma);
  }
}
