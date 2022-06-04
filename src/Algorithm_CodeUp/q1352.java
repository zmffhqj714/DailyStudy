package Algorithm_CodeUp;

import java.util.Scanner;

public class q1352 {

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j;
        x = sc.nextInt();

        y = 1;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= y; j++) {
                System.out.print("*");
            }
            y++;
            System.out.println();
        }

    }
}



























