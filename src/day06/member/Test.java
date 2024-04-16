package day06.member;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Member[] arr = new Member[5]; // 회원정보를 담을 배열, 배열 타입은 클래스 이름

        Member m1 = new Member("hgb926@naver.com", "1234","김철수","남성",30);
        Member m2 = new Member("xyz@ghi.com", "4567", "김영희", "여성", 31);
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = new Member("ad@ggg.com","d","asg","man",123);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

//      Member[] members = {m1, m2, new Member(), new Member()}; // 이렇게도 가능하다.



        MemberRepository mr = new MemberRepository();
        MemberView mv = new MemberView();

        Member newMember = new Member("ddd@fff.com", "2646", "찰떡이", "남성", 15);
        mr.addNewMember(newMember);

        mv.showMembers();
    }
}
