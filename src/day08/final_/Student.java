package day08.final_;

public class Student {

    String name;
    private final String ssn; // 주민번호
    static final String nation = "대한민국";


    // final 키워드를 선언하고 할당을 하지 않으면 const 처럼
    // 에러가 난다. 하지만 주민번호 같이 객체마다 다른 값을 가져야 하는
    // 값이 final 키워드를 사용하려면 생성자로 값을 받는다.
    // 그러면 final 선언문에 에러도 풀리고, 값 변경도 막아준다.
    Student(final String ssn) {
//        ssn = "wepigadgs"
        this.ssn = ssn;
    }

    // final 으로 작성했기 때문에 setter 함수가
    // 의미가 없고, 생성도 되지 않는다.
}
