package org.example;

//*  6    *
public class zadanie9 {
    public static void main(String[] args) {
        int n = 3;
//        String skladnikFali = "";
//        String[][] fala1 = new String[4][8];
        String[][] fala1 = {
                {"*", " ", " ", " ", " ", " ", " ", "*"},
                {" ", "*", " ", " ", " ", " ", "*", " "},
                {" ", " ", "*", " ", " ", "*", " ", " "},
                {" ", " ", " ", "*", "*", " ", " ", " "},
        };

        String[][] fala2= new String[4][8*n];

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(fala1[i][j]);

            }


        }

    }
}
