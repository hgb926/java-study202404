package day11.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        
        // 중복저장 허용 x, 순서가 없음, 비교적 빠른 저장속도
        Set<String> set = new HashSet<>();

        boolean flag1 = set.add("김말이"); // true
        set.add("닭꼬치");
        set.add("단무지");
        boolean flag2 = set.add("김말이");// false. 중복은 add 안된다.
        set.add("김밥");

        System.out.println("set = " + set);
        System.out.println("flag1 = " + flag1); // true
        System.out.println("flag2 = " + flag2); // false

        System.out.println(set.size()); // length
        
        // 탐색시에는 개별탐색은 불가, 전체탐색 가능
        for (String s : set) {
            System.out.println("s = " + s);
        }

        set.remove("단무지"); // set 은 index 가 없어서 문자열로 삭제해야함

        // 이걸 언제 쓰느냐?
        // set 은 보통 데이터 중복을 빠르게 제거할 때 사용
        List<Integer> numbers = List.of(3,3,1,1,1,3,5,5,2,2,25,25,5,7,7);
        
        // set 으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet); // 오름차순 정렬도 해준다
        // numberSet = [1, 2, 3, 5, 7, 25]

        // list 로 다시 변환
        numbers = new ArrayList<>(numberSet);
        System.out.println("numberSet = " + numberSet);
        // numberSet = [1, 2, 3, 5, 7, 25]
    }
}
