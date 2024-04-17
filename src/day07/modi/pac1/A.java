package day07.modi.pac1;

// 같은 클래스 안에서는 제한자가 뭘 붙든 간에 상관이 없고 다 사용 가능.
public class A {

    // 필드
    public int f1;
    int f2; // default 제한이 걸려있음
    private int f3;

    // 메서드
    public void m1() {}
    void m2() {} // 마찬가지로 default 걸려있음
    private void m3() {}

    // 생성자
    public A(int a) {}
    A(double b) {} // default
    private A(boolean c) {}

    void test() { // 같은 클래스 안에서는 모든 필드를 갖다 써도 됨
        this.f1 = 10;
        this.f2 = 10;
        this.f3 = 10;

        m1();
        m2();
        m3();

        new A(10); // public
        new A(5.5); // default
        new A(false); // private
    }

}
