package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        String inputName = sc.nextLine();
        String myName = "홍길동";

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        // String 은 객체이고 new String 이 생략된 거라
        // 결국에는 stack 이 아닌 heap 에 저장된다, 따라서
        // 변수는 주소값을 가지고 있게 되고, == 는
        // 주소값을 비교하기 때문에 문자열이 같아도 false 가 출력된다.
        // 그리하여 문자열을 비교할땐 .equals()


        if (myName.equals(inputName)) {
            System.out.println("두 문자열이 같다!");
        } else {
            System.out.println("두 문자열이 다르다!");
        }
    }
}
