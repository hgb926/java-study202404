package day07.inherit;

public class Smartphone extends ElectronicProduct{

    int storageCapacity; // 저장용량

    Smartphone(String productName, double price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("저장 용량: " + this.storageCapacity + " GB");
    }
}
