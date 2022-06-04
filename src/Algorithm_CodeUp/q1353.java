package Algorithm_CodeUp;

import java.util.Scanner;

public class q1353 {

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j, b, bb;
        x = sc.nextInt();
        StringBuffer br = new StringBuffer();
        y = x;
        bb = 2;
        String r;
        for (i = 1; i <= x; i++) {
            for (b = 1; b < bb-1; b++) {
                br.append(" ");
            }
            for (j = 1; j <= y; j++) {
                br.append("*");
            }


            y--;
            bb++;
            br.append("\n");
        }

        r = br.toString();
        System.out.println(r);
    }
}



























