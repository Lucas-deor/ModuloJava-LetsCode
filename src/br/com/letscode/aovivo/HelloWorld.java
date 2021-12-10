package br.com.letscode.aovivo;

public class HelloWorld {

    public static void main(String[] args) {

        final double fator = 2.20462;
        double pesoKg = 100;
        double pesoLibra = (pesoKg / fator);

        System.out.printf("%.2f kgs são %.2f lb%n", pesoKg, pesoLibra);

    }

}
