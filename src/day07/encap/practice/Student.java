package day07.encap.practice;

public class Student {

    private String name; // 이름
    private String studentId; // 학번
    private String department; // 학과

    // 생성자 없음


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("") || name == null) {
            System.out.println("1null 값 또는 빈 문자열은 사용될 수 없습니다. ");
        } else {
            this.name = name;
        }
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId.equals("") || studentId == null) {
            System.out.println("2null 값 또는 빈 문자열은 사용될 수 없습니다. ");
        } else {
            this.studentId = studentId;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department.equals("") || department == null) {
            System.out.println("3null 값 또는 빈 문자열은 사용될 수 없습니다. ");
        } else {
            this.department = department;
        }
    }
}
