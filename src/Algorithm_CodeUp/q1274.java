package Algorithm_CodeUp;

import java.util.Scanner;

public class q1274 {

    //! my code
    public static void main(String[] args) {
        int x, y, i, r = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                r += i;
            }
        }
        if(r == x+1){
        System.out.print("prime");}
        else{
            System.out.print("not prime");
    }}
}


















