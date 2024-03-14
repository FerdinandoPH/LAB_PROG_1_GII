package poao.ejercicios;
import java.util.Arrays;
public class Ej7 {
    static int diasMes(int mes, int año){
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return Ej6.esBisiesto(año)?29:28;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce la fecha 1 (DD/MM/AAAA):");
        String fecha1=System.console().readLine();
        System.out.println("Introduce la fecha 2 (DD/MM/AAAA):");
        String fecha2=System.console().readLine();
        String[] partes1=fecha1.split("/");
        String[] partes2=fecha2.split("/");
        int dia1=Integer.parseInt(partes1[0]);
        int mes1=Integer.parseInt(partes1[1]);
        int año1=Integer.parseInt(partes1[2]);
        int dia2=Integer.parseInt(partes2[0]);
        int mes2=Integer.parseInt(partes2[1]);
        int año2=Integer.parseInt(partes2[2]);

        if(Ej6.esValido(dia1,mes1,año1) && Ej6.esValido(dia2,mes2,año2)){
           int dias=0;
           int añoDesde=año1<año2?año1:año2;
           int añoHasta=año1>año2?año1:año2;
           int mesDesde=año1<año2?mes1:año1>año2?mes2:Math.min(mes1,mes2);
           int mesHasta=año1>año2?mes1:año1<año2?mes2:Math.max(mes1,mes2);
           int diaDesde=año1<año2?dia1:año1>año2?dia2:mes1<mes2?dia1:mes1>mes2?dia2:Math.min(dia1,dia2);
           int diaHasta=año1>año2?dia1:año1<año2?dia2:mes1>mes2?dia1:mes1<mes2?dia2:Math.max(dia1,dia2);
           for (int i=añoDesde+1;i<añoHasta;i++){
               dias+=i==0?0:Ej6.esBisiesto(i)?366:365;
           }
           if (añoDesde==añoHasta){
                for (int i=mesDesde+1;i<mesHasta;i++){
                    dias+=diasMes(i,añoDesde);
                }
           }
           else{
                for (int i=mesDesde+1;i<12;i++){
                    dias+=diasMes(i,añoDesde);
                }
                for (int i=1;i<mesHasta;i++){
                    dias+=diasMes(i,añoHasta);
                    }
            }
            if (año1==año2&&mes1==mes2)
                dias+=Math.abs(dia1-dia2);
            else{
                dias+=Arrays.asList(1,3,5,7,8,10,12).contains(mesDesde)?31-diaDesde:Arrays.asList(4,6,9,11).contains(mesDesde)?30-diaDesde:Ej6.esBisiesto(añoDesde)?29-diaDesde:28-diaDesde;
                dias+=diaHasta;
            }
            System.out.println("Hay "+dias+" días entre las fechas "+fecha1+" y "+fecha2+".");
        }
        else{
            System.out.println("Alguna de las fechas introducidas no es válida.");
        }
        
    }
}
