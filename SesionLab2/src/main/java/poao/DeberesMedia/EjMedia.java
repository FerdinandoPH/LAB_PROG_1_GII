package poao.DeberesMedia;

// Media.java
// Calcula la nota media de los exámenes de un grupo de alumnos
// Utilización del bucle while y sentencias condicionales
import java.io.*;

public class EjMedia {

    public static void main(String args[]) throws IOException {
        int contador, total, media;
        String nota;
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // inicialización de variables
        total = 0;
        contador = 1;

        while (contador <= 5) {
            System.out.println("\nTeclee calificación (A,B,C,D,E): ");
            nota = entrada.readLine();

            if (nota.equals("A")) {
                total = total + 4;
            } else if (nota.equals("B")) {
                total = total + 3;
            } else if (nota.equals("C")) {
                total = total + 2;
            } else if (nota.equals("D")) {
                total = total + 1;
            } else if (nota.equals("E")) {
                total = total + 0;
            }

            contador = contador + 1;
        }

        media = total / 5;
        System.out.println("\nEl promedio del grupo es: " + media);
    }
}
