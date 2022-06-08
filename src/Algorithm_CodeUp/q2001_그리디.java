package Algorithm_CodeUp;

import java.util.Scanner;

public class q2001_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 0, b=0;

         int[] pasta  = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int[] juice  = {sc.nextInt(),sc.nextInt()};

       int pamin = pasta[0];
       int jumin =juice[0];
     for(i = 1;i < pasta.length;i++){
         if(pamin>pasta[i]){
             pamin = pasta[i];
         }
     }
        for(i = 1;i < juice.length;i++){
            if(jumin>juice[i]){
                jumin = juice[i];
            }
        }
        System.out.println((pamin+jumin)+ (pamin+jumin)*0.1 );
        }}






















