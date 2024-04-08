package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열에서 원하는 위치의 값 삭제하기 (slice)
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 0;

//        numbers[0] = numbers[1];
//        numbers[1] = numbers[2];
//        numbers[2] = numbers[3];
//        numbers[3] = numbers[4];
//        numbers[4] = numbers[5];

        for (int i = targetIndex; i < numbers.length - 1 ; i++) {
            numbers[i] = numbers[i+1];
        }

        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));
    }
}
