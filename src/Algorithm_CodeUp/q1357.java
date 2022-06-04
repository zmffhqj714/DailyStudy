package Algorithm_CodeUp;
import java.util.Scanner;

public class q1357 {

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j, b, bb;
        x = sc.nextInt();
        StringBuffer br = new StringBuffer();
        y = x;
        bb = 1;
        String r;

        for (i = 1; i <= x ; i++) {
            for (y = 1; y <= bb; y++) {
                br.append("*");
            }
            bb++;
            br.append("\n");
        }

        bb = x-1;

        for (i = 1; i <= x-1 ; i++) {
            for (y = 1; y <= bb; y++) {
                br.append("*");
            }
            bb--;
            br.append("\n");
        }


        r = br.toString();
        System.out.println(r);
    }
}



























