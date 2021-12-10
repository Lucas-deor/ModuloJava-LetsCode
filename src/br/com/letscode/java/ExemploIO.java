package br.com.letscode.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploIO {

    public static void main(String[] args) {
        System.out.println();

        LocalDateTime data = LocalDateTime.now();

//        https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        System.out.printf("São %tT do dia %td de %tB de %ty%n", data, data, data, data);


        //ESSA É OUTRA FORMA DE UTILIZAR TAMBÉM
        LocalDateTime dataTeste = LocalDateTime.now();
        String s = dataTeste.format(DateTimeFormatter.ofPattern("dd/MMMM/yy HH:mm:ss"));
        System.out.println(s);

        //OUTRA FORMA DE UTILIZAR TAMBÉM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        System.out.printf("%s%n", formatter.format(data));



    }

}
