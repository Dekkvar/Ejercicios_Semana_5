package com.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = input.nextInt();
        System.out.println("Selecciona una operación introduciendo su símbolo: \nSuma (+) \nResta (-) \nMultiplicación (*) \nDivisión (/)");
        String ope = input.nextLine();
        System.out.println("Introduce el segundo número:");
        int num2 = input.nextInt();

        int resultado = 0;

        if (!ope.equals("+") && !ope.equals("-") && !ope.equals("*") && !ope.equals("/")) {
            System.out.println("El símbolo introducido no se corresponde con una de las posibilidades.");
        } else {
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
}
