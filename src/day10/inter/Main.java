package day10.inter;

public class Main {
    public static void main(String[] args) {

//        SmartPhone galaxy = new Galaxy();
//        SmartPhone iPhone = new Iphone();
//
//        System.out.println(SmartPhone.AGE);

            MediaPlayer player = new MediaPlayer();
            player.addMedia(new VideoPlayer());
            player.addMedia(new AudioPlayer());
            player.addMedia(new ImageDisplay());

            player.playAll();  // 모든 미디어 파일 재생 (각각의 play메서드 호출)
            player.pauseAll();
    }
}
