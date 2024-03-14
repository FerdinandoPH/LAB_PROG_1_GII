package poao.SesionLab2;

public class EjB3 {
    public static void main(String[] args) {
        double puntos[][]=new double[2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print("Introduce la coordenada "+(i+1)+","+(j+1)+": ");
                puntos[i][j]=Double.parseDouble(System.console().readLine());
            }
        }
        if(puntos[1][0]-puntos[0][0]==0){
            System.out.println("La pendiente entre los puntos es infinita.");
            return;
        }
        System.out.println("La pendiente entre los puntos es: "+(puntos[1][1]-puntos[0][1])/(puntos[1][0]-puntos[0][0])+".");
    }
}
