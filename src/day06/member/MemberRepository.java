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

    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {

        // 배열에 데이터 추가 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }


    /**
     * 이메일 중복을 확인하는 기능
     * @param targetEmail - 검사할 사용자의 입력 메일값
     * @return - 이메일이 존재한다면 true,
     *           존재하지 않는 사용가능한 이메일이면 false
     * @author - 닭가슴
     * @since 2024.04.16
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }
}


