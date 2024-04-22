package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수1: ");
            int n1 = Integer.parseInt(sc.next()); // NumberFormatException

            System.out.println("정수2: ");
            int n2 = sc.nextInt(); // InputMismatchException

            int result = n1 / n2; // ArithmethicException

            String s = null; // NullPointException
            s.equals("hello");

            System.out.println("result = " + result);

        } catch (InputMismatchException e) { // exception 말고 구체적인 에러명을 적으면 그 에러만 잡아준다
            System.out.println("정수를 입력하세요");
        } catch (NumberFormatException e) {
            System.out.println("문자로 변환할 수 없는 숫자입니다");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); // 에러 로그를 띄움 - 개발시에 유용
        } catch (Exception e) {
            System.out.println("알 수 없는 에러입니다.");
        }

        System.out.println("프로그램 정상 종료!");
    }
}
