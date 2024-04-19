package day09.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.p1 = 200; // parent 클래스의 필드
        child.c1 = 100; // child 클래스의 필드

        child.method1(); // overriding 한 수정본 출력
        child.method2();

        Parent parent = new Parent();
        parent.p1 = 500;
        parent.method1(); // 원본 출력


        // 부모의 타입으로 upCasting 하면 원래
        // 자기 자신의 필드는 사용할 수 없음
        Child castingChild = new Child();
        castingChild.p1 = 100;
//        castingChild.c1 = 300;
        castingChild.method1(); // 근데 overriding 한 수정본 출력됨.
//        castingChild.method2();

        Parent[] pArr = {castingChild}; // 자동으로 Parent 타입 업캐스팅
        Parent pp = castingChild; // 자동 형변환
    }
}
