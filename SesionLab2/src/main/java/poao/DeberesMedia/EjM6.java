package poao.DeberesMedia;

// Media.java
// Calcula la nota media de los exámenes de un grupo de alumnos
// Utilización del bucle while y sentencias condicionales
import java.io.*;

public class EjM6 {

    public static void main(String args[]) throws IOException {
        int total=0;
        double media;
        String nota;
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // inicialización de variables

        for (int i=0; i<5; i++) {
            System.out.println("\nTeclee calificación (A,B,C,D,E): ");
            nota = entrada.readLine();
            nota=nota.toUpperCase();
            switch(nota) {
                case "A":
                    total += 4;
                    break;
                case "B":
                    total += 3;
                    break;
                case "C":
                    total += 2;
                    break;
                case "D":
                    total += 1;
                    break;
                case "E":
                    total += 0;
                    break;
            }
        }

        media = total / (double)5;
        System.out.println("\nEl promedio del grupo es: " + media);
    }
}
