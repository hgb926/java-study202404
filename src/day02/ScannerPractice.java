package day02;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        System.out.println("**** 상품 재고 총액 구하기 ****");
        Scanner sc = new Scanner(System.in);

        System.out.print("- 상품의 가격: ");
        int price = Integer.parseInt(sc.nextLine());

        System.out.print("- 상품의 수량: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.println("-----------------------");

        System.out.print ("상품 재고 총액: " + price * quantity + "원");
    }
}
