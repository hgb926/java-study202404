package day09.poly.car;

public class Main {
    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

        Car  mustang1 = new Mustang();
        Car  mustang2 = new Mustang();
        Car  mustang3 = new Mustang();
        Car  mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있음!
        Car[] cArr = {sonata1, tucson1, mustang1};
        for (Car car : cArr) {
            car.accelerate();
        }

        // 배열은 동종모음이라 한가지의 타입만 넣을 수 있다.
//        String[] sArr = {"abc", "def", 100, false, new Tucson()};
        // 하지만 다형성을 사용해서 최상위에 있는 Object 배열을 만들면
        Object[] sArr = {"abc", "def", 100, false, new Tucson()};
        // 이런게 가능하다

        System.out.println("=============================");

        Driver driver = new Driver();
        driver.drive(new Tucson());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("=======================");

        CarShop shop = new CarShop();


        // 객체타입에서 다운캐스팅의 전제조건: 반드시
        // 상속관계가 있어야 하며, 자식객체가 부모타입으로 업캐스팅
        // 된 것만 내릴 수 있음
        // 즉, 부모객체를 자식타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        System.out.println("=======================");

//        Sonata ccc = (Sonata) new Car();
//        Sonata mmm = (Sonata) new Mustang();


        // upCasting이 한번 이루어 졌다면, 밑에 방법을 통해
        // downCasting을 할 수 있다.
        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

    }
}
