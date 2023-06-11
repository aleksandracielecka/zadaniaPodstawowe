package org.example;

import java.util.Scanner;

//Napisz program służący do rozwiązywania równania kwadratowego. Program powinien pobrać trzy liczby całkowite (
// współczynniki równania kwadratowego a, b, c) i wyliczyć pierwiastki x1, x2 równania
//wzor.
//Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i zakończ program.
//Potrzebne wzory:
//wzor
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby całkowite");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("x1 = " + x1 + "x2 = " + x2);
        }

        else System.out.println("Delta ujemna");


    }
}
