package day07.player;

public class Hunter extends Player {


    int concentration;

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentration = 100;
    }


    public void multipleArrow() {

    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }
}
