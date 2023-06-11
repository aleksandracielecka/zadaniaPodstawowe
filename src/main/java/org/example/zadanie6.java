package org.example;

import java.util.Scanner;

//Zadanie 6.
//Napisz program, który pobierze od użytkownika liczbę n (typu int) i obliczy sumę szeregu harmonicznego od 1 do n, zgodnie ze wzorem poniżej:
public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną:");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("To nie jest liczba naturalna");
        else {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += 1d / i;
                // == suma=sum+1d/i;   mozna w ten sposób
                // +=   -=    *=     /=
            }
            System.out.println(sum);
        }
    }
}

