package Algorithm_CodeUp;

import java.util.Scanner;

public class q1272rererere {

    //! my code
    public static void main(String[] args) {
        int x, y, i, temp = 0, xm = 0 , ym=0;
        int money = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>=y)
        {temp = x;}
        else{temp=y;}

            for (i = 1; i <= temp; i++) {
                if(i%2==1)
                {money = (i+1)/2;}
                else{money = (i/2)*10;}
                }
        if(i == x){xm = money;}
        if(i == y){ym = money;}
            }
        }

















