package day08.static_;

import util.SimpleInput;

import static day08.static_.Count.*;
import static java.lang.System.*;
import static util.SimpleInput.input;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        // static 데이터는 객체생성 없이 접근 가능
        x = 30;
        m1();

        Count c1 = new Count();
        Count c2 = new Count();
        c1.m2();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

        x = 50; // c1.x
        x = 99; // c1.x도 99로 재할당됨
        // static 필드를 참조할 때는
        // 객체.필드 가 아니라 클래스.필드 로 참조한다.

        out.println("c1.x = " + x);
        out.println("c2.x = " + x);
        out.println("======================");
        out.println("c1.y = " + c1.y);
        out.println("c2.y = " + c2.y);



        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        Calculator.calcArea(5);

        redCal.paint("빨강");
        blueCal.paint("파랑");


//        String name = input("이름: ");
        // import static util.SimpleInput.input; 을 하면
        // 편리하게 input 메서드를 사용할 수 있다.

        double random = random();

        out.println();

        m1();


        out.println("=======================");

        out.println("국가: " + Person.nation);

        Person gap = new Person("갑돌이", 20);
        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);


        Department compSci = new Department("컴퓨터 과학", 200);
        Department biology = new Department("생물학", 150);
        Department chemistry = new Department("화학", 120);


        compSci.addStudent(30);
        biology.addStudent(20);

        System.out.println("컴퓨터 과학과 학생 수: " + compSci.getStudentCount());
        System.out.println("생물학과 학생 수: " + biology.getStudentCount());
        System.out.println("화학과 학생 수: " + chemistry.getStudentCount());
        System.out.println("전체 학생 수: " + Department.getTotalStudents());



        Product product1 = new Product("노트북", 1000000);
        Product product2 = new Product("스마트폰", 500000);
        Product product3 = new Product("아이폰", 1772830);
        Product product4 = new Product("갤럭시", 1235480);
        Product product5 = new Product("맥북", 2530420);


        product1.sellProduct();
        product2.sellProduct();
        product3.sellProduct();
        product4.sellProduct();
        product5.sellProduct();


        System.out.println("총 판매액: " + Store.getTotalSales());

    }
}
