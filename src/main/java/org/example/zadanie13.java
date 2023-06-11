package org.example;

import java.util.Scanner;

//Zadanie 13.
//Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String),
// a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po dwa razy. Przykładowo,
// dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest mój mój test test”.
public class zadanie13 {
    public static void main(String[] args) {
        String text = getUserText();
        String[] doubleWords = getTextWithReply(text);
        displayResult(doubleWords);


    }

    public static String getUserText() {
        System.out.println("Please write a text:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String[] getTextWithReply(String text) {
        String[] words = text.split(" ");
        String[] doubleWords = new String[2 * words.length];

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < 2 * words.length; j +=2) {

                doubleWords[j] = words[i];
                doubleWords[j + 1] = words[i];
                break;
            }

        }
        return doubleWords;
    }

    public static void displayResult(String[] doubleWords) {
        for (String word : doubleWords) {
            System.out.print(word + " ");
        }
    }
}
