package day10.exception;

public class Main {
    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();
        
//        int n = te.inputNumber();
//        System.out.println("n = " + n);

//        try {
//            int n = te.convert("550!@");
//            System.out.println("n = " + n * 20);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }

        LoginUser user = new LoginUser("1234", "1234");

        try {
            user.loginValidate("1234","1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
