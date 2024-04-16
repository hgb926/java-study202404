package day05.player;

public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자: 객체가 만들어질 때, 초기에 어떤값을 가질지를 정하는 곳
    // 생성자는 생성자 내부에서 또다른 생성자를 호출할 수 있다.
    // this. - 필드와 메서드에 접근
    // this() - 생성자에 접근
    // this()로 다른 생성자를 부를때는 생성자당 1번씩만 가능
    // 그리고 가장 첫줄에 써야 함.

    public Player() {
        this("이름없는캐릭터", 1, 50); // 1번 생성자(기본생성자)는
        // 매개변수를 받고 있지는 않지만 안에 있는 함수가
        // 매개변수가 3개이기 때문에 4번 생성자를 부른다.
        // 실질적인 값 세팅은 4번 생성자가 해주는 것.
        System.out.println("1번 생성자"); // 무과금
    }


    Player(String nickName) {
        this(nickName, 1, 50);
        System.out.println("2번 생성자"); // 무과금, 닉네임만 정함 매개변수 1
    }

    public Player(String nickName, int level) {
        this(nickName, level, 999);
        System.out.println("3번 생성자"); // 과금유저, 닉네임 레벨 정함 매개변수 2개
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("4번 생성자"); // 모든 설정 매개변수로 받음 매개변수 3
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    // java는 매개변수를 작성하지 않아도 this를 자동으로 넣어줌. 타입은 class 명
    void info(Player this) {

    }


    // 메서드
    // this는 설계도 내부에서 주어(함수를 실행하는 주체)를 나타낸다.
    void attack(Player target) {

        System.out.println("this = " + this);
        System.out.println("target = " + target);

        // 맞은 player의 체력을 10 감소시킬 것임
        target.hp -= 10;
        // 때린 player의 체력을 3 감소시킴
        this.hp -= 3;

        System.out.printf("%s님이 %s님을 공격했습니다\n", this.nickName, target.nickName);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);
    }
}







