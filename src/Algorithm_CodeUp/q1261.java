package Algorithm_CodeUp;

import java.util.Scanner;

public class q1261 {

    public static int five() {
        //! my code
        int x, y, r = 0, i;
        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            x = sc.nextInt();
            if (x % 5 == 0) {
                return x;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(five());
    }//main end


}















