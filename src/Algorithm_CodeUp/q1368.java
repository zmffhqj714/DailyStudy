package Algorithm_CodeUp;

import java.util.Scanner;

public class q1368 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");

        int  xx = Integer.parseInt(x[0]);
        int  y = Integer.parseInt(x[1]);
        String direction =  x[2];

        //String[][] arr = new String[x][x];

        int l = 1, r = xx - 1;

        for (int i = 0; i < xx; i++) {
            if (direction.equals("R")) {
                for (int j = 0; j < r; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                }
                r--;
                System.out.println();
            }
            if (direction.equals("L")) {

                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int j = 0; j < l; j++) {

                    System.out.print(" ");
                    // System.out.println(l);
                }
                l++;

            }
        }



    }
}















