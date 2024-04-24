package day12.stream;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static day12.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;


// .stream() (forEach는 stream이 필요없음)
// .filter map some ... 
// 인자로 new Predicate
// 조건 적고 람다로 변경
// .collect(Collectors.toList());
// 변수로 받는다

public class Filtering {
    public static void main(String[] args) {
        
        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = menuList
                .stream()
                .filter(dish -> dish.isVegeterian())
                .collect(toList());

        System.out.println("dishList = " + dishList);

        dishList.forEach(dish -> {
            System.out.println(dish.getName());
        });

        System.out.println("================================");
        List<Dish> dishList1 = menuList
                .stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .collect(toList());
        System.out.println("dishList1 = " + dishList1);

        menuList
                .stream()
                .filter(d -> d.getCalories() > 300) // 필터
                .limit(3) // 처음 3개만 출력
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d)); // 객체 출력

        System.out.println("============================");
        // 300 칼로리보다 높은 요리 중 처음 2개는 제끼고 필터링
        menuList
                .stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        
        List<Integer> numbers = List.of(1,2,3,4,5,6,2,4,2,1);
        // 리스트에서 짝수만 필터링
        List<Integer> collect =
                numbers
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .distinct() // 중복 제거
                        .collect(toList());

        System.out.println("collect = " + collect);
        // [2, 4, 6]
    }
}
