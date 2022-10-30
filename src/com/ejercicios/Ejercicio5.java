package com.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num1, num2;
        String ope = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        num1 = input.nextInt();

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

        System.out.println("Introduce el segundo número:");
        num2 = input.nextInt();

        int resultado = 0;

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
        }

        System.out.println("El resultado de la operación " + num1 + ope + num2 + " es " + resultado);
    }
}
