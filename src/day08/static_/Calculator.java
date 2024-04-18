package day08.static_;

public class Calculator {

    String color; // 계산기 색깔
    static double pi; // 계산기 안에 저장된 원주율, 이런걸 static 붙힌다

    // 원의 넓이를 구하는 메서드
    static double calcArea(int r) { // r은 반지름
        return pi * r * r;
    }

    // 계산기에 색칠하는 메서드
    void paint(String color) {
        this.color = color;
    }

}
