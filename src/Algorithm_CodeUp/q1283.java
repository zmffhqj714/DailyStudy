package Algorithm_CodeUp;

import java.util.Scanner;

public class q1283 {

    //! my code
    public static void main(String[] args) {
        int x, y = 0, i, k = 0;
double r;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        r = x;
        for (i = 1; i <= y; i++) {
            k = sc.nextInt();
            r = r + (r * k / 100);

        }
        System.out.printf("%.0f",r-x);
        System.out.println();

        if (r < x) {
            System.out.print("bad");
        } else if (r == x) {
            System.out.print("same");
        }else{
            System.out.print("good");
        }

    }
}





















