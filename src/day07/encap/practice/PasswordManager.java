package day07.encap.practice;

public class PasswordManager {
    private String password;

    // 생성자
    PasswordManager(String password) {
        this.password = password;
    }

    /**
     * 이 메서드는 비밀번호를 변경해주는 공개된 메서드로써
     * 사용자가 새롭게 사용할 패스워드를 전달합니다.
     * @param password - 기존에 사용하던 비밀번호
     * @param newPassword - 새롭게 변경할 비밀번호
     * @return - 변경에 성공하면 true, 실패하면 false
     */
    public boolean changePassword(String password, String newPassword) {
        if (!password.equals(this.password)) {
            return false;
        } else {
            this.password = newPassword;
            return true;
        }
    }

}
