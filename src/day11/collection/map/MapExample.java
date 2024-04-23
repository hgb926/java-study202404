package day11.collection.map;


import day09.poly.car.Mustang;
import java.util.HashMap;
import java.util.Map;
// 제너릭이 K, V 두개

public class MapExample {
    public static void main(String[] args) {

        // 1회용 객체를 생성할 때 빠르게 만들 수 있음.

        Map<String, Object> map = new HashMap<>();
        // <key, 값의 데이터>
        // 보통 첫 데이터는 String이 들어가며
        // 두번째 데이터에는 아무 타입이나 넣을 수 있다.
        // 모든 타입을 다 넣고싶으면 Object

        // 데이터 추가: put()
        map.put("지갑잔액", 500);
        map.put("좋아하는 자동차", new Mustang());
        map.put("오늘 저녁 메뉴", "계란볶음밥");

        // 데이터 참조: get()
        int money = (int) map.get("지갑잔액");
        System.out.println("money = " + money);

        // 중복된 키를 저장하면 값이 수정된다.
        map.put("지갑잔액", 99999);
        
        // map 의 반복문 처리
        for (String s : map.keySet()) {
            System.out.println("key = " + s);
            // key만 추출된다.
            System.out.println("value = " + map.get(s));
            // value만 추출된다.
        }
    }
}
