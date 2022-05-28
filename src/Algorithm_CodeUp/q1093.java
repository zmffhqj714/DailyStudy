package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

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

    }
}
