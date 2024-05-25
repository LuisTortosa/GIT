/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Practica1;

/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;
        
        do {
            double n1 = solicitarNumero(sc, "Introdueix el primer número:");
            operacion = solicitarOperacion(sc);
            double n2 = solicitarNumero(sc, "Introdueix el segon número:");
            
            double res = realizarOperacion(n1, n2, operacion);
            if (Double.isNaN(res)) {
                System.out.println("Error: Operació no vàlida.");
            } else {
                System.out.println("(" + n1 + ") " + operacion + " (" + n2 + ") = " + res);
            }

            System.out.println("\nVols continuar operant? (s/n)");
            operacion = sc.next().toLowerCase();
        } while (operacion.equals("s"));
    }
    

    private static double solicitarNumero(Scanner sc, String mensaje) {
        double numero;
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Introdueix un número vàlid.");
            sc.next();
        }
        numero = sc.nextDouble();
        return numero;
    }

    private static String solicitarOperacion(Scanner sc) {
        String operacion;
        boolean comprobar;
        do {
            System.out.println("\nOperació? (Indica el signe)");
            System.out.println("+ = sumar \n- = restar \n* = multiplicar \n/ = dividir \n% = residu");
            operacion = sc.next();
            comprobar = operacion.equals("+") || operacion.equals("-") || operacion.equals("*")
                    || operacion.equals("/") || operacion.equals("%");
            if (!comprobar) {
                System.out.println("Error: Operació no vàlida.");
            }
        } while (!comprobar);
        return operacion;
    }

    private static double realizarOperacion(double n1, double n2, String operacion) {
        switch (operacion) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "x":
                return n1 * n2;
            case "/":
                if (n2 == 0) {
                    System.err.println("Error: No es pot dividir per zero.");
                    return Double.NaN;
                }
                return n1 / n2;
            case "%":
                if (n2 == 0) {
                    System.err.println("Error: No es pot calcular el residu amb zero.");
                    return Double.NaN;
                }
                return n1 % n2;
            default:
                return Double.NaN;
        }
    }
}

