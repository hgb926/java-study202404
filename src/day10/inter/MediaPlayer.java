package day10.inter;


import java.util.Arrays;

public class MediaPlayer {

    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        MediaPlayable[] temp = Arrays.copyOf(mediaList, mediaList.length + 1);
        temp[temp.length - 1] = media;
        this.mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList 에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }

    public void pauseAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.pause();
        }
    }
}
