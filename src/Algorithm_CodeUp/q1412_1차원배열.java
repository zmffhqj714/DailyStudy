package Algorithm_CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class q1412_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, k = 0, b = 0;
        char j ;

        String y = sc.nextLine();

        int[] arr = new int[122 - 96];

        for (i = 0; i < y.length(); i++) {
            for (j = 97; j <= 122; j++) {
                if (y.charAt(i)==j) {
                    arr[j - 97] += 1;
                }
            }
}
            for (j = 97; j <= 122; j++) {
               System.out.println(String.valueOf(j)+ ':'+arr[j-97]);}
        }

        }























