package day04;


// 실행용 클래스: 객체를 생성해서 객체의 기능을 실행시키는 곳.
// -> 실행을 위한 main이 필요.
public class DancerMain {

    public static void main(String[] args) {

        // 설계도(클래스)를 통해 객체를 찍어냄(생성)
        // 생성 명령어는 new
        // 객체의 정보를 갖고 있어야 할 변수가 필요. (kim)
        // 근데 변수의 type을 붙혀줘야 하지만 마땅한 타입이 없음 그래서
        // type은 클래스 이름! 그래서 java의 타입이 무한대라고 함
        Dancer kim = new Dancer();

        // 객체의 속성 부여
        kim.dancerName = "김뽀또";
        kim.crewName = "치즈치즈";
        kim.genre = "스트릿";
        kim.danceLevel = 1;

        kim.introduce();
        kim.dance();

        // 2번째 dancer가 필요하면
        Dancer park = new Dancer();

        park.dancerName = "박격포";
        park.crewName = "전쟁이야";
        park.genre = "코레오";
        park.danceLevel = 2;

        park.introduce();
        park.dance();

        // 생성자는 객체를 생성할때 1번 호출 할 수 있다. (아무때나 되지않음)

        Dancer hong = new Dancer();
        hong.dance();

        Dancer choi = new Dancer("최폭풍");
        choi.dance();
        choi.introduce();

        Dancer nanana = new Dancer("냐냐냥", "시골크루");
        nanana.dance();
        nanana.introduce();

        Dancer rock = new Dancer("메롱롱", "폭식맨", "락킹");
        rock.introduce();
    }
}
