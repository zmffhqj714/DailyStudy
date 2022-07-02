package Algorithm_CodeUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class q1420_1차원배열 {

    //! my Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j = 0, index = 0, min = 0;

        int x = sc.nextInt();
        ArrayList<Student> list = new ArrayList();


        for (i = 0; i < x; i++) {
            list.add(new Student(sc.next(), sc.nextInt()));
        }


        Collections.sort(list);
        System.out.println(list.get(2).name);

              {
        }
    }

    static class Student implements Comparable<Student>{
            String name; int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String  getName() {
            return this.name;

        }
        public int getScore() {
            return this.score;
        }
        @Override
        public int compareTo(Student s) {
            if(this.score >  s.getScore()){
                return -1;
            }else if(this.score < s.getScore()){
                return 1;
            }
            return 0;

        }
    }

    }





























