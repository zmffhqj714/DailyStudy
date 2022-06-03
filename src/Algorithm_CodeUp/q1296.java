package Algorithm_CodeUp;

import java.util.Scanner;

public class q1296 {
    private static void encode(char[] x) {
        //! my code
        StringBuffer sb = new StringBuffer();
        int i,j =0;
        String r;
        for (i = 0; i <=x.length-1; i++) {
            if ( x[i]<=99) {
                sb.append(Character.toChars(x[i] + 23));
            }
        else{
                sb.append( Character.toChars(x[i]-3));
            }}

        r = sb.toString().replace("7"," ");
        System.out.print(r);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x ;
        x =sc.nextLine().toCharArray();

        encode(x);


    }
    // 느낀점
    //처음에 배열에 abcd 만들어서 문자배열로 할당해줬는데 다시 할당해줄 필요없이 이미 컴퓨터가 알 수 있는 아스키코드로 인식하고 그 인식한코드로 제어하면 되는 것이었다.
    // 문자로 비교해주려고 했지만 char타입으로 비교해줄 수 있기 때문에 메모리 저장공간을 절약할 수 있었고
    // 아스키 코드 처음 분석해보는데 아주 재미졌다.
    //10 진수 기준 30번대는 공백문자, 60번대는 특수문자, 80번대 숫자, 90번대 알파벳문자 라는 정도만 알아두자.
    //연산후에 원하는 타입으로 변환해준다.
}



























