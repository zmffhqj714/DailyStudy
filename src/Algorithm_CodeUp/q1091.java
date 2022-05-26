package Algorithm_CodeUp;

import java.util.Scanner;

public class q1090 {
    public static void main(String[] args) {
        //! my code
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int cha = sc.nextInt();
//        int n = sc.nextInt();
//
//        long another = s * cha;
//
//        for (int i = 0; i < n - 2; i++) {
//            another *= cha;
//        }
//        //another를 int 로 해주었더니 오류가 났다.
//        // int는 최대 10자리까지 표현할 수 있어서 그 이상은 long 타입으로 변경해주었더니 정답이었다.
//        System.out.println(another);


    // ! another person code
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int cha = sc.nextInt();
    int n = sc.nextInt();
    long result = 0;
    //pow 제곱함수를 사용하여 구함, 기본 return 값이 double 이라 정답과 맞지 않는 형식이므로 long 타입으로 변경하여 전환
    result = (long) (s * Math.pow(cha,n-1));
        System.out.println(result);

    }

}
