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

}



























