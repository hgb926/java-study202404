package day05;

public class ListMain {

    public static void main(String[] args) {

        StringList foods = new StringList(); // sArr 이 탄생하고 이름은 foods 를 부여
        StringList userNames = new StringList(); // foods, userNames 는 인스턴스

        // 배열 내부 데이터 수 확인
        // foods 는 배열타입이 아니다, StringList이라는 타입이고
        // StringList객체 안에 배열이 있기 때문에 foods.length는 되지않음
        System.out.println(foods.size());

        // 배열에 데이터 추가하기
        foods.push("짬뽕");
        foods.push("치킨");
        userNames.push("박영희");
        foods.push("탕수육");

        // 자료 삭제
        foods.remove("짬뽕");

        // 자료 중간 삽입
        userNames.push("김철수");
        userNames.push("홍길동");
        userNames.insert(1, "뽀로로");
        foods.insert(1,"마라탕");

        // 배열 데이터 수정
        foods.set(0, "김치볶음밥");

        // 배열 데이터 전체 삭제
        foods.clear(); // foods배열 내부가 전체삭제되고 size가 0이 되어야 함

        // 배열 데이터가 한개라도 있는지 확인
        boolean flag = foods.isEmpty(); // 배열이 비어있으면 true, 아니면 false
        boolean flag2 = userNames.isEmpty();
        System.out.println("flag = " + flag);
        System.out.println("flag2 = " + flag2);
        
        
        StringList hobbies = new StringList("ㅁ", "ㅇ", "ㅅ");
        System.out.println("hobbies = " + hobbies);

        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());

    }
}
