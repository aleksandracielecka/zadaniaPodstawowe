package org.example;

import java.util.Scanner;

//Zadanie dodatkowe:
//Napisz program, który odwróci zawartość tablicy, nie używaj Kolekcji np.
//    [1, 10, 4, 5, 2, 12] -> [12, 2, 5, 4, 10, 1]
//    [1, 2, 5, 3, 10] -> [10, 3, 5, 2, 1]
public class dodatkowe11_05 {
    public static void main(String[] args) {


        int[] tab1 = new int[]{100, 99, 55, 22};
        int k = tab1.length;
        int[] tab2 = new int[k];

        for (Integer i = k - 1; i >= 0; i--) {
            tab2[i] = tab1[k - 1 - i];

        }

        for (int number : tab2) {
            System.out.print(number+" ");
        }
    }
}
