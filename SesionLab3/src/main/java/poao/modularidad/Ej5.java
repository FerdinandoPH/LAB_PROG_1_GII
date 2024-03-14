package poao.modularidad;
//import java.util.Arrays;
public class Ej5 {
    public static double calculadora(double a, double b, char opCode){
        double resultado;
        switch (opCode){
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = a / b;
                break;
            default:
                resultado = 0;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.print("Introduce la operación: ");
        String operacion = System.console().readLine();
        String [] opSeparada= operacion.split("(?<=\\+|\\-|\\*|\\/)|(?=\\+|\\-|\\*|\\/)");
        //System.out.println(Arrays.toString(opSeparada));
        System.out.println("El resultado es: " + calculadora(Double.parseDouble(opSeparada[0]), Double.parseDouble(opSeparada[2]), opSeparada[1].charAt(0)));
    }
}
