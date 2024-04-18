package day08.super_;

public class Child extends Parent {

//    int a;
//    double b;
    boolean c;

    Child() {
//        super(); // 자동으로 상위클래스의 영향이 삽입된다: 나의 부모클래스의 생성자를 호출하라는 뜻
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }

    Child(int x) {
        super();
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }

    void childMethod() {
        System.out.println("Child.a = " + this.a);
        System.out.println("Child.b = " + this.b);
        System.out.println("Child.c = " + this.c);
    }

}
