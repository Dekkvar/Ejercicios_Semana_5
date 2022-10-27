package com.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println("Introduce un número:");
            int num = Integer.parseInt(input.nextLine());
            suma += num;
            double media = (double)suma / count;
            System.out.println("La media de " + suma + " es " + media);
        }
    }
}
