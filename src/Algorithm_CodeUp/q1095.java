package Algorithm_CodeUp;

import java.util.Scanner;

public class q1095 {
    public static void main(String[] args) {
        //! my code
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        int[][] index = new int[20][20];


        for (int k = 0; k < s; k++) {
//            int x = sc.nextInt();
            String y[] = sc.nextLine().split(" ");
          int x=  Integer.parseInt(y[0]);
          int y2  =Integer.parseInt(y[1]);
            index[x][y2] = 1;
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf(index[i][j] + " ");
            }
            System.out.println();
        }
    }
}




