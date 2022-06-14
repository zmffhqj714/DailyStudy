package Algorithm_CodeUp;

import java.util.Scanner;

public class q3120_2_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, k = 0, c = 0, b = 0, cha = 0, abs =0, g =0;
        char j;

        //입력값
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 오류 경우의 수
        // 1.  x-y 기준을 맞춰준다.
        // 2. 조건 3개 10도 5도 1도 

        if (x >= y) {
            k = y;
            g = x;
        } else {
            k = x;
            g = y;
        }


        System.out.println(g);

        while(true ){
            if(k == g){
                System.out.print(b);
                break;
            }
          if(abs <= 10){
              k+= 10;
              b++;
              System.out.println(k);
           }else if(k >= 5){
              k+= 5;
              b ++;
              System.out.println(k);
          }else{
              k ++;
              b ++;
              System.out.println(k);
          }

        }






        }}

























