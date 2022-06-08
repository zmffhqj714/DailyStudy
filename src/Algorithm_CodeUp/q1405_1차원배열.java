package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class q1405_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;

        int x = sc.nextInt();

        ArrayList<Integer>  number = new ArrayList<>() ;


        for(i = 0;i < x; i++ ){
            number.add(sc.nextInt());
        }

        for(i = 1;i  <= x; i++ ){
            for (int e: number
            ) {
                System.out.print(e+" ");
            }
            System.out.println();
            number.add(number.get(0));
            number.remove(0);

        }

        }}



















