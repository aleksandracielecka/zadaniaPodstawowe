package org.example;

import java.util.Scanner;

public class Zadanie2 {
//Napisz program obliczający BMI (Body Mass Index) i sprawdzający,
// czy jest ono w normie. Program powinien wczytywać od użytkownika dwie zmienne:
// wagę w kilogramach (typ float) oraz wzrost w centymetrach (typ int). BMI powinno zostać wyliczone zgodnie z poniższym wzorem:
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj masę ciała:");
        float mass = scanner.nextFloat();

        System.out.println("Podaj wzrost w centymetrach:");
        int heightInCm = scanner.nextInt();

        float heightInMeters = heightInCm * 0.01f;


        float indexBMI = mass / (heightInMeters * heightInMeters);

        if (indexBMI >= 18.5 && indexBMI <= 24.9) System.out.println("BMI = " + indexBMI + " BMI optymalne");
        else System.out.println("BMI = " + indexBMI + " BMI nieoptymalne");
//Inny sposob
        System.out.println((indexBMI >= 18.5 && indexBMI <= 24.9)?"optymalne":"nieoptymalne");


    }
}
