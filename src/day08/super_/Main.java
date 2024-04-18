package day08.super_;

public class Main {

    public static void main(String[] args) {

        Child c = new Child();
//        c.superMethod();
        c.childMethod();
        // 상속은 사실 물려주는 개념이 아니라 별도의 개념이다, 주소값을 연결해서 참조하는 개념
        // 하위클래스에서 부모클래스와 똑같은 필드를 선언하면 그게 우선이다.
        // 하위에는 a가 없고, 상위에는 a가 있다 가정하면, 하위클래스에서 this.a를 찍으면
        // 하위엔 없기 때문에 상위클래스에서 가져옴

        // 자식 클래스의 메모리에서는 this 라는 필드를 자동으로 만들고 자신의 주소값을 저장하고,
        // 상속을 받았다면 super 라는 필드도 만들어서, 부모의 주소값을 저장한다
        // 부모의 주소값을 참조해서 데이터를 찾을 수 있다.
    }
}
