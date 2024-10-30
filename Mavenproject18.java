package com.mycompany.mavenproject18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mavenproject18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        ArrayList<Integer> pares = new ArrayList<>();

        System.out.println("Digite 100 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        Integer[] paresArray = pares.toArray(new Integer[0]);
        Arrays.sort(paresArray);

        System.out.println("Números pares em ordem crescente:");
        for (int par : paresArray) {
            System.out.println(par);
        }
        
        scanner.close();
    }
}
