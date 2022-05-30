package Algorithm_CodeUp;

import java.util.Scanner;

public class q1259 {
    public static void main(String[] args) {
        //! my code
        int x, y, r = 0,i ;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

            for (i = 1; i <=x; i ++) {
                if(i%2==0) {
                    r += i;
                }
            }
        System.out.print(r+" ");
        }
    }















