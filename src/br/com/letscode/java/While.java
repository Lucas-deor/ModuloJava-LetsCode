package br.com.letscode.java;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

// WHILE

        int i = 1;
        while (i < 10) {
            System.out.printf("%d %n", i);
            i += 2;
        }

        Scanner entrada = new Scanner(System.in);

        String texto = "n";

        while(!texto.equalsIgnoreCase("S")) {
            System.out.printf("Deseja finalizar o programa? (s/n): %n");
            texto = entrada.next();
        }
        entrada.close();

// FOR

        for (int x = 1; x<=5; x+=2) {
            System.out.printf("%d %n", x);
        }

//DO - WHILE



    }

}
