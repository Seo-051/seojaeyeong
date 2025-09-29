package ch09_classes;


public class Constructor {

    int num;
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int number){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자");
        this.num = number; // this : '나','이것으로 해석' 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체됨.
    }

    // String title을 매개변수로 하는 생성자를 정의하고
    // RequiredArgsContructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을 출력할 수 있도록
    // 작성한뒤
    // ConstructorMain으로 거서, constructor3이라는 객체명을 지니고, title에 "여러분이름"으로
    // 지어 객체를 생성한 후,
    // System.out.println(constructor3.name); 을 입력하여 콘솔에 여러분 이름 출력

    Constructor(String title){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자");
        this.name = title;
    }




}

// ch09_classes 우클릭 - > 새로 만들기 - > 패키지 - > students
// students 우클릭 - > Student / Stu