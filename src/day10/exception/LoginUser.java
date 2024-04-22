package day10.exception;

public class LoginUser {

    private String account; // 가입시 계정명
    private String password; // 가입시 패스워드

    public LoginUser(String password, String account) {
        this.password = password;
        this.account = account;
    }

    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }


    // 로그인 검증
    public LoginStatus loginValidate(String inputAccount, String inputPassword)
    throws Exception
    {
        // 아이디가 일치하는가?
        if (!inputAccount.equals(account)) {
//            return LoginStatus.ID_FAIL;
            throw new InvalidLoginInputException("계정이 일치하지 않습니다");
        }
        // 비번이 일치하는가?
        if (!inputPassword.equals(password)) {
//            return LoginStatus.PW_FAIL;
            throw new InvalidLoginInputException("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인이 성공했습니다.");
        return LoginStatus.SUCCESS;
    }

}
