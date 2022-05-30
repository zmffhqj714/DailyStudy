package Algorithm_CodeUp;

import java.util.Scanner;

public class q1275 {

    //! my code
    public static void main(String[] args) {
        int x, y, i, r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        r = x;
        for (i = 1; i < y; i++) {
            r *= x;
        }
        if (y == 0) {
            System.out.println(1);
        } else {
            System.out.print(r);
        }
    }
}



















