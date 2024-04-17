package day07.encap.practice;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car("그랜져");


//        myCar.startStop();
//        myCar.start = false;

        // 속도 0~200km 로만 제한
//        myCar.speed = 500;
//        myCar.setSpeed(180);

//        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        // 그 외의 것이면 p모드.

//        myCar.setMode('N');
//        System.out.println("현재 변속 모드: " + myCar.getMode());

        BankAccount myAccount = new BankAccount("123-456-789", "김철수", 10000);
        System.out.println("현재 잔액: " + myAccount.getBalance());
        myAccount.deposit(50000);
        System.out.println("입금 후 잔액: " + myAccount.getBalance()); // 60000 출력
        myAccount.withdraw(20000);
        System.out.println("출금 후 잔액: " + myAccount.getBalance()); // 40000 출력


        PasswordManager pm = new PasswordManager("oldPassword123");
        boolean isChanged = pm.changePassword("oldPassword123", "newPassword123");
        System.out.println("Password changed: " + isChanged); // true



        Student student = new Student();
        student.setName("박영희");
        student.setStudentId("S001");
        student.setDepartment("Computer Science");
        System.out.println("학생 이름: " + student.getName());
        System.out.println("학번: " + student.getStudentId());
        System.out.println("전공: " + student.getDepartment());


        Car myCar = new Car();
        myCar.setBrand("현대");
        myCar.setModel("그랜져");
        myCar.setYear(1328);
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());


        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200000);
        product.setStock(30);
        System.out.println("상품명: " + product.getName());
        System.out.println("상품 가격: " + product.getPrice());
        System.out.println("재고 수량: " + product.getStock());
        product.reduceStock(5);
        System.out.println("판매 후 수량: " + product.getStock());
    }
}
