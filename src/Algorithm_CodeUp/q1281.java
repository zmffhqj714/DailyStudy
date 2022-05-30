package Algorithm_CodeUp;

import java.util.Scanner;

public class q1281 {

    //! my code
    public static void main(String[] args) {
        int x, y = 0,i, r = 0;
        String s ="+";
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        for (i = x; i <= y; i++) {
          if(i%2==0) {
                  System.out.print("-" + i);
              r -= i;
          }else{ if (i == x) {
            System.out.print(i);
              r += i;
        } else{
              System.out.print("+"+i);
                r += i;
            }  }
        }
                System.out.print("="+r);
        }
    }




















