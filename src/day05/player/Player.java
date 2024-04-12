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
        this("이름없는캐릭터", 1, 50);
        System.out.println("1번 생성자 호출!");
    }

    Player(String nickName) {
        this(nickName, 1, 50);
        System.out.println("2번 생성자 호출!");
//        this.nickName = nickName; // this.nickName은 필드의 nickName을 일컫고 nickName은 지역변수를 일컫는다
//        this.level = 1;
//        this.hp = 50;
    }

    public Player(String nickName, int level) {
        this(nickName, level, 999);
        System.out.println("3번 생성자 호출!");
//        this.nickName = nickName;
//        this.level = level;
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("4번 생성자 호출!");
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







