package Algorithm_CodeUp;

import java.util.Scanner;

public class q1402_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;

        int x = sc.nextInt();

        int[]  arr = new int[x];

        for(i = x-1;i >= 0; i-- ){
            arr[i] = sc.nextInt();
        }

        for (int e: arr
             ) {
            System.out.print(e+" ");
        }
        }}



















