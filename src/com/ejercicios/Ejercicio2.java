package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Vamos a comprobar si un número menor que 100 es primo.");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = Integer.parseInt(input.nextLine());
        int count = 0;

        if (num > 100) {
            System.out.println("El número " + num + " es mayor que 100, introduce un número menor o igual a 100.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (count == 3) {
                    break;
                }
                if (num % i == 0) {
                    count++;
                }
            }

            System.out.println(count == 2);
        }
    }
}
