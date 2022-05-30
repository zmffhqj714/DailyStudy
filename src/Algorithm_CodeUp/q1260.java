package Algorithm_CodeUp;

import java.util.Scanner;

public class q1260 {
    public static void main(String[] args) {
        //! my code
        int x, y, r = 0,i ;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

            for (i = x; i <=y; i ++) {
                if(i%3==0) {
                    r += i;
                }
            }
        System.out.print(r+" ");
        }
    }















