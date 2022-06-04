package Algorithm_CodeUp;

import java.util.Scanner;

public class q1361 {

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j, b, bb;
        x = sc.nextInt();
        StringBuffer br = new StringBuffer();
        y = 0;
        bb = 2;
        String r;

        for (i = 1; i <= x; i++) {
            if (i >= 2) {
                for (j = 1; j <= y; j++) {
                    br.append(" ");
                }
            }
            for (b = 1; b <= bb; b++) {
                br.append("*");
            }
            y++;
            br.append("\n");
        }
        r = br.toString();
        System.out.println(r);
    }
}



























