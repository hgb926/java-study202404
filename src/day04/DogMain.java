package day04;

public class DogMain {

    int x = 20; // 필드
    public static void main(String[] args) {

//        System.out.println(x);     // 필드는 main에서 참조할 수 없음
        int a = 10; // 지역변수
        Dog choco = new Dog("초코"); // 지역변수
        Dog poppy = new Dog("뽀삐");

        choco.petInfo();
        System.out.println("==========================");
        poppy.inject();
        poppy.petInfo();
    }
}
