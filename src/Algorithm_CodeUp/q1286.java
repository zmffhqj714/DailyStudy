package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.compare;

public class q1286 {
    String xx;
    static int min =99999;
    static  int max=-99999;
    String x;
    int j = 1;
    static int i;

    private static void compare2(ArrayList<Integer> y) {
        for (i = 0; i <= y.size()-1; i++) {
            if (y.get(i) <= min) {
                min = y.get(i);

            }
            if(y.get(i) >= max){
                max = y.get(i);
            }
        }
        System.out.println(max + "\n" + min);
    }

    //! my code
    public static void main(String[] args) {

        ArrayList<Integer> y = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (i = 0; i <= 5-1; i++) {
                y.add(sc.nextInt());
        }
        compare2(y);


    }
}



























