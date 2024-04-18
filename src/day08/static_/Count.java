package day08.static_;

public class Count {

    // 사용 제한자 (usage modifier)
    static int x;     // 정적 필드     : 모든 객체가 공유
    int y;            // 인스턴스 필드 : 각 객체별로 따로 관리


    //  정적 메서드 : 모든 객체가 공유하며 객체 생성없이 접근 가능
    static void m1() {
        System.out.println("static method call!");
        System.out.println("x (static) = " + x);

        // static 메서드 내부에서는 instance 필드와 메서드를 직접 참조할 수 없다.
        // 왜?
        // static 은 객체생성 없이 호출되므로 this 를 가질 수 없기 때문이다.
      //  System.out.println("y (instance) = " + y); // 어떤 y를 가져와야 할지 모른다.

    }

    // 인스턴스 메서드 : 각 객체별로 따로 실행됨.
    void m2() {
        System.out.println("instance method call!");
        System.out.println("x (static) = " + x);
        System.out.println("y (instance) = " + y);
    }
}
