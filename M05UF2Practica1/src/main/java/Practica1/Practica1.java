/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
        double res = 0;
        String operacion;
        boolean comprobar;

        do {
            double n1, n2;

            
            System.out.println("\nIntrodueix el primer número:");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Introdueix un número vàlid.");
                sc.next(); 
            }
            n1 = sc.nextDouble();

            System.out.println("\nOperació? (Indica el signe)");
            System.out.println("+ = sumar \n- = restar \n* = multiplicar \n/ = dividir \n% = residu");
            operacion = sc.next();

            System.out.println("\nIntrodueix el segon número:");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Introdueix un número vàlid.");
                sc.next(); 
            }
            n2 = sc.nextDouble();

            switch (operacion) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "*":
                    res = n1 * n2;
                    break;
                case "/":
                    if (n2 == 0) {
                        System.err.println("Error: No es pot dividir per zero.");
                        continue; 
                    }
                    res = n1 / n2;
                    break;
                case "%":
                    if (n2 == 0) {
                        System.err.println("Error: No es pot calcular el residu amb zero.");
                        continue; 
                    }
                    res = n1 % n2;
                    break;
                default:
                    System.err.println("Error: Operació no vàlida.");
                    continue; 
            }

            
            System.out.println("(" + n1 + ") " + operacion + " (" + n2 + ") = " + res);

            
            System.out.println("\nVols continuar operant? (s/n)");
            operacion = sc.next().toLowerCase();
        } while (operacion.equals("s"));
    }
}

