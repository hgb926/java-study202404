package day03;

import java.util.Arrays;
import java.util.Scanner;

public class MethodBasic {
    
    // 자바의 함수는 반드시 클래스 블록 내부, 다른 메서드 외부에 만들어야 함
    // 함수 명 앞에는 리턴되는 데이터의 타입을 적어줘야 함. 배열은 int[]
    // 두개의 정수를 전달받아 합을 리턴하는 함수
    static int add(int n1, int n2) { // parameter의 타입을 지정해줘야 함
        return n1 + n2;
    }
    int add2(double n1, int n2) { 
        return (int) (n1 + n2);
    }
    String[] add3(int n1, int n2) {
        return new String[]{"hello", "java"};
    }
    static void multiply(int n1, int n2) { // return이 없는 함수는 이름 앞에 void.
        if (n1 > 100) return; // void가 있는 함수의 종료 용도로만 return을 사용
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    // n개의 정수를 전달받아 그 총합을 반환하는 함수
     static int addAll(int... numbers) { // 배열을 받으면 된다. // js: ... java: int... numbers
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 정수를 전달받아 사칙연산의 결과를 모두 리턴
    static int[] operate(int n1, int n2) {
        return new int[] {add(n1, n2), n1 - n2, n1 * n2, n1 / n2};
    }


    public static void main(String[] args) { // main도 함수라 이 내부에서 생성 불가능
    // 함수를 호출할 때는 함수 안에서만 가능
    int r1 = add(10, 20);
        System.out.println("r1 = " + r1);

        // void함수는 함수의 결과를 변수에 담을 수 없음
        // 반드시 단독호출해서 사용
        multiply(5, 3);

        int r2 = addAll(new int[] {1, 3, 5, 7, 9});
        System.out.println("r2 = " + r2);

        int[] operate = operate(10, 20);
        System.out.println(operate[2]);

    } // end main method


} // end class
