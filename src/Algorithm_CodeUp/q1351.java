package Algorithm_CodeUp;

import java.util.Scanner;

public class q1351 {

        //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ,y,i,j;
        x = sc.nextInt();
        y = sc.nextInt();
        for(i= x; i<= y;i++) {
            for (j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j+ "=" + i * j);
            }
        }



    }

}



























