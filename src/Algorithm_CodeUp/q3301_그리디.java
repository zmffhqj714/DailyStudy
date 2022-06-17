package Algorithm_CodeUp;

import java.util.Scanner;

public class q3301_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0,i;

        int[] x= {sc.nextInt()};


        for (i = 0; x[0] >= 0 ;i++){
            if(x[0] % 50000 == 0){
                x[0]-= 50000;
                count ++;
            }else if (x[0] % 10000 == 0){
                x[0]-= 10000;
                count ++;
            }else if (x[0] % 5000 == 0){
                x[0] -= 5000;
                count ++;
            }else if (x[0] % 1000 == 0){
                x[0] -= 1000;
                count ++;
            }else if (x[0] %  500== 0){
                x[0]-= 500;
                count ++;
            }else if (x[0] % 100 == 0){
                x[0]-= 100;
                count ++;
            }else if (x[0] % 50 == 0){
                x[0]-= 50;
                count ++;
            }else if (x[0] % 10 == 0){
                x[0] -= 10;
                count ++;
            }

        }
        System.out.println(count-1);
        }}

























