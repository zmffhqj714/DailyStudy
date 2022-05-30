package Algorithm_CodeUp;

import java.util.Scanner;

public class q1273 {

    //! my code
    public static void main(String[] args) {
        int x, y, i, r;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();


        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}


















