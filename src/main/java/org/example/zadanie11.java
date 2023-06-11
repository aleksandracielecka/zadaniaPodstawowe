package org.example;
//Zadanie 11.
//Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
// aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów
// (nie biorąc pod uwagę tekstu „Starczy”). Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.

import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
String longestText = getLongestText();
 if(longestText.equals(""))
     System.out.println("Nie podano żadnego tekstu");
 else System.out.println("Najdluższy tekst to: " +longestText);

//        Scanner s = new Scanner(System.in);
//        System.out.println("Podaj kilka tekstów, następnie wypisz: 'Starczy'");
//        String text1 = s.nextLine();
//        String text2 = "";
//        int sum = 0;
//        if (text1.isEmpty()) {
//            System.out.println("Nie podano żadnego tekstu");
//        }
//        while (!text1.isEmpty()) {
//
//            if (text2.equals("Starczy")) {
//                System.out.println("koniec");
//                for (int i = 0; i < text2.length(); i++) {
//                    char oneChar = text2.charAt(i);
//                    sum += oneChar;
//                    int maxSum = sum;
//                    if (maxSum > sum) {
//                        maxSum = sum;
//                        System.out.println(sum + text2);
//                        break;
//                    }
//                }
//
//            }
//            System.out.println("Podaj tekst");
//            text2 = s.nextLine();
//        }
//    }
//}

    }

        public static String getLongestText() {
            Scanner scanner = new Scanner(System.in);
            String longestText = "";

            while (true) {
                String text = scanner.nextLine();

                if (text.equals("Starczy")) break;
                if (text.length() > longestText.length())
                    longestText = text;
            }
            return longestText;
        }
    }