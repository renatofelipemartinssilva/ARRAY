package com.mycompany.mavenproject15;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Mavenproject15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20];
        
        System.out.println("Digite 20 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}