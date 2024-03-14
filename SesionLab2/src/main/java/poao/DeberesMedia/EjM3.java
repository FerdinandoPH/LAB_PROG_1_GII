package poao.DeberesMedia;

// Media.java
// Calcula la nota media de los exámenes de un grupo de alumnos
// Utilización del bucle while y sentencias condicionales
import java.io.*;

public class EjM3 {

    public static void main(String args[]) throws IOException {
        int total=0, media;
        String nota;
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // inicialización de variables

        for (int i=0; i<5; i++) {
            System.out.println("\nTeclee calificación (A,B,C,D,E): ");
            nota = entrada.readLine();

            if (nota.equals("A")) {
                total +=4;
            } else if (nota.equals("B")) {
                total +=3;
            } else if (nota.equals("C")) {
                total +=2;
            } else if (nota.equals("D")) {
                total +=1;
            } else if (nota.equals("E")) {
                total +=0;
            }
        }

        media = total / 5;
        System.out.println("\nEl promedio del grupo es: " + media);
    }
}
