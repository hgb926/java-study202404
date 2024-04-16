package day06.member;

// 역할: 회원 데이터 관리를 위해 입력 출력 담당함
public class MemberView {

    // 객체의 협력
    MemberRepository mr;
    // members 배열을 받아와야 출력을 할 수 있다
    // members 배열은 memberRepository 가 가지고 있으므로 받아온다.
    MemberView() {
        this.mr = new MemberRepository();
    }

    void showMembers() {
        System.out.printf("========== 현재 회원 목록 (총 %d명) =========\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }
}
