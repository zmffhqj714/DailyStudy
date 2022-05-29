package Algorithm_CodeUp;

import java.util.Scanner;

public class q1096 {
    public static void main(String[] args) {
        //! my code
        Scanner sc = new Scanner(System.in);

        int i, j, len, direction, x, y, x2, y2;
        int x1 = sc.nextInt();

        int y1 = sc.nextInt();

        int[][] index = new int[x1][y1];

        int s = sc.nextInt();
        sc.nextLine();

        for (i = 0; i < s; i++) {

            len = sc.nextInt();
            direction = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            //가로
            if (direction == 0) {

                for (y2 = y-1; y2 < (y-1+len)  ; y2++)
                    index[x-1][y2] = 1;

            } else {
                //System.out.println(x-1+"&"+(x-1+len));
                for (x2 = x-1; x2 < (x-1+len); x2++) {
                   //System.out.println(x2+"&"+(x-1+len)+"%"+(y-1)+"%"+len);
                    index[x2][y-1] = 1;
                }

            }

        }

        for (i = 0; i < x1; i++) {
            for (j = 0; j < y1; j++) {
                System.out.print(index[i][j] + " ");
            }
            System.out.println();
        }
    }
    //! ugly and piggy and nutty  Dan code
//    Scanner sc = new Scanner(System.in);
//
//
//    int i, j, len, direction, x, y, x2, y2;
//    int x1 = sc.nextInt();
//    int y1 = sc.nextInt();
//
//    int[][] index = new int[x1][y1];
//
//    int s = sc.nextInt();
//
//        for (i = 0; i < s; i++) {
//        len = sc.nextInt();
//        direction = sc.nextInt();
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        if (direction == 0) {
//            for (j = 0; j < len ; j++)
//                index[x - 1][y - 1 + j] = 1;
//        } else {
//            for (j = 0; j < len ; j++)
//                index[x -1 + j][y - 1] = 1;
//        }
//
//    }
//        for (i = 0; i < x1; i++) {
//        for (j = 0; j < y1; j++) {
//            System.out.print(index[i][j] + " ");
//        }
//        System.out.println();
//    }

}






