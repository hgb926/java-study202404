package day12.io.textstream;

// 텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림으로
// 2바이트 이상 데이터를 처리 가능

import day12.io.FileExample;
import util.SimpleInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day06.member.Member;

// 바이트 기반 스트림: Outputstream, InputStream
// 텍스트 기반 스트림: Writer, Reader
public class FileReaderExample {
    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/hello/member.txt";

        try (FileReader fr = new FileReader(targetPath)) {

            // 보조 스트림 활용
            // 텍스트를 라인 단위로 읽어들이는 보조스트림
            BufferedReader br = new BufferedReader(fr);

            // 회원정보를 저장할 리스트 생성
            List<Member> memberList = new ArrayList<>();


            Member member = null;
            while (true) {
                String s = br.readLine();

                if (s == null) break;

                String[] split = s.split(",");
                // 읽어들인 회원정보로 회원 객체 생성
                member = new Member(
                        split[0],
                        split[2],
                        split[1],
                        split[3],
                        Integer.parseInt(split[4])
                );
            memberList.add(member);
            }
            System.out.println(memberList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
