package day07.player;

public class Hunter extends Player {


    int concentration;

    public Hunter(String nickname) {
        super(nickname);
        this.concentration = 100;
    }


    public void multipleArrow() {

    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }
}
