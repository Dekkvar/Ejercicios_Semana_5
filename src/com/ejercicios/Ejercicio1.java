package com.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Vamos a comprobar si dos número son múltiplos.");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num1 = input.nextInt();
        System.out.println("Introduce otro número:");
        int num2 = input.nextInt();

        System.out.println(num1 % num2 == 0);
    }
}
