package day07.player;

import java.util.Arrays;

public class Mage extends Player {


    int mana;

    public Mage(String nickname) {
        super(nickname);
        this.mana = 100;
    }


    public void thunderbolt(Player... target) {
        for (Player player : target) {
        int damage = (int) (Math.floor(Math.random() * 6 ) + 10);
//            System.out.println(player.nickname);
            player.hp -= damage;
            System.out.printf("%s님이 썬더볼트를 맞았습니다. (남은 체력: %d)\n", player.nickname, player.hp);
        }
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }
}
