package org.example;
//Zadanie 10.
//Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr podanej liczby.
// Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze, możesz obliczać resztę z dzielenia liczby przez 10
// (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).

import java.util.Scanner;

import static java.lang.Math.pow;

public class zadanie10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą:");
        int numberFromUser = s.nextInt();

        String numberString = String.valueOf(numberFromUser);
        String[] numbersSplit = numberString.split("");

        int sum = 0;

//        for (int i = 0; i < numberString.length(); i++) {
//            String numbString = numbersSplit[i];
//            int numbInt = Integer.parseInt(numbString);
//            sum += numbInt;
//        }

        for (String element : numbersSplit) sum += Integer.parseInt(element);


        System.out.println(sum);


        System.out.println("Drugie rozwiązanie");

        int suma2 = 0;
        while (numberFromUser > 0) {
            suma2 += numberFromUser % 10;
            numberFromUser = numberFromUser / 10;
        }
        System.out.println(suma2);

    }
}
