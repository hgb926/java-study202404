package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(students));
        System.out.println("- 수정할 멤버의 이름을 입력하세요.");

        while (true) {

            System.out.println(">> ");
            // 탐색
            String target = sc.nextLine();
            int index = -1;
            for (int i = 0; i < students.length; i++) {
                if (target.equals(students[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                    System.out.println(target + "은(는) 없는 이름입니다.");
                    System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            } else {
                System.out.println(target + "의 별명을 변경합니다.");
                System.out.println(">> ");
                // 변경 과정
                String change = sc.nextLine();
                students[index] = change;
                System.out.println("변경 완료!!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(students));
                break;
            }
        }
    }
}
