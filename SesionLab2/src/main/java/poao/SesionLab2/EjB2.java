package poao.SesionLab2;

public class EjB2 {
    public static void main(String[] args) {
        System.out.println("Dime el radio del círculo: ");
        double radio = Double.parseDouble(System.console().readLine());
        System.out.println("El área del círculo es: " + Math.PI * Math.pow(radio, 2));
        System.out.println("La longitud de la circunferencia es: " + 2 * Math.PI * radio);
    }
}
