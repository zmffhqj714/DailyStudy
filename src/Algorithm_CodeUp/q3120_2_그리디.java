package Algorithm_CodeUp;

import java.util.Scanner;

public class q3120_2_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, k = 0, c = 0, count = 0, b = 0,g =0, abs =0;
        char j;

        //입력값
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 오류 경우의 수
        //3. 그냥 + - 연산을 해주는 것이 아니다. 큰 값을 인덱스하고 가장 빠른 결과를 내는 값을 빼내야 한다. 복잡하다.

        // ? . x - y = 절댓값을 사용해도 될까?
        // x온도에서 y온도로 갔을 때  3 -> 22 도를 간다고 가정하면  +10 +10 -1, 22 -> 3도를 간다고 가정하면 -10 -10 +1
        // 다른 온도로 다시 확인해보면  7 -> 33 도 +10 +10 +5 +1  33도에서 7도  -10 -10 -5 -1이 된다.
        //! 결론적으로 x-y = 0을 사용하여 연산을 해주면 + - 에 대한 큰 값을 갖는 경로는 같기 때문에  +, -를 각각 해주는 복잡한 로직을 줄일 수 있다.
        // 이때 조건은  6개 10도+ 5도+ 1도+ 10도 - 5도 - 1도 - 에서 절댓값을 기준으로 하면 조건은 3개가 된다. - 10 -5 -1 이다.

        //? 6이 나온다. 5면 -5 4면 +5 -1 , 3이면 -1-1-1, +5 -1-1 같은 3번이므로 4이상부터는 +5를 하여 연산하고 -를 한다.
        // 7 :  -5 -1-1 , 8부터는 -10  +1+1 이 빠르다.  -5 -1 -1 -1 보다. 그러면 8이상부터는  +1 을 해주도록 한다.

        // 27 3에 대한 그리디 경로가 이상하다.  24- 10-10+5+1-10 5번이 최선아닌가? 24 -10-10-1-1-1-1보다  이게 최선 : 24 -10-10  -5 +1
        abs = Math.abs(x-y);

        while(true){

            if(abs == 0){
                System.out.print(count);
                break;
            }
                if (abs >= 10) {
                    abs -= 10;
                    count++;
                }
                else if (abs > 8) {
                    abs += 1;
                    count++;
                }else if (abs > 3) {
                    abs -= 5;
                    count++;

                }else if(abs < 0) {
                    abs++;
                    count++;
                }else{
                    abs --;
                    count++;
                }
            }

        }

        }

























