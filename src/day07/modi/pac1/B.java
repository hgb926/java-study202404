package day07.modi.pac1;

import day04.Dancer;
import day07.modi.pac2.C;

class B {

    public int z1;
    int z2;
    private int z3;

    
    void test() {

        A a1 = new A(50); // public
        A a2 = new A(5.5);// default
//        new A(true); // private  (사용 불가)
        
        a1.f1 = 20; // public
        a1.f2 = 30; // default
//        a1.f3 = 500; // private
        
        a1.m1(); // public
        a1.m2(); // default
//        a1.m3(); // private

        C c = new C();
        c.y1 = 10;
//        c.y2 = 20; // default
//        c.y3 = 30; // private

        Dancer dancer = new Dancer();
        dancer.dance();

    }
}
