package com.mycompany.mavenproject20;


public class Mavenproject20 {

    public static void main(String[] args) {
        String[][] tabela = {
            {"1", "Botafogo", "64"},
            {"2", "Palmeiras", "61"},
            {"3", "Fortaleza", "57"},
            {"4", "Flamengo", "54"},
            {"5", "São Paulo", "51"},
            {"6", "Bahia", "46"},
            {"7", "Cruzeiro", "44"},
            {"8", "Vasco", "43"},
            {"9", "Atlético-MG", "42"},
            {"10", "Santos", "40"},
            {"11", "Grêmio", "39"},
            {"12", "Athletico-PR", "38"},
            {"13", "Fluminense", "37"},
            {"14", "Corinthians", "35"},
            {"15", "Internacional", "33"},
            {"16", "Red Bull Bragantino", "31"},
            {"17", "Goiás", "29"},
            {"18", "Cuiabá", "27"},
            {"19", "América-MG", "25"},
            {"20", "Coritiba", "22"}
        };

        System.out.println("Classificação do Campeonato Brasileiro 2024:");
        System.out.printf("%-5s %-20s %s\n", "Pos", "Time", "Pontos");
        for (String[] time : tabela) {
            System.out.printf("%-5s %-20s %s\n", time[0], time[1], time[2]);
        }
    }
}

