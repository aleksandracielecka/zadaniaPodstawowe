package org.example;

import java.util.Scanner;

//Zadanie 14.
//Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char)
// i wyliczy, ile znaków stoi w alfabecie pomiędzy podanymi literami.
// Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int.
public class zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą małą literę:");
        char firstLetter = scanner.next().charAt(0);
        System.out.println("Podaj drugą małą literę:");
        char secondLetter = scanner.next().charAt(0);
        int a = firstLetter;
        int b = secondLetter;
        int counter = 0;
        if (a < b) {
            for (int i = a; i < b; i++) {
                counter++;
            }
        }
        else { for (int i = b; i < a; i++) {
                counter++;
            }
            }
        System.out.println(counter);
        }
    }
