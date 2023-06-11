package org.example;

import java.util.Scanner;

//Zadanie 5.
//Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i wypisze wszystkie liczby pierwsze, większe od 1 i mniejsze od podanej liczby.
public class zadanie5 {

    public static void main(String[] args) {

        int number = getUserNumber();
        getPrimeNumbers(number);

    }

    public static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą:");
        return scanner.nextInt();
    }

    public static void getPrimeNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) System.out.println(i);

        }

    }

}