/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poao.SesionLab2;

/**
 *
 * @author perez
 */
public class EjB1 {

    public static void main(String[] args) {
        System.out.println("Dame un número decimal");
        double num = Double.parseDouble(System.console().readLine());
        System.out.println("El número redondeado es: " + Math.round(num));
    }
}
