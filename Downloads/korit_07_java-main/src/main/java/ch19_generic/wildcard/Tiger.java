package ch19_generic.wildcard;

public class Tiger extends Animal{


    // 고유 메서드
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }

    @Override
    public void move() {

    }
}
/*
    Human 가서 Animal 상속 받아서
    사람이 두 발로 뜁니다. 구현 하시고

    read*() 메서드를 통해
    사람이 책을 읽습니다.
    를 작성하시;오

    Car 클래스는 상속 받지 않고
    move() 메서드를 통해
    차가 움직입니다. 를 구현하시어

    public void brake()를 통해
    차가 멈춥니다. 를 구현하시오
 */