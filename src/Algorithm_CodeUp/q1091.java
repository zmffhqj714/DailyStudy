package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class q1091 {
    public static void main(String[] args) {
        //! my code
        Scanner sc = new Scanner(System.in);
        long s = sc.nextInt();
        int cha = sc.nextInt();
        int n = sc.nextInt();
        int nn = sc.nextInt();


//        long another = s ;
//        for (int i = 0; i < nn -1; i++) {
//
//       another =  (another *cha) +n ;
//        }



    // ! another person code


        ArrayList<Long> arrl = new ArrayList ();
        arrl.add(s);
        long another =  0;
        for (int i = 0; i < nn -1; i++) {
            another = arrl.get(i) * cha + n;
            arrl.add(another);
        }
        System.out.println(arrl.get(n-1));



    }

}
