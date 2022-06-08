package Algorithm_CodeUp;

import java.util.Scanner;

public class q1409_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;

        String x = sc.nextLine();
         String[] r = x.split(" "); //양쪽공백만 자르기
        int y = sc.nextInt();

        System.out.println(r[y-1]);
        //for문에서는 -1 하면 index 할 때 처음과 마지막 배열의 크기보다 초과되거나 적어서 오류가 나는데
        // 여기선 입력값을 받고 -1을 하니 ++과 --를 안해줘서 오류가 안난다.


        }}



















