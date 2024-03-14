package poao.ejercicios;
import java.util.Random;
public class Ej10 {
  public static void main(String[] args) {
    Random rand=new Random();
    int numero=rand.nextInt(101);
    int vidas=5;
    int respuesta=-1;
    System.out.println("Adivina un número entre el 0 y el 100");
    while (respuesta!=numero && vidas>0){
      System.out.print("Vamos, adivina: ");
      try{
        respuesta=Integer.parseInt(System.console().readLine());
      }
      catch (NumberFormatException e){
        System.out.println("Eso no es un número");
        continue;
      }
      if (respuesta!=numero){
        vidas-=1;
        if (respuesta<numero){
          System.out.println("Mal. Es mayor");
        }
        else{
          System.out.println("Mal. Es menor");
        }
        if (vidas>0)
          System.out.println((vidas>1?"Te quedan ":"Te queda ")+vidas+(vidas>1 ? " vidas":" vida"));
      }
    }
    if (vidas>0){
      System.out.println("BIEN HECHO");
    }
    else{
      System.out.println("Has perdido, era "+ Integer.toString(numero));
    }
  }
}
