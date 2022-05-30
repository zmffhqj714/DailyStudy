package Algorithm_CodeUp;

import java.util.Scanner;

public class q1252 {
    public static void main(String[] args) {
        //! my code
int x = 0,y = 0,r,x1,y1;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        if(x1>y1){
            x = y1;
            y = x1;
            System.out.println(x+"*"+y);
        }else{
            x = x1;
            y = y1;
        }


            for (r = x; r <= y; r++) {
                System.out.print(r + " ");
            }
        }

        }













