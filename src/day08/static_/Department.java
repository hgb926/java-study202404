package day08.static_;

public class Department {

    private String departmentName; // 학과 이름
    private int studentCount; // 학과별 학생 수
    private static int totalStudents; // 전체 학생 수

//    static {
//        totalStudents = 0;
//    }

    Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount; // 객체가 생성될 때,
        // 파라미터로 받은 학생수를 토탈 학생수에 추가를 해야 한다.
    }
    void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}