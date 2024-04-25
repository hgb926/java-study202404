package day12.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static day12.stream.Menu.*;

// map: 리스트에서 원하는 데이터만 추출
public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 추출
        List<String> nameList = menuList
                .stream()
                .map(m -> m.getName())
                .collect(Collectors.toList());
        System.out.println("nameList = " + nameList);

        // 배열 생성
        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> collectLength = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());

        List<Character> collect = words.stream()
                .map(w -> w.charAt(0)) // charAt(index): 문자열에서 해당위치 글자 추출
                .collect(Collectors.toList());

        // 메뉴 목록에서 메뉴이름과(name) 칼로리(calories)를 추출해서
        // 새로운 객체에 포장하고 싶음.
        // 두개의 필드만 갖고 있는 클래스를 새로 생성! (getter, 생성자, toString 생성)
        List<SimpleDish> simpleDishList = menuList
                .stream()
                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories()))
                .collect(Collectors.toList());

        simpleDishList.forEach(sd -> System.out.println(sd));

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
            단, 타입은 meat 의 경우 육류 라고 저장
            fish 는 어류라고 저장, other 는 기타라고 저장
         */

        List<DishDetail> dishDetailList = menuList
                .stream()
                .filter(m -> m.getCalories() > 500)
                .map(dish -> new DishDetail(dish))
                .collect(Collectors.toList());


        System.out.println("dishDetailList = " + dishDetailList);

        System.out.println("=================================");
        
        // 메뉴 목록에 있는 요리들의 총 칼로리 수 구하기
        int sum = menuList
                .stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("sum = " + sum);
        
        // 육류 메뉴의 평균 칼로리
        double averageMeatCalories = menuList
                .stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.println("averageMeatCalories = " + averageMeatCalories);
    }
}
