package br.com.letscode.java;

import java.util.Scanner;

public class QuestaoMatriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int turmas;
        int alunos;
        double mediaTotal = 0;
        double mediaTurma;


        System.out.printf("Insira a quantidade de turmas: %n");
        turmas = input.nextInt();

        System.out.printf("Insira a quantidade de alunos em cada turma: %n");
        alunos = input.nextInt();

        double[][] notasTurmas = new double[turmas][alunos];

        for (int i = 0; i < turmas; i++) {
            for (int j = 0; j < alunos; j++) {
                System.out.printf("Digite a nota do aluno %d da turma %d: %n", j, i);
                notasTurmas[i][j] = input.nextDouble();
            }
        }

        for (double[] turma: notasTurmas) {
            mediaTurma = 0;
            for(double nota: turma) {
                mediaTurma += nota;
            }
            System.out.printf("Media da turma: %.2f %n", (mediaTurma/alunos));
            mediaTotal += mediaTurma;
        }

        System.out.printf("A media de notas dos alunos de todas as turmas é %.2f %n", (mediaTotal / (alunos + turmas)));
        input.close();
    }

}
