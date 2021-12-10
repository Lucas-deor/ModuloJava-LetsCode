package br.com.letscode.java;

import java.util.Arrays;

public class Args {

    public static void main(String[] args) {
//        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println(Double.parseDouble(args[0])% 2 == 0 ? "É Par" : "É Impar");
    }
}
