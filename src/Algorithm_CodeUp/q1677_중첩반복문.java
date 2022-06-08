package Algorithm_CodeUp;

import java.util.Scanner;

public class q1677_중첩반복문 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;

        int x = sc.nextInt();  int y = sc.nextInt();
        int r = 0;


        System.out.print("+");

            for (j = 1; j <= x-2; j++) {
                System.out.print("-");
            }
            System.out.print("+");

        System.out.println();
        for (i = 1; i <= y-2; i++) {

            System.out.print("|");
            for (j = 1; j <= x-2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        System.out.print("+");

        for (j = 1; j <= x-2; j++) {
            System.out.print("-");
        }
        System.out.print("+");
        }


    }


//





















