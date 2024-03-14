package poao.ejercicios;

public class Ej6 {
    public static boolean esBisiesto(int año){
        return (año%4==0 && año%100!=0) || año%400==0;
    }
    public static boolean esValido(int dia, int mes, int año){
        if (mes<1 || mes>12||dia<1||año==0){
            return false;
        }
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return dia<=31;
            case 4: case 6: case 9: case 11:
                return dia<=30;
            case 2:
                return esBisiesto(año)?dia<=29:dia<=28;
        }
        return false;
    }
  public static void main(String[] args) {
    System.out.println("Introduce una fecha en formato DD/MM/AAAA:");
    String fecha=System.console().readLine();
    String[] partes=fecha.split("/");
    int dia=Integer.parseInt(partes[0]);
    int mes=Integer.parseInt(partes[1]);
    int año=Integer.parseInt(partes[2]);
    if(esValido(dia,mes,año)){
        System.out.println("La fecha "+fecha+" es válida.");
    }
    else{
        System.out.println("La fecha "+fecha+" no es válida.");
    }
  }
  
}
