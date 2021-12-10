package br.com.letscode.java;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int primeiro;
        int segundo;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: %n");
        primeiro = input.nextInt();

        System.out.printf("Digite o segundo número: %n");
        segundo = input.nextInt();

        System.out.printf("O primeiro número foi %d e o segundo foi %d.%n", primeiro, segundo);

        //QUESTÃO 1
        //PRIMEIRO JEITO
        int soma = primeiro + segundo;
        System.out.printf("A soma entre os números foi: %d%n", soma);

        //SEGUNDO JEITO
        System.out.printf("A segunda soma foi: %d%n", primeiro+segundo);

    }
}
