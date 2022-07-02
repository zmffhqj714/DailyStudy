package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q1425_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j = 0, index = 0, min = 0;

        int num = sc.nextInt();
        int chair = sc.nextInt();
        ArrayList<Integer> list = new ArrayList();


        for (i = 0; i < num; i++) {
            list.add((sc.nextInt()));
        }


        Collections.sort(list);

        for (i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i-1)+" ");
            if(i % chair == 0) {
                System.out.println(" ");
            }

        }

    }


    }































