package Algorithm_CodeUp;

import java.util.Scanner;

public class q1382_중첩반복문 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b = 0;


        int r = 0;
        for (i = 1; i <= 9; i++) {
            for (j = 2; j <= 5; j++) {
                System.out.printf("%d x %d = %2d\t", j,i,i*j);
            }
            System.out.println();
        }

    }
}

//





















