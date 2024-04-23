package day11.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>(); // <> 안에 필요한 타입 넣기
        foods.add("짜장면");
        foods.add("볶음밥");
        foods.add("파스타");
        foods.add("리조또");

        System.out.println(foods); // [짜장면, 볶음밥, 파스타, 리조또]

        // 중간삽입 add(index, E)
        foods.add(1,"짬뽕");
        System.out.println(foods);
        
        int size = foods.size();
        System.out.println("size = " + size); // 5
        
        int index = foods.indexOf("파스타");
        System.out.println("index = " + index); // 3

        boolean flag = foods.contains("파스타");
        System.out.println("flag = " + flag); // true

        foods.remove(0);
        foods.remove("파스타");
        System.out.println(foods); // [짬뽕, 볶음밥, 리조또]

        foods.set(0,"동파육"); // 수정
        System.out.println(foods); // [동파육, 볶음밥, 리조또]

        String s = foods.get(1); // foods[1]
        System.out.println("s = " + s); // s = 볶음밥

        // 반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
        // iter 도 가능.
        for (String food : foods) {
            System.out.println(food);
        }

        foods.clear(); // 배열 내부 비우기
        System.out.println(foods); // []
        
        System.out.println(foods.isEmpty()); // true
        
        // 리스트에 초기값 넣고 시작하기
        int[] arr = {10, 20, 30};
        List<Integer> numbers = new ArrayList<>(List.of(10, 50, 30));
        System.out.println("numbers = " + numbers);
        // numbers = [10, 20, 30]

        List<String> str = new ArrayList<>(List.of("가","나","다"));
        System.out.println("str = " + str);
        // str = [가, 나, 다]

        // 오름차 정렬
        numbers.sort(Integer::compareTo);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());

    }
}
