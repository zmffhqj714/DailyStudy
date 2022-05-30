package Algorithm_CodeUp;

import java.util.Scanner;

public class q1271 {

        //! my code
    public static void main(String[] args) {
        int x, y, i,z,q;
       int max = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
            y = sc.nextInt();

         if(max < y){
             max = y;

         }
        }
        System.out.println(max);
    }


}















