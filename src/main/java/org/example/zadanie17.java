package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//Zadanie 17.
//Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy
// ile dni do nich pozostało. Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate.
// Obecną datę pobierz z metody LocalDate.now().
public class zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę nabliższych zajęć z RRRR-MM-DD");
        String data = scanner.nextLine();
        LocalDate dataWLocalDate = LocalDate.parse(data);
        LocalDate teraz = LocalDate.now();

        Period period = Period.between(teraz,dataWLocalDate);
        System.out.println(period.getDays());
//zrobic w metodach



    }
}
