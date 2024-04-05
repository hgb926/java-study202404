package day01;

public class DataType {
    public static void main(String[] args) {

        // 1byte = 8bit
        // 1bit = 숫자 0이나 1을 저장할 수 있음

        byte a = 127;           // 1byte
        short b = 32767;        // 2byte
        int c = 2147483647;     // 4byte
        long d = 2147483649237482759L;  // 8byte
        System.out.println(d);

        float e = 3.1492385792824f;         // 4byte
        double f = 3.14293857928474572325;  // 8byte
        double g = 130;
        // 그냥 더블 쓰자. (정수저장 가능)
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        boolean flag1 = true;
        boolean b1 = 10 > 5;

        double random = Math.random();

        int x = 200;

        System.out.println(x + a);
        System.out.println(b * x);
        
        // 문자형 char : 2byte
        char text = '하'; // 홑따옴표, 한글자만 가능
        System.out.println("text = " + text);
        
        // 문자열 : 문자 배열의 준말
        char[] hello = {'안', '녕', '하', '세', '요'};
        System.out.println("hello = " + new String(hello));


    }
}


