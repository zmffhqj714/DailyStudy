package Algorithm_CodeUp;

import java.util.Scanner;

public class q1356 {

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j, b, bb;
        x = sc.nextInt();
        StringBuffer br = new StringBuffer();
        y = x;
        bb = 2;
        String r;

        for (y = 1; y <= x; y++) {
            br.append("*");


        }
        br.append("\n");
        for (i = 1; i <= x - 2; i++) {

            br.append("*");
            for (j = 1; j <= x - 2; j++) {
                br.append(" ");
            }

            br.append("*");
            br.append("\n");
        }
        for (y = 1; y <= x; y++) {

            br.append("*");

        }


        r = br.toString();
        System.out.println(r);
    }
}



























