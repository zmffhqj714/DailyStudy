package Algorithm_CodeUp;

import java.util.Scanner;

public class q1410_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;

        String x = sc.nextLine();
         String[] r = x.split("" );

        for (i = 0; i < r.length; i++) {
            if(r[i].equals("(")){
                k ++;
            }else if(r[i].equals(")")) {
                b++;
            }
        }

        System.out.print(k +" "+b );
        }}



















