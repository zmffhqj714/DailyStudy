package Algorithm_CodeUp;

import java.util.Scanner;

public class q1284ing {

    //! my code
    public static void main(String[] args) {
        int x, y = 0, j, i, k = 0;
        int r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x == 1 || x == 2) {
            System.out.println("wrong number");
        } else {
            for (i = 2; i <= x; i++) {
                if (x % i == 0) {
                    y = i;
                    break;
                }
            }

                for (j = y ; j <= x; j++) {
                    if ((y * j) == x) {
                        k = j;
                        System.out.println(y + " " + k);
                        break;
                    }
                }
                if(i*j!=x){
                    System.out.println("wrong number");
                }


        }




    }
}




//        for (i = 1; i <= x; i++) {
//            if(x==2){
//                break;
//            }
//            if(x%i==0){
//                r ++;
//            }if(r==2){
//            for (k = 1; k <= x; k++) {
//                if (i * k == x) {
//                    System.out.println(i + " " + k);
//                    break;
//                }
//            }}
//            }
//        if(r <2){
//            System.out.println("wrong number");
//        }


























