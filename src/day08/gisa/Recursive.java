package day08.gisa;

class Parent1 {
    int compute(int num) {
        if (num <= 1) return num;
        return compute(num -1) + compute(num-2); //
    }
}

class Child1 extends Parent1 {
    int compute(int num) {
        if (num <= 1) return num;
        return compute(num -1) + compute(num-3); // x + 1
    }
}

public class Recursive {
    public static void main(String[] args) {

        Child1 cc = new Child1(); // cc의 compute 가 실행됨. parent 엔 접근도 하지않음
        System.out.println(cc.compute(4));

    }
}
