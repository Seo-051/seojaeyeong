package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2(String name) {
        this.name = name;
    }
    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }
    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }
    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    // 좌상단 햄버거(메뉴바) - > 코드(code) -> 생성(Generate)
    // alt + ins



    //자동완성으로 알아서 생성자 만드시고,
    //거기에 sout 문구 전부 다 집어넣으시오
}
