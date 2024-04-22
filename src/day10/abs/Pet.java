package day10.abs;

    // abstract 를 붙히면
public abstract class Pet {

    // ↓ Pet 을 상속받는 모든 클래스들의 필드
    String name;
    int age;
    String kind;

    // 밥, 잠 기능은 필수기능이니까 없으면 객체가 불안정해지므로
    // 강요할 필요가 있으므로 추상화
    public abstract void eat();
    public abstract void sleep();
    // 껍데기만 제공하면 되기에, 내용이 필요 없음
    // 추상 메서드는 본문이 없는 껍데기 역할
    // (자식들에게 이름을 통일시키기 위한 장치)로만 사용
    // 추상 메서드는 추상 클래스 안에서만 선언 가능
    // 다만 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 선언 가능
    // 산책 기능은 필요한 객체가 필요에 따라 오버라이딩 하는것이지
    // 모두에게 강요할 필요는 없다면 굳이 추상화하지 않아도 됨.
    public final void walk() {
        System.out.println("산책은 무조건 공원에서만 하세요.");
    }
}
