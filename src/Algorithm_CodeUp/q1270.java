package Algorithm_CodeUp;

import java.util.Scanner;

public class q1270 {

        //! my code
    public static void main(String[] args) {
        int x, y, i,z,q;
       int r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
         if(i%10 ==1){
             r ++;
         }
        }
        System.out.println(r);
    }


}















