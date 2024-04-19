package day09.poly;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    void test() {

        // 다형성: 객체가 여러 타입을 사용할 수 있다.
        // 여러 타입이란 건, 부모의 타입을 사용 가능하단 것

//        Object x1 = new A();
        A x1 = new A();
//        B x2 = new B();
        A x2 = new B();
//        C x3 = new C();
        A x3 = new C();
        A x4 = new D();
        A x5 = new E();


        int a = 10;
        double b = a;

        // 자식이 부모의 타입을 사용하는건 upCasting
        C c = new C();
        A d = (A) c;
    }
}


