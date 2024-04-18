package day08.static_;

public class Store {

    private static int totalSales; // 총 판매액

//    static {
//        totalSales = 0;
//    }

    static void addSale(int amount) {
        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }
}
