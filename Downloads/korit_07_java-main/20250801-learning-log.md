# Getter / Setter
## Getter / Setter 필요성
1. 문제 상황
     - 클래스를 하나 만든다고 가정함. 예를 들어. person 클래스를 생성하면서
       이름, 나이 등의 정보를 저장하기 위해
'' java
public calss Person{
    String name;
    int age;
}

public class PersonMain{
    public static void main(String[] args){
        //person 객체 생성
        Person person1 = new Person(); // 기본 생성자는 default 생성되죠
        person1.name = "김 일";   // 객체에 값을 대입하는 방법
        // 객체명.속성명 = 데이터;
        person1.age = -10;

        System.out.println(person1.name);   //결과값 : 김일
        System.out.println(person1.age);    // 결과값 : -10
    }
}

이상의 코드를 확인했을때, 나이에 정상적이지 않은 값이 대입되었습니다. 이처럼
외부 (다른 클래스) 에서 직접 속성값을 대입하게 될 때, 이상한 값이 들어가더라도
통제할 수 있는 방법이 없다는 문제가 있음.

-> 이상을 해결하기 위한 방법이 getter / setter 개념

## Getter / Setter 란
1. Setter
    - 데이터를 '설정'하는 역할의 'method' 클래스 외부에서 필드를 직접 수정하지
      못하도록 막고, 특정 메서드를 경유하여 값을 전달 받아 '초기화 및 수정'을
        하도록 함
2. Getter
    - 데이터를 '조회'하는 역할의 'method' 클래스 외부에서 필드를 직접 읽지
      못하도록 막고, 특정 메서드를 경유하여 안전하게 값을 '반환하도록 함'
3. 장점
    1. 데이터 보호
        - 변수가 privte 접근 제어자(추후(오늘) 수업 예정)을 사용하여 외부에서
          직접 접근하지 못하게 함으로써 데이터를 보호할 수 있음.
    2.데이터의 유효성 검증(아까 -10을 걸러내는 부분을 의미합니다)
        - Setter 메서드에서 입력된 데이터가 적합한지 확인하고, 잘못된 값을 거절할 수 있음
    3. 캡슐화
        - 데이터를 숨기고 필요한 경우에만 제한적으로 접근할 수 있도록 하여 클래스 내부 구현을
            외부로 노출하지 않음.
    4. 유연성 증가
        - 나중에 요구사항이 바뀌어 데이터를 설정하거나 조회하는 방법이 변경되더라도
        - 클래스(main) 말고 내부의 메서드만 수정하면 되므로 유지보수가 쉬워짐
## Setter / Getter 의 구조
### Setter
'''java
접근지정자 void set_속성명1(자료형 변수명){
    this.속성명1 = 변수명;
}

public void setName(String name){
    this.name = name;
}
'''
### Getter
''' java
접근지정자 자료형_get속성명1(){
    return 속성명1;
}

public int getAge(){
    return age;
}

### Setter를 기준으로 데이터 유효성 검증 예시
''java
public class Person{
    //필드선언
    int age;
    public void setAge(int birth){
        if(birth < 0 || birth > 200){
            System.out.println("불가능한 나이 입력입니다.");
            return;     // method에서 return; 은 method 즉시 종료 키워드 입ㄴ디ㅏ.
                        // 즉 이 이하로는 아예 실행되지 않습니다.
    } else{
        System.out.println("변경전 나이 : " + age); // brith 대입 전이니까
        this.age = birth;
        System.out.println("변경 후 나이 : " + age); // 대입 후니까 동일한 코드라도 다른 결과 값
    }
}