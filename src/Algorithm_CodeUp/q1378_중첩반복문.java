package Algorithm_CodeUp;

import java.util.Scanner;

public class q1378_중첩반복문 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b = 0;
        int x = sc.nextInt();

        int r = 0;
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6; j++) {
                if (x == i + j) {
                    System.out.println(i + " " + j);
                }
            }

        }

    }
}

//





















