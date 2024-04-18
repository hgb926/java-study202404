package day08.static_;


public class Product {

    private String productName; // 제품 이름
    private int price; // 제품 가격


    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void sellProduct() {
        Store.addSale(this.price);
    }

}
