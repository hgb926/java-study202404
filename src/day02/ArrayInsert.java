package day02;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 50, 90, 100, 150};
        int newNumber = 66;
        int targetIndex = 1;

        // 50 과 90 사이에 66을 삽입!
        // 크기가 하나 더 큰 배열을 만들고,
        // 끝 인덱스부터 뒤로 보내서 targetIndex가 들어갈 공간을 마련한다.

        // 1. 사이즈가 1개 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 기존데이터 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 삽입위치에서 데이터 뒤로 1칸씩 이동
        //    이동 순서는 끝에서부터 시작해야 함
        for (int i = arr.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

        // 4. 새로운 데이터를 타겟 인덱스자리에 복사
        temp[targetIndex] = newNumber;

        // 5. 주소값 이전
        arr = temp; temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));
    }
}
