package day07.encap.practice;

public class Product {

    private String name;
    private int price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int stock) {
        if (this.stock < stock) {
            System.out.println("현재 재고가 요청된 수보다 적습니다. ");
        } else {
            this.stock -= stock;
        }
    }
}
