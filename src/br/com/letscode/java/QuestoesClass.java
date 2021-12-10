package br.com.letscode.java;

import java.util.Scanner;

public class QuestoesClass {

    public static void main(String[] args) {
        // QUESTAO 1

//        Scanner input = new Scanner(System.in);
//
//        int primeiroNumero;
//        int segundoNumero;
//
//        System.out.printf("Digite o primeiro número: %n");
//        primeiroNumero = input.nextInt();
//
//        System.out.printf("Digite o segundo número: %n");
//        segundoNumero = input.nextInt();
//
//        int soma = primeiroNumero + segundoNumero;
//        int subtração = primeiroNumero - segundoNumero;
//        int multiplicação = primeiroNumero * segundoNumero;
//        double divisão = (double) primeiroNumero / (double) segundoNumero;
//
//        System.out.printf("A soma entre os números %d e %d = %d %n", primeiroNumero, segundoNumero, soma);
//        System.out.printf("A subtração entre os números %d e %d = %d %n", primeiroNumero, segundoNumero, subtração);
//        System.out.printf("A multiplicação entre os números %d e %d = %d %n", primeiroNumero, segundoNumero, multiplicação);
//        System.out.printf("A divisão entre os números %d e %d = %.2f %n", primeiroNumero, segundoNumero, divisão);
//
//        input.close();

        //QUESTAO 2

//        Scanner input = new Scanner(System.in);
//
//        int numero;
//
//        System.out.printf("Digite um número: %n");
//        numero = input.nextInt();
//
//        if (numero <= 10 && numero >=1) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.printf("%d x %d = %d %n", numero, i, numero * i);
//            }
//        } else {
//            System.err.printf("Digite um número entre 1 e 10%n");
//        }

        //QUESTAO 3

//        Scanner input = new Scanner(System.in);
//
//        int grausCelcius;
//
//        System.out.printf("Digite a temperatura em graus celcius: %n");
//        grausCelcius = input.nextInt();
//
//        int grausFarenheit = (grausCelcius * 9/5) + 32;
//        System.out.printf("%d graus Celcius é igual a %d graus Fahrenheit %n", grausCelcius, grausFarenheit);


        //QUESTAO 4

//          Scanner input = new Scanner(System.in);
//
//          double cotaçãoDolar;
//          double valorReais;
//
//          System.out.printf("Digite a cotação do dólar do dia: %n");
//          cotaçãoDolar = input.nextDouble();
//
//          System.out.printf("Digite a quantia em reais: %n");
//          valorReais = input.nextDouble();
//
//          double valorDolar = valorReais * cotaçãoDolar;
//          System.out.printf("R$%.2f equivalem a $%.2f %n", valorReais, valorDolar);
//
//          input.close();

        // QUESTAO 5

            Scanner input = new Scanner(System.in);

            double polegadas;
            double fatorConversao = 2.54;

            System.out.printf("Digite a quantidade de polegadas: %n");
            polegadas = input.nextDouble();

            double centímetros = polegadas * fatorConversao;
            System.out.printf("%.2f polegadas equivalem a %.2f centímetros. %n", polegadas, centímetros);

            input.close();

    }
}
