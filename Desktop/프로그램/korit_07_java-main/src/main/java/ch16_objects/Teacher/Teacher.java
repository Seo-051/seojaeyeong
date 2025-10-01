package ch16_objects.Teacher;

import java.util.Objects;

public class Teacher {
    private String name;
    private String school;

    // AllargsConstructor

    // getter / setter 정의

    // toString()을 정의
    // 누구누구 선생님의 근무지느 무슨무슨 학교 입니다.
    // 라고 출력되게씀 override하세여ㅛ

    // teacherMain에서
    // teacher1에 안근수, 코리아이이티로 객체 생성하세여
    // teacher2에 안근수, 코리아이이티로 객체 생성하세여


    public Teacher() {
    }

    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + school + " 입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(school, teacher.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }
}

