package Algorithm_CodeUp;

import java.util.Scanner;

public class q1370 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j,k = 0,b;
        int x = sc.nextInt();
        int y = sc.nextInt();
        //String[][] arr = new String[x][x];
        int l = 0, r = x-1;

        for(k=0; k < y ;k++) {  //반복수
            for (i = 0; i < x; i++) {       //공백++ 하는 for문
                for (b = 0; b < i; b++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (i = 0; i < x-1; i++) {    //공백-- 하는 for문
                for (b = x -2; b > i; b--) { // i를 사용해서 공백을 줄 수 있음
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }

        }


        // 높이와 길이를 어떻게 기준점을 잡고 구현해야 하는지 어려웠다.
        //한 번에 처리하고 싶어서 크게 잡고 코드를 구현하다보니 계속 꼬여서 완전 하기 싫어졌다. 이 길 내 길 맞나 우울했다.
        // 마음 다잡고 다시 와서 작은 거 부터 천천히 구현하였더니  구현이 완성되었다.
        // 복잡한 문제가 나올때는 우선 기준점을 확실히 잡고 작은 것부터 차례대로 구현해야겠다고 느꼈다.
        // 해결하니까 또 아까의 기분과 상반되게 자존감이 올라간다.. 코딩의 매력일까..
    }
}

















