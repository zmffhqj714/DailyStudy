package Algorithm_CodeUp;

import java.sql.Array;
import java.util.Scanner;

import static java.lang.Math.min;

public class q1094 {
    public static void main(String[] args) {
        //! my code
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        String[] cha = sc.nextLine().split(" ");

        int min = Integer.parseInt(cha[cha.length - 1]);
        for (int i = cha.length - 2; i >= 0; i--) {
            if ( Integer.parseInt(cha[i]) <= min ) {
                min = Integer.parseInt(cha[i]);
            }
        }
        System.out.println(min);
    }
}
