package ch11_access_modifier;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
       setter / getter는 default로 access modifier가 public이므로
       클래스 외부에서 사용 가능합니다.

       저희는 현재 객체 생성까지 완료한 상황
       setter / getter를 활용하여
       처음 이름을 "김일"로 입력하고,
       그 이름을 콘솔에 출력
       다시 이름을 "이일"로 수정하고,
       바뀐 이름을 콘솔에 출력
 */
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "김일";    //불가능
//        System.out.println(person1.name); //불가능 why? private
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());
    }
}
/*
    ch11_access_modifier   bank
    Bank
 */