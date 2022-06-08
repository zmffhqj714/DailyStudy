package Algorithm_CodeUp;

import javax.xml.stream.StreamFilter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class q1411_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i,j, k = 0, b = 0;



     String[] x= new String[50];
       int  y = sc.nextInt();
        for (i = 0; i < y-1; i++) {
            x[i] = sc.next();
        }
        for (i = 1; i <= y; i++) {
           if(!Arrays.asList(x).contains(String.valueOf(i))){
                System.out.println(i);
            }
        }

        }
        //배열 숫자찾기
//     int[] x= new int[50];
//        for (i = 0; i <y-1; i++) {
//            x[i] = sc.nextInt();
//        }
//
//        for (i = 1; i  <= y; i++) {
//            int finalI = i;
//            if(IntStream.of(x).noneMatch(r -> r == finalI)){
//                System.out.println(i);
//            }
//        }

        //배열 문자찾기
//         String[] x= new String[50];
//        for (i = 0; i <y-1; i++) {
//            x[i] = sc.next();
//        }
//
//        for (i = 1; i <=y; i++) {
//            int finalI = i;
//            if(!Arrays.stream(x).anyMatch(r -> r.equals(String.valueOf(finalI)))){
//                System.out.println(i);
//            }
//        }
        }



















