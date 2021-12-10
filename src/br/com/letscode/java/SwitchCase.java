package br.com.letscode.java;

import java.time.DayOfWeek;
import java.util.Random;

public class SwitchCase {

    public static void main(String[] args) {


        int b = new Random().nextInt(7);

        agenda(DayOfWeek.SATURDAY);

    }

    //AQUI FOI USADO UM ENUM COM MÉTODO + SWITCH CASE

    private static void agenda(DayOfWeek dia) {
        switch(dia) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.printf("Aula");
                break;
            case THURSDAY:
            case FRIDAY:
                System.out.printf("Estudar");
                break;
            default:
                System.out.printf("Descansar");
                break;
        }
    }



}
