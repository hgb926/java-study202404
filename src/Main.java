

public class Main {
    public static void main(String[] args) {

        System.out.println(10 + 5);
        System.out.println("안녕");

        int month = 5;
        int day = 5;
        String anni = "어린이날";
        System.out.println(month + "월 " + day + "일은 " + anni + "입니다");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.printf("%d월 %d일은 %s입니다.", month, day, anni);

        int x = 10, y = 20;

        System.out.println(x > 10 && (y / 0 == 10)); //false
        System.out.println(x > 10 || y < 30); //true
        // & 한개 짜리는 단축평가를 하지 않고, 뒤에 조건도 본다
    }
}