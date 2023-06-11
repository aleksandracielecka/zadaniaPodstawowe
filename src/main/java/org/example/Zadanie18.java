package org.example;

import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {

        String textFromUser = getText();
        getResult(textFromUser);
    }
///
    public static String getText() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Wpisz tekst");
        String textFromUser = scaner.nextLine();
        return textFromUser;
        // zabrac tutaj obiekt textFrom User i dodac metode
    }

    public static void getResult(String textFromUser) {
        if (textFromUser.matches("a+ psik")) {
            System.out.println("Na zdrowie");
        } else System.out.println("chyba jesteś zdrowa");
    }
}
