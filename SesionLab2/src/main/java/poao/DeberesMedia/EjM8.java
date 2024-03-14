package poao.DeberesMedia;

// Media.java
// Calcula la nota media de los exámenes de un grupo de alumnos
// Utilización del bucle while y sentencias condicionales
import java.io.*;

public class EjM8 {

    public static void main(String args[]) throws IOException {
        int total=0;
        double media;
        String nota="X";
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // inicialización de variables

        while (!nota.equals("F")) {
            System.out.println("\nTeclee calificación (A,B,C,D,E), F para terminar: ");
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
                case "F":
                    break;
                default:
                    System.out.println("Nota inválida");
                    break;
            }
        }

        media = total / (double)5;
        System.out.println("\nEl promedio del grupo es: " + media);
    }
}
