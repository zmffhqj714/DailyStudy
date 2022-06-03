package Algorithm_CodeUp;

import com.sun.source.doctree.StartElementTree;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Member;
import java.util.*;
import java.util.stream.Collectors;

public class q1295 {
//  !my code
//    private static void convert(char[] x) {

//        StringBuffer sb = new StringBuffer();
//       int i,j =0;
//       String r;
//        for (i = 0; i <=x.length-1; i++) {
//            if (x[i]>= 65 && x[i] <= 90) {
//           x[i] = (char)(x[i]+32);
//                    }else if(x[i]>= 97 && x[i] <= 122){
//                x[i] = (char)(x[i]-32);
//           }else{
//                x[i] = x[i];
//            }
//          }
//
//
//        ArrayList<Character> list = new ArrayList<>();
//        for (i = 0; i <=x.length-1; i++) {
//        list.add(x[i]);
//        }
//       list.forEach(System.out::print);
//        }
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x;
        x =sc.nextLine().toCharArray();
     //  convert(x);
        whatlist(x);



    }

    //자료구조 각자료구조에 회원의 정보를(이름 나이 성별 주문날짜를 담고 람다식으로 출력하고 각예시를 생각하며 할당하여 사용하시오.
    //List 1, Arraylist : 링크리스트 노드로 검색보다 빠르게 검색가능, 고정사이즈, 사이즈add로 추가가능  조회에 효율적  , 삭제인덱스 삭제 후 데이터 앞으로 이동 , 맨마지막값 비어있음
    // 2. LinkedList: 주소를 수정하는게 아닌 노드만 연결시켜서 빠름 , 삽입삭젲에 효율적  노드를 통해 자료를 추가삭제, 삭제할 노드들을 연결
    // Vector: 삽입,삭제에효율적, 멀티쓰레드환경에서 사용하는게 안전
    //stack: 최근것부터 불러와야 할 경우 사용(페이지, 기능) 메모리절약
    // 1.LinkkedList
    // 2. Stack
    //queue : 처음값부터 불러와야 할 경우 사용 ex) 인쇄대기, 대기번호, 프로세스, 캐시
    // 1.LinkedList
    // Hash Table
    // 1. HashMap 2. HashTable(동기화지원) 3.Hashset

    // ! 정리 조회 위주로 할거냐? arraylist  삽입삭제가 많냐 linkedlist 멀티쓰레드를 동작시키고 삽입삭제를 하냐? vector 순서처리냐? queue 최근것부터 불러올거냐 stack


    private static void whatlist(char[] x) {
        //? 리스트에 여러가지 데이터 타입을 담아 줄 수는 없을까? 객체로 담으면 됨
        //선언과 동시에 할당해버리면 원본은 수정이 안되고 런타임시에만 변경돼서 의미 없는 코드임
        //List<Object> list = Arrays.asList("리스트",28,"남",20220603);
        List<Object> list = Arrays.asList("리스트",28,"남",20220603);

        ArrayList arr = new ArrayList();
        arr.add(list);
        arr.add(1,"바보");
        arr.add(2,"바보");
        arr.add(3,"바보");

        arr.forEach(e -> System.out.println(e));
       LinkedList link = new LinkedList(Arrays.asList("링크리스트",28,"남",20220603));
       link.add(1,"d");
         Vector<Object> vv = new Vector(Arrays.asList("벡터",28,"남",20220603)) ;
       // vv.addAll(link);
        //최근페이지 링크, 가장최근 보내줘야함 , 저자공간이 유동적이지 않음
        Stack<Integer> st = new Stack();
        st.add(0,4);
        st.add(1,3);
        st.add(2,2);
        // 은행업무 순서대로 처리해야함, 요청값 순서대로 처리해야함
        Queue<Object> qe = new LinkedList<>(Arrays.asList("큐",28,"남",20220603,"이것도되네그럼?",28,"남",20220603));
        qe.add(list);
        qe.add(link);
        qe.add(vv);


        //고객의 데이터 해쉬맵으로 저장하여 람다식 인덱스하기
        HashMap<String,Object> map = new HashMap();
        map.put("벡터",vv);
        map.put("리스트",link);

       // link.add(1,"?");
       //벡터정보 가져오기
     Object v =   map.entrySet()
             .parallelStream()
             .filter( e -> e.getKey().equals("벡터"))
             .collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue()));
        System.out.println(v);

        for (String i : map.keySet()
             ) {
            System.out.println(i+" "+ map.get(i));

        }

       // ArrayList<Integer, Object> arrayList = new ArrayList<Integer,Object>();




    }
}



























