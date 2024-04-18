package day08.protec.pac2;

import day08.protec.pac1.A;

public class C {

    void test() {
        A a = new A(); // public
//        new A(10); // protected
//        new A(5.5); // default

        // protected, default 다른 패키지에서는 안된다.
        // 하지만 상속관계는 허용

//        a.f1 = 10;
//        a.f2 = 30;
//        a.m1();
//        a.m2();
    }
}
