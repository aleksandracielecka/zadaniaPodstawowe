package org.example;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę:");
        Float diameter = scanner.nextFloat();

        Float circuit = 3.14f * diameter;
        System.out.println("Obwód kołą to: " + circuit );

        Double circuit1 = Math.PI * diameter;
        System.out.println("Obwód drugiego koła to: " + circuit1);
    }
}
