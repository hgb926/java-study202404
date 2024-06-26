package day05;

import java.util.Arrays;

// 스트링 배열을 관리하는 객체의 설계도
public class StringList {

    // 스트링 배열을 필드로 등록
    public String[] sArr;

    // 생성자를 통해 스트링 배열을 초기화함
   public StringList() {
        sArr = new String[0];
    }

    // 배열 내부를 출력하는 메서드
    public String toString() {
        return Arrays.toString(sArr);
    }

    // 배열 내부 요소의 수를 알려주는 메서드
   public int size() {
        return sArr.length;
    }

    // 배열에 맨 끝에 데이터를 추가하는 메서드
    public void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp;
    }

    // 배열 맨 끝데이터 제거
    public void pop() {
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    public String remove(String target) {
        return remove(indexOf(target));
    }



    // 중간 삽입 (insert)
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length) return;
        if (index == sArr.length) {
            push(newData);
            return;
        }

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }


    public void set(int index, String newData) {
        if (index < 0 || index > sArr.length - 1) return;
        sArr[index] = newData;
    }

    void clear() {
        String[] temp = new String[0];
        sArr = temp;
    }

     boolean isEmpty() {
        return sArr.length > 0 ? false : true;
    }

    StringList(String... newData) {  // ...을 활용해서 인자들을 배열로 받는다
        sArr = new String[newData.length]; // 배열의 크기는 얼마만큼? 인자의 length 만큼
        for (int i = 0; i < newData.length; i++) { // sArr에 옮겨준다
            sArr[i] = newData[i];
        }
    }


}
