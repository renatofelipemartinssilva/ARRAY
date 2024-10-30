package com.mycompany.mavenproject19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mavenproject19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite 100 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        Integer[] imparesArray = impares.toArray(new Integer[0]);
        Arrays.sort(imparesArray);

        System.out.println("Números ímpares em ordem crescente:");
        for (int impar : imparesArray) {
            System.out.println(impar);
        }
        
        scanner.close();
    }
}
