package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q1092 {
    public static void main(String[] args) {

        //! my code
        Scanner sc = new Scanner(System.in);
        long s = sc.nextInt();
        long cha = sc.nextInt();
        long n = sc.nextInt();


        long day =1;
        while(day%s != 0||day%cha != 0||day%n != 0) day++;
        System.out.println(day);
        // ! another person code
//        ArrayList<Long> arrl = new ArrayList ();
//        arrl.add(s);
//        long another =  0;
//        for (int i = 0; i < nn -1; i++) {
//            another = arrl.get(i) * cha + n;
//            arrl.add(another);
//        }
       // System.out.println(arrl.get(nn-1));
    }
}
