package day11.song;
import java.util.HashSet;
import java.util.Set;

public class Artist {

    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    // 생성자
   public Artist(String artistName) {
       this.artistName = artistName;
       this.songList = new HashSet<>(); // 비어있는 set
   }

    // getter, setter
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Set<String> getSongList() {
        return this.songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    public boolean addSong(String songName) {
        return this.songList.add(songName);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
