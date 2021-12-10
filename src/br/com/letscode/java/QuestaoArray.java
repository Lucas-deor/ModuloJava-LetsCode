package br.com.letscode.java;

import java.util.Scanner;

public class QuestaoArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        double[] notas;
        double media = 0;

        System.out.printf("Digite o número de alunos: %n");
        quantidade = input.nextInt();

        notas = new double[quantidade];

        //FOR PARA CRIAR AS NOTAS
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite a nota do aluno %d: %n", i);
            notas[i] = input.nextDouble();
        }


        //FOREACH PARA FAZER A MEDIA
        for (double nota: notas) {
            media += nota;
        }
        media /= quantidade;

        System.out.printf("A media dos %d alunos é %.2f", quantidade, media);
        input.close();

    }

}
