package Algorithm_CodeUp;

import java.util.*;

public class q3321_그리디 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int i, j = 0, p = 0, r = 0, r2 = 0;
//
//
//        int x = sc.nextInt();
//        int dowp = sc.nextInt();
//        int topingp = sc.nextInt();
//        int dowk = sc.nextInt();
//        int[] tocal = new int[x];
//        int[] reverseArr = new int[x];
//        int[] result = new int[x];
//        int[] resultArr = new int[x];
//
//        for (i = 0; i < x; i++) {
//            tocal[i] = sc.nextInt();
//        }
//
//        Arrays.sort(tocal);
//
//        for (i = tocal.length - 1, j = 0; i >= 0; i--, j++) {
//            reverseArr[j] = tocal[i];
//        }
//
//        resultArr[0] = dowk + reverseArr[0];
//        p = dowp + topingp;
//        result[0] = resultArr[0] / p;
//
//        for (i = 1; i < x; i++) {
//            resultArr[i] = (resultArr[i - 1] + reverseArr[i]);
//            p += topingp;
//           result[i] = resultArr[i] / p;
//
//        }
//
//        for (i = 1; i < x ; i++) {
//            if (result[i] > result[0]) {
//                result[0] = result[i];
//            }
//
//        }
//
//        System.out.println(result[0]);

        //! another person Code
        int num=sc.nextInt();
        int doughCost=sc.nextInt();
        int tCost=sc.nextInt();

        int doughCal=sc.nextInt();
        Integer cal[]= new Integer[num];
        for(int i=0;i<num;i++) {
            cal[i]=sc.nextInt();
        }

        Arrays.sort(cal,Collections.reverseOrder());

        int bCal=doughCal;
        int bCost=doughCost;
        int before=bCal/bCost;

        int aCost=bCost;
        int aCal=bCal;
        int after=0;
        for(int i=0;i<num;i++) {
            aCost+= tCost;
            aCal+=cal[i];
            after=aCal/aCost;
            before=bCal/bCost;

            if(before>after)
                break;
            else {
                bCal=aCal;
                bCost=aCost;
            }

        }

        int answer=before;
        System.out.println(answer);
    }

            }


































