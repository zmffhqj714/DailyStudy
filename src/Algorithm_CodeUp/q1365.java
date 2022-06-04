package Algorithm_CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class q1365 {

    //! Code after learning
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[][] arr = new String[x][x];

        int l = 0, r = x - 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x - 1 || j == 0 || j == x - 1) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }

                if (j == r || j == l) {
                    arr[i][r] = "*";
                    arr[i][l] = "*";
                }

            }
            l++;
            r--;

        }


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}










//first my Code

       // StringBuffer br = new StringBuffer();

//        String r;
//
//        for (i = 1; i <= x; i++) {
//            System.out.print("*");
//            }
//        System.out.print("\n");
//          for(i = 1 ; i< x-1;i++){
//              for (j = 1; j <= x;j++) {
//                  if(j==1|| j== i+1||j==x ||j== x-i ) {
//                      System.out.print("*");
//                  } else{
//                      System.out.print(" ");
//                  }
//              }
//              System.out.print("\n");
//          }
//        for (i = 1; i <= x; i++) {
//            System.out.print("*");
//        }
       // r = br.toString();
        //System.out.println(r);



























