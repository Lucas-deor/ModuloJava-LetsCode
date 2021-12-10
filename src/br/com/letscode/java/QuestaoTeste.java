package br.com.letscode.java;

import java.util.Scanner;

public class QuestaoTeste {

    public static void main(String[] args) {

        double celcius = 30;
        final double part1 = 9.0/5;
        final double part2 = 32;
        double fahrenheit = (celcius * part1) + part2;

        System.out.println(fahrenheit);


        // QUESTAO DE SWITCH

        double primeiroNumero;
        double segundoNumero;
        double resultado;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: %n");
        primeiroNumero = input.nextDouble();
        System.out.printf("Digite o segundo número: %n");
        segundoNumero = input.nextDouble();
        System.out.printf("Digite a op matemática: %n");
        String opMat = input.next();

        switch(opMat) {
            case "+":
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "/":
                resultado = primeiroNumero / segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                break;
            default:
                System.err.printf("Digite o caractere válido");
                return;
        }

        System.out.printf("%.2f %s %.2f = %.2f", primeiroNumero, opMat, segundoNumero, resultado);
        input.close();

        //QUESTAO 3

//        double primeiroValor;
//        double segundoValor;




    }

}
