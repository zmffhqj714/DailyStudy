package Algorithm_CodeUp;

import java.util.Scanner;

public class q1282 {

    //! my code
    public static void main(String[] args) {
        int x, y = 0, i, r = 0, k = 0;
        String s = "+";
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();


        for (i = 1; i <= x; i++) {
            if (i * i > x) {
                i--;
                k = x - i*i;
                System.out.print(k+ " " +i);
                break;

            }
        }
    }
}





















