package Algorithm_CodeUp;

import java.util.Scanner;

public class q1369 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        int  x = sc.nextInt();
        int  y = sc.nextInt();
        String[][] arr = new String[x][x];
int l = 1,r = x-3;

        for ( i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if(i+1%3==0){
                    if(i >= x){
                        break;
                    }
                    arr[i][l]="*";
                }

                l+=y;
                if (i == 0 || i == x - 1 || j == 0 || j == x - 1) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
            }
            }

                for (i = 0; i < x; i++) {
                    for ( j = 0; j < x; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            }
        }

















