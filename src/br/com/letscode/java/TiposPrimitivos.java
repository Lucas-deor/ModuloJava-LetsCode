package br.com.letscode.java;

public class TiposPrimitivos {

    public static void main(String[] args) {

        String nome = "Pablo";
        var sobrenome = "Leal";
        int idade = 28;

        String frase1 = "O " + nome + " " + sobrenome + " tem " + idade + " anos de idade.";
        System.out.println(frase1);

        String frase2 = String.format("o %s %s tem %d anos de idade.", nome, sobrenome, idade);
        System.out.println(frase2);

        System.out.println(frase2.equals(frase1));
        System.out.println(frase2.equalsIgnoreCase(frase1));
        System.out.println(frase1.toUpperCase());

        System.out.println(frase2.equals(frase1));
        System.out.println(frase1.indexOf("anos"));

        final double trovao = 2; // se inserir isso nao deixa alterar o valor da variavel.

        System.out.println(Math.PI);

        //QUESTAO TESTE

        final double pi = 3.1415;

        int raio = 2;
        var area = raio * raio * pi;

        System.out.println(area);

        var area2 = raio * raio * Math.PI;
        System.out.println(area2);


        // wrapper
        Integer first = 1;
        String numero = "1";
        System.out.println(first.compareTo(Integer.parseInt(numero)) == 0);

        int i = 0;
        System.out.println("0 == " + i);
        System.out.println(i++ == 1 ? "1 == " + i : "1 != " + i);
        System.out.println(++i == 2 ? "2 == " + i : "2 != " + i);
    }

}
