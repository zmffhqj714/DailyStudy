package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class q1287 {


    private static void gugucon(int y) {
        //static 으로 했는데 엔터처리나서 사소한 오류 발생, 런타임시에 엔터를 쳐주는 듯하다. 로컬변수로 변경해주니 정답!
       String x = "*";
        int j = 1;
       int i;
         int r = y;
        for (i = 0; i <=9-1; i++) {
            for (j = 1; j <= r ; j++) {
                System.out.print("*");
            }
            r += y;
            j =1;
            System.out.print("\n");
        }


    }

    //! my code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        y =sc.nextInt();
       gugucon(y);


    }
}



























