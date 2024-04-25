package day12.stream.quiz1;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> collect1 = transactions
                .stream()
                .filter(n -> n.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>

        List<String> collect = transactions
                .stream()
                .map(d -> d.getTrader().getCity())
                .distinct() // 중복 제거
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);


        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>

        List<Trader> collect2 = transactions
                .stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .sorted(comparing(t -> t.getTrader().getName()))
                .map(t -> t.getTrader())
                .collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>

        List<String> collect3 = transactions
                .stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("collect3 = " + collect3);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?

        boolean flag = transactions
                .stream()
                .anyMatch(t -> t.getTrader().getCity() == "Milan");
        System.out.println("flag = " + flag);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        int sum = transactions
                .stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .mapToInt(t -> t.getValue())
                .sum();
        System.out.println("sum = " + sum);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?

        // 내림차 정렬 -> 0번 인덱스 반환
//        List<Transaction> collect4 = transactions
//                .stream()
//                .sorted(Comparator.comparing(i -> i.getValue()))
//                .collect(Collectors.toList());
//        int value = collect4.get(collect4.size() - 1).getValue();
//        System.out.println("value = " + value);
        int asInt = transactions
                .stream()
                .mapToInt(t -> t.getValue())
                .max()
                .getAsInt();
        System.out.println("asInt = " + asInt);


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

        Transaction min = transactions
                .stream()
                .min(comparing(Transaction::getValue))
                        .orElse(null); // 만약 결과가 null 일 경우 어케 할거냐
        System.out.println("min = " + min);

        /*
        자바의 단점: 널체크 문법이 없음
        */


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.

        transactions
                .stream()
                .filter(t -> t.getValue() >= 500)
                .forEach(System.out::println);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0

        double asDouble = transactions
                .stream()
                .mapToInt(t -> t.getValue())
                .skip(1)
                .average()
                .getAsDouble();
        System.out.println("asDouble = " + asDouble);


        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*

               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions
                .stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(t -> t.getYear()));
                // 자동으로 key가 Year가 되고, 그 값을 다 그루핑 해준다.

        cambridgeTrsMap.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });

        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700

        List<Transaction> collect6 = transactions
                .stream()
                .sorted(comparing(t -> t.getValue()))
                .collect(Collectors.toList());
        int value2 = collect6.get(collect6.size()-1).getValue() - collect6.get(0).getValue();
        System.out.println("value2 = " + value2);

    }

}

