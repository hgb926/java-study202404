package day08.enum_;

public enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    // 1. 위 설명을 저장할 필드를 생성 (상수에 값을 대입했기 때문에).
    private final String description;

    // 2. 생성자 생성.
    TeamRole(String description) {
        this.description = description;
    }
    // 3. getter 함수 생성. public 으로
    public String getDescription() {
        return description;
    }

}
