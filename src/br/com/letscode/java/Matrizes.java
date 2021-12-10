package br.com.letscode.java;

public class Matrizes {

    public static final int TAMANHO_TABULEIRO = 8;

    public static void main(String[] args) {

        String tabuleiro[][] = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        populandoTabuleiroPeoes(tabuleiro);

        imprimeTabuleiro(tabuleiro);

    }

    private static void populandoTabuleiroPeoes(String[][] tabuleiro) {
        for(int i = 0; i < TAMANHO_TABULEIRO; i++) {
            for(int j = 0; j < TAMANHO_TABULEIRO; j++) {
                if (i == 1 || i == 6) {
                    tabuleiro[i][j] = "p";
                } else {
                    tabuleiro[i][j] = "_";
                }
            }
        }
    }

    private static void imprimeTabuleiro(String[][] tabuleiro) {
        for (String[] linhas: tabuleiro) {
            for (String celula: linhas) {
                System.out.printf("%s", celula);
            }
            System.out.printf("%n");
        }
    }

}





