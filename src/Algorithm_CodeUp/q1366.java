package Algorithm_CodeUp;

import java.util.Scanner;

public class q1366 {

    //! Code after learning
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[][] arr = new String[x][x];

        int l = 0, r = x - 1;

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x; j++) {
                if (i == x/2||i == 0 || i == x - 1 || j == 0 || j == x - 1||j == x/2) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }

                if (j == r || j == l) {
                    arr[i][r] = "*";
                    arr[i][l] = "*";
                }

            }
            l++;
            r--;

        }


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}















