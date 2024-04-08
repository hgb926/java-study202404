package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        System.out.println("먹고 싶은 음식을 입력하세요!\n입력을 중지하려면 <그만>이라고 입력하세요.");
        String[] foods = {};
        while (true) {

            System.out.print(">> ");
            Scanner sc = new Scanner(System.in);
            String newFood = sc.nextLine();
            if (newFood.equals("그만")) {
                break;
            } else {
                String[] temp = new String[foods.length + 1];
                temp[foods.length + 1] = newFood;
            }

        }

    }
}
