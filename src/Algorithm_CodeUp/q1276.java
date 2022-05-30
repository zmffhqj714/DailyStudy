package Algorithm_CodeUp;

import java.util.Scanner;

public class q1276 {

    //! my code
    public static void main(String[] args) {
        int x, y, i, r = 1;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (i = x; i >= 1; i--) {
            r *= i;
        }
            System.out.print(r);

    }
}



















