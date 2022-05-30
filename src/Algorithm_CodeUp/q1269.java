package Algorithm_CodeUp;

import java.util.Scanner;

public class q1269 {

        //! my code
    public static void main(String[] args) {
        int x, y, i,z,q;
       int r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        q = sc.nextInt();
         r = x;
        for (i = 1; i < q; i++) {
         r = r * (y) + z;

        }
        System.out.println(r);
    }//main end


}















