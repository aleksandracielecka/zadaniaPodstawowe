package org.example;

import java.util.Scanner;

//Napisz własną funkcję realizującą potęgowanie bez użycia operatorów mnożenia i dzielenia. Nie używaj kolekcji.
public class dodatkowe1305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podstawę do potęgowania");
        int power = scanner.nextInt();
        System.out.println("Podaj wykładnik potęgowania");
        int exponent = scanner.nextInt();

        int exponentResult = getExponenationResult(power,exponent);
        writeResult(power, exponent,exponentResult);

    }
    public static int getExponenationResult(int power, int exponent){

        int forRatio = power;
        int exponenationResult = 0;

        if (exponent == 0 || power == 1) exponenationResult = 1;

        else if (exponent > 0) {
            for (int j = 0; j < exponent - 1; j++) {
                exponenationResult = 0;

                for (int p = 0; p < forRatio; p++) {
                    exponenationResult += power;
                }
                power = exponenationResult;
            }
        }
        return exponenationResult;
    }
    public static void writeResult(int power, int exponent, int exponenatinResult){
        System.out.printf("Dla podstawy %d oraz wykładnika %d wynik potęgowania to: %d",power,exponent,exponenatinResult);
    }
}
