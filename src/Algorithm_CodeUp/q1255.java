package Algorithm_CodeUp;

import java.util.Scanner;

public class q1255 {
    public static void main(String[] args) {
        //! my code
        double x, y, r;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x <= y) {
            for (r = x; r <= y; r += 0.01) {
                System.out.printf("%.2f ", r);


            }
        }
    }

        }













