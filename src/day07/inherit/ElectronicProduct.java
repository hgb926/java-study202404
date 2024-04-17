package day07.inherit;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;


    public void displayInfo() {
        System.out.println("제품명: " + this.productName + ", 가격: " + this.price + ", 제조사: " + this.manufacturer);
    }
}

