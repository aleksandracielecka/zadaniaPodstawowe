package org.example;

import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekstOdUzytkownika = scanner.nextLine();
        Double message = getResult(tekstOdUzytkownika);
        System.out.printf("Udział spacji w teksie wynosi: %f %%", message);
    }

    public static double getResult(String tekstOdUzytkownika) {
        int counterOfSpaces = 0;

        for (int i = 0; i < tekstOdUzytkownika.length(); i++) {
            char character = tekstOdUzytkownika.charAt(i);
            if (character == ' ') {
                counterOfSpaces++;
            }
        }
        return (counterOfSpaces / (double)tekstOdUzytkownika.length()) * 100.0;
    }

}
