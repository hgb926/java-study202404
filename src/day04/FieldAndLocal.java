package day04;

import java.util.Scanner;

public class FieldAndLocal {


    // 필드는 값을 초기화 하지 않아도
    // 각 타입의 기본값으로 자동 세팅
    // 정수: 0, 실수: 0.0, 논리: false, 문자(char): ' ', 나머지: null
    int aaa; // heap. 메모리가 널널하여 값을 안넣어도 자동으로 기본값 할당


    // ccc: 매개 변수(parameter) - 메서드 호출 시 반드시 필요한 인자값, 지역변수에 가까움
    void foo(int ccc) {
        int bbb = 10; // stack. 메모리 공간 확보를 위해 값을 안넣으면 정의되지않는다

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}

