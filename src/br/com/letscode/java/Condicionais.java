package br.com.letscode.java;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        //QUESTÃO 1

        Scanner input = new Scanner(System.in);

        int somaArgs = args.length;
        int primeiroNumero;
        int segundoNumero;

        if (somaArgs == 0) {
            System.out.printf("Digite o primeiro número: %n");
            primeiroNumero = input.nextInt();
            System.out.printf("Digite o segundo número: %n");
            segundoNumero = input.nextInt();
            System.out.printf("A soma foi: %d%n", primeiroNumero+segundoNumero);
        } else if (somaArgs == 1) {
            System.out.printf("Digite o segundo número: %n");
            segundoNumero = input.nextInt();
            primeiroNumero = Integer.parseInt(args[0]);
            System.out.printf("A soma foi: %d%n", primeiroNumero+segundoNumero);
        } else if (somaArgs == 2) {
            primeiroNumero = Integer.parseInt(args[0]);
            segundoNumero = Integer.parseInt(args[1]);
            System.out.printf("A soma foi: %d%n", primeiroNumero + segundoNumero);
        } else {
            System.err.printf("Falha ao tentar fazer a soma");
            }


        }
    }

