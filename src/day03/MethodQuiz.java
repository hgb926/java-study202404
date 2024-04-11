package day03;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 사이즈를 조절해서 새 배열을 만드는 함수
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    // 기존 데이터를 복사하는 함수
    static String[] copy(int size) {
        // 사이즈가 1개 큰 배열
        String[] temp = makeNewArray(size);
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }

    static String[] push(String newFood) {
        String[] temp = copy(1);
        temp[temp.length - 1] = newFood;
        foods = temp;
        return foods;
    }

    static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                return i;
            }
        }
        return -1;
    }

    static String[] remove(String food) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (food.equals(foods[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) { // 삭제
            String[] temp = new String[foods.length -1];
            for (int i = 0, j = 0; i < foods.length; i++) {
                if (i != index) {
                    temp[j++] = foods[i];
                }
            }
            foods = temp;
        }
        return foods;
    }

    static boolean include(String food) {
        for (String s : foods) {
            if (s.equals(food)) {
                return true;
            }
        }
        return false;
    }

    static String[] insert(int n, String food) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = foods.length; i > n; i--) {
            temp[i] = temp[i-1];
        }
        temp[n] = food;
        foods = temp;
        return foods;
    }


    static String[] modify(int n, String food) {
//      에러 방지 코드  if (n < 0 || n > foods.length - 1) return;
        foods[n] = food;
        return  foods;
    }


    public static void main(String[] args) {



        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플"); // 삽입

        printFoods();

        modify(2, "닭갈비"); // 교체
        printFoods();


    }
}
