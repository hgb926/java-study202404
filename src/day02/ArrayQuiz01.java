package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        
        // 배열에 담을 타입 선언 [] 배열이름
        // int[] numbers;
        // numbers = new int[5];

//        System.out.println("먹고 싶은 음식을 입력하세요!\n입력을 중지하려면 <그만>이라고 입력하세요.");
//        String[] foods = new String[0]; // foods 배열 초기화
//        while (true) {
//
//            System.out.print(">> ");
//            Scanner sc = new Scanner(System.in);
//            String newFood = sc.nextLine();
//            if (newFood.equals("그만")) {
//                break;
//            } else {
//                String[] temp = new String[foods.length + 1];
//                for (int i = 0; i < foods.length; i++) {
//                    temp[i] = newFood;
//                }
////                temp[foods.length] = newFood;
//                foods = temp;

        System.out.println("먹고 싶은 음식을 입력하세요!\n입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        // 음식이름을 저장할 빈배열 생성
        String[] foodList = {}; // 중괄호를 사용해서 new String 생략
        System.out.println("foodList = " + foodList);
        String[] temp;


        while (true) {
            // 음식 1개를 저장하는 코드
            System.out.println(">> ");
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) break;

            // 기존 배열보다 사이즈가 1개 큰 새 배열 생성
            temp = new String[foodList.length + 1];

            // 기존 foodList에 있던 음식들 새 배열로 복사
            for (int i = 0; i < foodList.length; i++) {
                // 좌항: 영역, 우항: 값
                temp[i] = foodList[i];
            }

            // 새 음식을 새 배열의 끝 인덱스에 추가
            temp[temp.length - 1] = newFood;

            // temp가 관리하는 새 배열을 기존 foodList로 주소값 이전
            foodList = temp;
            temp = null;
        }

        System.out.println("foodList = " + Arrays.toString(foodList));
    }

}
//        System.out.printf("먹고 싶은 음식: %s", Arrays.toString(foods));

