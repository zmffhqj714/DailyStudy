package Algorithm_CodeUp;

import java.util.Scanner;

public class q1266 {

        //! my code
    public static void main(String[] args) {
        int x, y, i;
       int r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (i = 1; i <= x; i++) {
            y = sc.nextInt();
            r += y;
        }
        System.out.println(r);
    }//main end


}















