package day06.member;

// 역할: 회원 배열을 관리하는 역할 - 회원 데이터 저장소 (오로지 이것만)
public class MemberRepository {

    // 필드
    static Member[] members; // 회원을 관리할 배열 생성

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@def.com","1234","콩순이","여성",50);
        members[1] = new Member("qhe@hyk.com","2352","팥돌이","남성",30);
        members[2] = new Member("qyy@zbf.com","4574","팥죽이","여성",26);
    }

    // 메서드

    // 회원정보 생성
    void addNewMember(Member newMember) {
        // 배열에 데이터 추가 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }
}

