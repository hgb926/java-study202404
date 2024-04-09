package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int korScore = 77;
        int engScore = 100;
        int mathScore = 99;

        int[] scoreKim = {korScore, engScore, mathScore};
        int[] scorePark = {100, 22, 56};
        int[] scoreHong = {40, 90, 80};

        int[][] classScores = { scoreKim, scorePark, scoreHong};
        System.out.println(classScores.length); // 3
        System.out.println(classScores[0] == scoreKim); // true
        System.out.println(Arrays.toString(classScores[1])); // [100, 22, 56]
        System.out.println(classScores[2][1]); // scoreHong의 1번 인덱스 90
        System.out.println(Arrays.toString(classScores)); // 주소값 출력
        System.out.println(Arrays.deepToString(classScores)); // 자세히 출력 (deepToString)
        System.out.println("2차원 배열의 2번 인덱스: " + classScores[2]);
        System.out.println("scoreHong의 주소: " + scoreHong);

        // 2차원 배열의 순회
        for (int i = 0; i < classScores.length; i++) {
            for (int j = 0; j < classScores[i].length; j++) { // 중첩
                System.out.printf("%d ", classScores[i][j]);
            }
            System.out.println();
        }
        // js: for ~ of, java: enhanced for loop, iteration (향상된 for문)
        System.out.println("========================");
        for (int[] scores : classScores) { // 2차원 배열의 순회는 1차원 배열을 뽑을 수 있도록 데이터타입[]
            for (int n : scores) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
        int[][] arr2by3 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int[][] arr4by5 = new int[4][5]; // 4행 5열의 공간만 만들 때.
        for (int[] ints : arr4by5) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
            System.out.println();
        }
    }
}
