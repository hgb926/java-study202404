package day11.song;

import day12.io.FileExample;
import day12.io.obj.SaveSnack;

import java.io.*;
import java.util.*;

// 가수 객체 여러개를 관리 ( 조회, 수정, 삭제, 생성, 탐색, 정렬 ... )
public class ArtistRepository {

    //    private static Artist artist = new Artist();
//     가수들을 담을 자료구조 선언
    // key: 가수이름, value: 노래명
    private static Map<String, Artist> artistMap = new HashMap<>(); // HashMap

    // 세이브 파일 위치 경로
    public static final String SAVE_PATH = FileExample.ROOT_PATH + "/hello/song.sav";

    public static int getArtistMapSize() {
        return artistMap.size();
    }

    /**
     * 주어진 가수명이 artistMap 에 저장되어 있는지 확인하는 메서드
     * @param artistName - 저장이 되었는지 확인할 가수의 이름
     * @return - map 에 저장된 가수라면 true, 아니라면 false
     */
    public boolean isRegistered(String artistName) {
        return artistMap.containsKey(artistName);
    }

    public void addNewArtist(String artistName, String songName) {
        // 주어진 정보를 map 에 저장
        Artist newArtist = new Artist(artistName); // 신규 가수 객체 생성
        // 첫번째 노래 songList 에 추가
        newArtist.addSong(songName);

        artistMap.put(artistName, newArtist);
    }

    public boolean addNewSong(String artistName, String songName) {
        // map 에서 기존 가수 정보를 가져와본다.
        Artist foundArtist = artistMap.get(artistName);
        // 이 가수의 노래리스트에 새 노래를 추가해준다
        return foundArtist.addSong(songName);
    }

    public Set<String> getSongList(String artistName) {
        Artist foundArtist = artistMap.get(artistName);
        return foundArtist.getSongList();
    }


    public void save() {

        try (FileOutputStream fos = new FileOutputStream(SAVE_PATH)) {

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistMap);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void load() {
        File file = new File(SAVE_PATH);
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(SAVE_PATH)) {

                ObjectInputStream ois = new ObjectInputStream(fis);
                this.artistMap = (Map<String, Artist>) ois.readObject();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
// 가수 정보 생성

// 가수 정보 탐색
