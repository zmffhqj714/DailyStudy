package Algorithm_CodeUp;

import java.util.Scanner;

public class q3120_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, k = 0, b = 0, g = 0, cha = 0;
        char j;

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[122 - 96];

        if (x >= y) {
            k = y;
            g = x;
        } else {
            k = x;
            g = y;
        }
        cha = g - k;

        System.out.println(cha);


        if (cha >= 10) {
            while (k < g) {
                k += 10;
                b++;
            }
            //23
            b--;


            if (k > g) {

                k -= 5;
                while (k != g) {
                    k++;
                    b++;

                }
            } else {
                while (k != g) {
                    k++;
                    b++;
                }
            }
        }
        if (cha < 10 && cha >= 5) {
            k -= 5;
            b++;
            while (k != g) {
                k--;
                b++;
            }
        }

        if (cha < 5){
         while(k != g) {
        k ++;
        b++;
    }
}
        System.out.print(b);





        }}

























