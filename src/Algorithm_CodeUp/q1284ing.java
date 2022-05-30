package Algorithm_CodeUp;

import java.util.Scanner;

public class q1284ing {

    //! my code
    public static void main(String[] args) {
        int x, y = 0, i, k = 0;
double r;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (i = 1; i <= 10000000; i++) {
            for (k = 1; k <= 10000000; k++) {
               if(i*k == x){
                   System.out.println(i+" "+k);
               }
            }
        }

    }
}





















