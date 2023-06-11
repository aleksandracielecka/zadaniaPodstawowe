package org.example;

import java.util.Scanner;

//Zadanie 16.
// Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i
// wypisze długość najdłuższego takiego podciągu tych liczb, który jest rosnący. Przykładowo,
// dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program powinien wypisać „5” jako
// długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).
public class zadanie16 {
    public static void main(String[] args) {

        int[] ciag = new int[10];
        pobierzCiag(ciag);
        int counter = getNajduzszyCiag(ciag);
        System.out.println(counter);


    }

    public static void pobierzCiag(int[] ciag) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb");
        String text = scanner.nextLine();
        String[] numbersSplit = text.split(" ");


        for (int i = 0; i < numbersSplit.length; i++) {
            String s = numbersSplit[i];
            int number = Integer.parseInt(s);
            ciag[i] = number;

        }

    }

    public static int getNajduzszyCiag(int[] ciag) {

        int counter = 0;
        for (int i = 1; i < ciag.length; i++) {

       counter = 0;
            if (ciag[i] > ciag[i-1]) {
                counter++;
            }
        }

        return counter;
    }
}