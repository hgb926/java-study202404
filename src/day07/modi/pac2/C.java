package day07.modi.pac2;

import day07.modi.pac1.A;


public class C {

    public int y1;
    int y2; // default
    private int y3;


    void test() {

        A a = new A(100);// public (사용 가능) 공공재
//        new A(5.5); // default (사용 불가) 패키지가 다르다
//        new A(true) // private (사용 불가)

        a.f1 = 10; // public 가능
//        a.f2 = 20; // default
//        a.f3 = 30; // private

        a.m1(); // public 가능
//        a.m2(); // default
//        a.m3(); // private

//        B b = new B();
    }
}
