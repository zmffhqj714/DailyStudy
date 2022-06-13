package Algorithm_CodeUp;

import java.util.Scanner;

public class q3120_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,k = 0, b = 0, g =0;
        char j ;

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[122 - 96];
if(x >= y){
    k = y;
    g = x;
} else{
    k = x;
    g = y;
}
    while(k < g){
        k += 10;
        b ++;
    }
    b--;
    if(k > g){

        k -= 10;
        k += 5;
        b++;
    }

    if(k > g){
        b --;
        k -= 5;
        while(k != g){
            k ++;
            b++;

        }
    }else{
        while(k != g) {
            k++;
            b++;
        }
    }


}



        }

























