package day11.api.time;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        // 자바8 이전
        Date date = new Date();
        System.out.println("date = " + date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.MARCH);

        // ↑ 자바에서 권장하지 않는다.

        // 자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        // nowDate = 2024-04-23

        System.out.println(nowDate.getYear());
        // 2024

        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        // now = 10:52:45.343594

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);
        // nowDateTime = 2024-04-23T10:52:45.343736

        // 특정 날짜 정보 생성하기
        LocalDate targetDate = LocalDate.of(2022, 4, 15);
        System.out.println("targetDate = " + targetDate);
        // targetDate = 2022-04-15

        // 날짜 연산
        // 도서 대여 시스템에서 빌린 날짜로 부터 3일 뒤가 반납일
        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(15);
        System.out.println("returnDate = " + returnDate);
        // returnDate = 2024-05-08

        LocalDate target = returnDate
                .plusYears(2)
                .plusMonths(3)
                .plusDays(5);
        System.out.println("target = " + target);
        // target = 2026-08-13

        // 사이 날짜 구하기
        LocalDate hireDate = LocalDate.of(2018, 3, 6);
        LocalDate retireDate = LocalDate.of(2022, 12, 27);
        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);
        // between = 1757

        // 날짜 포맷 바꾸기
        System.out.println("nowDateTime = " + nowDateTime);
        // nowDateTime = 2024-04-23T10:58:29.723361
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = " + dateString);
        // dateString = 2024년 04월 23일 오전 11시 02분 46초
    }
}
