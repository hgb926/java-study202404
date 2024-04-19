package day09.poly.practice;

public class ComputerPart {
    protected String partName; // 부품 이름
    protected double partPrice; // 부품 가격

    public ComputerPart(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public void describePart() { // 부품의 이름, 가격 출력
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    }
}
