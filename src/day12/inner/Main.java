package day12.inner;

public class Main {
    
    // 내부 클래스 (중첩 클래스)
    // 뺄셈 계산기가 필요한데 아마도 이 계산기 설계도는
    // Main 클래스 안에서만 사용하고 외부에서는 안쓸 것 같다.
    // 내부 클래스에는 static, private 을 붙힐 수 있다.
    private static class SubCalculator implements Calculator{

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }
    
    public static void main(String[] args) {

        Calculator cal;
        cal = new AddCalculator();
        Calculator cal2 = new SubCalculator();

        int r1 = cal.operate(10, 20);
        int r2 = cal2.operate(50, 27);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // 익명 클래스: 이름이 없는 클래스를 빠르게 선언하는 법
        // 클래스를 통해 객체를 생성하긴 할건데...
        // 재활용은 안할 거 같다.
        // class, 이름 생략하고 바로 대괄호
        cal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        
        int r3 = cal.operate(10, 4);
        System.out.println("r3 = " + r3);

        // 람다
        // 사용 전제조건
        // 반드시 인터페이스 안에 추상메서드가 1개여야 한다.
        cal2 = (n1, n2) -> n1 / n2;


        int r4 = cal.operate(10, 3);
        System.out.println("r4 = " + r4);

        System.out.println("================================");

        Restaurant fr = new FrenchRestaurant();

        Restaurant japaneseRestaurant = () -> System.out.println("일식 요리를 합니다.");

        Restaurant italian = () -> System.out.println("이탈리아 요리를 합니다");



    }
}
