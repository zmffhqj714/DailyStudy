package Algorithm_CodeUp;

import java.util.Scanner;

public class q1378 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b=0;
        int x = sc.nextInt();

       int r = 0;
       //이게 되는 이유
//     for(i = 1;i < x;i++){
//         b += i;   //b에서 연산이 1, 1+2, 1+2+3 을 해줄 때마다
//         r += b; //r에 결과값을 더해주면 최종적으로 수열의합이 나온다.
//     }

        //이건 안되는 이유
//        for(i = 1;i < x;i++){
//         b += i;  //
//         b += b;  // 1 + 1/  2 + 2 +4 / 라는 식으로 합산되므로 문제의 조건과 일치하지 않는다.
//     }


        //another person code
        for(i = 1;i <= x;i++){
            for(j = 1; j <= i; j++){
                r += j;
            }
     }
        System.out.println(r);
        }}

//





















