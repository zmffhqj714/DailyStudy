package Algorithm_CodeUp;

import java.util.Scanner;

public class q1371 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b;
        int x = sc.nextInt();

        int l = 0, r = x * 2 - 1;


        for (i = 1; i <= x; i++) {
            for (j = i; j <= x - 1; j++) {
                System.out.print(" ");
            }


            System.out.print("*");

            if (i != 1) {
                for (j = 1; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }
            }

            System.out.print("*");

            System.out.println();
        }

        for (i = 1; i <= x; i++) {
            if (i != 1) {
                for (j = 2; j <= i; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
                for (j = i; j < r; j++) {
                    System.out.print(" ");
                }
                r--;
                System.out.print("*");
                System.out.println();
            }
        }
    }}






















