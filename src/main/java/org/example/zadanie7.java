package org.example;

import java.util.Scanner;

//Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę Fibonacciego o wskazanym indeksie.
// Przykładowo, jeśli użytkownik poda liczbę 5, Twój program powinien wypisać piątą liczbę Fibonacciego. Kolejne liczby
// Fibonacciego powstają poprzez zsumowanie dwóch poprzednich liczb Fibonacciego. Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno:
//
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
public class zadanie7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int numberFromUser = s.nextInt();
        int[] ciagF = new int[numberFromUser];

        for (int i = 0; i <= numberFromUser - 1; i++) {
            if (i == 0) {
                ciagF[i] = 1;
            } else if (i == 1) {
                ciagF[i] = 1;
            } else if (i > 1) {

                ciagF[i] = ciagF[i - 2] + ciagF[i - 1];
            }
//
        }
        System.out.println(ciagF[numberFromUser - 1]);

    }
}




