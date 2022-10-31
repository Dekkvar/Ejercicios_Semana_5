package com.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static String operation(Scanner input) {
        String ope = "";
        while (ope.equals("")) {
            ope = input.nextLine();
            if (!ope.equals("+") && !ope.equals("-") && !ope.equals("*") && !ope.equals("/")) {
                if (!ope.equals("")) {
                    System.out.println("El símbolo introducido no se corresponde con una de las posibilidades.");
                }
                System.out.println("Selecciona una operación introduciendo su símbolo: \nSuma (+) \nResta (-) \nMultiplicación (*) \nDivisión (/)");
                ope = "";
            }
        }
        return ope;
    }

    public static double numero(String msg, Scanner input) {
        System.out.println(msg);
        double num = input.nextDouble();
        return num;
    }

    public static void main(String[] args) {
        double num1, num2, resultado = 0;
        String ope = "";
        Scanner input = new Scanner(System.in);

        num1 = numero("Introduce el primer número:", input);

        ope = operation(input);

        num2 = numero("Introduce el segundo número:", input);

        switch (ope) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Hasta luego.");
                break;
        }

        System.out.println("El resultado de la operación " + num1 + ope + num2 + " es " + resultado);
    }
}
