package day10.inter;

public interface SmartPhone {

    // 인터페이스는 기본적으로 추상화 상태이기 때문에
    // 추상화 키워드를 사용하지 않아도 됨.

    // 인터페이스는 처음 설계부터 객체를 만들지 않을 것을 가정했으므로
    // 생성자 및 필드를 선언할 수 없음. 다만 상수는 선언가능
    // 필드를 만들면 public static final 이 생략되어 생성된다.
    public static final int AGE = 10;


    // 스펙 보여주기 기능
    // public abstract 가 자동으로 들어간다.
//    public abstract void information();
    void information();

    // 충전 기능
     void charge();

    // 카메라 기능
    void camera();
}
