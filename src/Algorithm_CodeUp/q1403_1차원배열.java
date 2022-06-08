package Algorithm_CodeUp;

import java.util.Scanner;

public class q1403_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;

        int x = sc.nextInt();

        int[]  arr = new int[x];

        for(i = 0;i < x; i++ ){
            arr[i] = sc.nextInt();
        }

        for(i = 0;i  < 2; i++ ){
            for (int e: arr
            ) {
                System.out.println(e);
            }
        }

        }}



















