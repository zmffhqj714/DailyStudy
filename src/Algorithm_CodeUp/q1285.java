package Algorithm_CodeUp;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q1285 {

    //! my code
    public static void main(String[] args) {
        String xx;
        ArrayList<Integer> number = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        String[] setnumber;
        String[] x;
        int y = 0, j =1, i;
        int r = 0;
        Scanner sc = new Scanner(System.in);

        x = sc.nextLine().split("");


        for (i = 0; i <= x.length - 1; i++) {
            try {
                sb.append(Integer.parseInt(x[i]));
            } catch (Exception e) {
                sb.append("&");
            }
        }
        setnumber = sb.toString().split("&");
       // System.out.println(Arrays.toString(setnumber));
        r = Integer.parseInt(setnumber[0]);

        for (i = 1; i <= x.length; i++) {

            if (x[i].equals("=")) {
                System.out.println(r);
                break;
            }
                switch (x[i]) {
                    case "*":
                        r *= Integer.parseInt(setnumber[j]);
                        j++;
                        break;
                    case "/":

                        r /= Integer.parseInt(setnumber[j]);
                        j++;
                        break;
                    case "+":

                        r += Integer.parseInt(setnumber[j]);
                        j++;
                        break;
                    case "-":
                        r -= Integer.parseInt(setnumber[j]);
                        j++;
                        break;
                    default:
                }
            }
        }
        }
        //reference Code
//        Scanner scan = new Scanner(System.in);
//    String input = scan.nextLine();
//    ArrayList<Integer> arr = new ArrayList<>();
//    String[] part = input.split("");
//    int b = 0;
//		for (int i = 0; i < part.length; i++) {
//        try {
//        b = Integer.parseInt(part[i]);
//        } catch (Exception e) {
//        arr.add(i);
//        }
//        }
//        String[] numimshi = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//        numimshi[i] = "";
//        } // 넘임시 초기화
//        int[] num = new int[arr.size()];
//
//        for (int i = 0; i < arr.get(0); i++) {
//        numimshi[0] += part[i];
//        } // 첫 번째 수 넘임시에 넣기
//        for (int j = 1; j <= arr.size() - 2; j++) {
//        for (int i = arr.get(j - 1) + 1; i < arr.get(j); i++) {
//        numimshi[j] += part[i];
//        }
//        } // 두 번째 수부터 마지막에서 두 번째 수까지 넘임시에 넣기
//        for (int i = arr.get(arr.size() - 2) + 1; i < part.length - 1; i++) {
//        numimshi[arr.size() - 1] += part[i];
//        } // 마지막 수 넘임시에 넣기
//
//        for (int i = 0; i < arr.size(); i++) {
//        num[i] = Integer.parseInt(numimshi[i]);
//        } // 넘임시에 든 스트링형 숫자들 integer로 변환해 num에 넣기
//
//        for (int i = 0; i < arr.size(); i++) {
//        switch (part[arr.get(i)]) {
//        case "+":
//        num[i + 1] = num[i] + num[i + 1];
//        break;
//        case "-":
//        num[i + 1] = num[i] - num[i + 1];
//        break;
//        case "*":
//        num[i + 1] = num[i] * num[i + 1];
//        break;
//        case "/":
//        num[i + 1] = num[i] / num[i + 1];
//default:
//        break;
//        }
//        }
//        System.out.println(num[num.length - 1]);
//        }






























