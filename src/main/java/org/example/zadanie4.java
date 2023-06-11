package org.example;


import java.util.Scanner;

//Zadanie 4.
//Napisz program, który pobierze od użytkownika dodatnią liczbę (typu int) i wypisze wszystkie liczby od 1 do podanej liczby, każda w kolejnej linijce, z następującymi zmianami:
//● w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”
//● w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”
//● jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif paf”
public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą:");
        int number = scanner.nextInt();

        for (int k = 1; k<=number;k++){
            if(k%7==0 && k%3==0){
                System.out.println("paf "+"paf");
            }
            else if (k%7==0){
                System.out.println("paf");
            }
            else if(k%3==0){
                System.out.println("pif");
            }
            else System.out.println(k);
        }


//
//            int[] numbers = new int[number];
//            for(int i=1; i<=(number+1);i++){
//                numbers[i]=i+1;
//                int j = numbers[i];
//
//                if(j%3==0){
//
//                    System.out.println("pif");
//                }
//                else if(j%7==0) {
//                    System.out.println("paf");
//                }
//                else if(j%7==0 && j%3==0){
//                        System.out.println("paf "+"paf");
//                }
//               else{
//
//                System.out.println(j);
//            }
//
//        }

    }

}
