package Algorithm_CodeUp;

import java.util.Scanner;

public class q1358 {

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j, b, bb;
        x = sc.nextInt();
        StringBuffer br = new StringBuffer();
        y = x/2;
        bb = 1;
        String r;

        for (i = 1; i <= 100 ; i++) {
            for (j = 1; j <= y; j++) {
                br.append(" ");
            }
            for (b = 1; b <= bb; b++) {
                br.append("*");
            }

            if(bb==x){
                break;
            }
            y--;
            bb+=2;
            br.append("\n");
        }


        r = br.toString();
        System.out.println(r);
    }
}



























