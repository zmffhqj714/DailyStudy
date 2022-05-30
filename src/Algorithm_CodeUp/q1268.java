package Algorithm_CodeUp;

import java.util.Scanner;

public class q1268 {

        //! my code
    public static void main(String[] args) {
        int x, y, i;
       int r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (i = 1; i <= x; i++) {
            y = sc.nextInt();
            if(y%2==0) {
                r ++;
            }
        }
        System.out.println(r);
    }//main end


}















