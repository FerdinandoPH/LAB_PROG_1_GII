package poao.SesionLab2;
public class EjB6 {
    public static void main(String[] args) {
        System.out.print("Escribe una hora en formato HH:MM:SS: ");
        String horaString=System.console().readLine();
        if (horaString.contains("-") || horaString.length()!=8 || horaString.charAt(2)!=':' || horaString.charAt(5)!=':'){
            throw new Error("La hora introducida no es válida.");
        }
        String[] tiempo=horaString.split(":");
        if (Integer.parseInt(tiempo[0])>23 || Integer.parseInt(tiempo[1])>59 || Integer.parseInt(tiempo[2])>59){
            throw new Error("La hora introducida no es válida.");
        }
        tiempo[2]=tiempo[2].equals("59")? "00":Integer.parseInt(tiempo[2])<10?"0"+(Integer.parseInt(tiempo[2])+1):Integer.toString(Integer.parseInt(tiempo[2])+1);
        tiempo[1]=tiempo[2].equals("00")?tiempo[1].equals("59")?"00":Integer.parseInt(tiempo[1])<10?"0"+(Integer.parseInt(tiempo[1])+1):Integer.toString(Integer.parseInt(tiempo[1])+1):tiempo[1];
        tiempo[0]=tiempo[1].equals("00")?tiempo[0].equals("23")?"00":Integer.parseInt(tiempo[0])<10?"0"+(Integer.parseInt(tiempo[0])+1):Integer.toString(Integer.parseInt(tiempo[0])+1):tiempo[0];
        System.out.println("La hora un segundo después es: "+tiempo[0]+":"+tiempo[1]+":"+tiempo[2]+".");
    }
    
}
