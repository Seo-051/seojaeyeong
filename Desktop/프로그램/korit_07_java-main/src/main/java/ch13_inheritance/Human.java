package ch13_inheritance;

/*

    Animal 클래스를 상속 받고
    생성자 및 getter / setter를 사용하여
    Animal 클래스의 move() 메서드를 오버라이딩하여
    "사람이 두 발로 걷습니다." 만 출력하도록 '재정의' 합니다

    Main에서
    human1 객체를 생성(기본 생성자)
    setter를 통해 여러분이름과 여러분나이를 입력,
    getter를 활용하여
    안녕하세요, 제 이름은 여러분이름이고 나이는 몇살ㅇ빈디다.
    내년에는 몇+1살 입니다.
    를 출력하시오

    또한 human 클래스의 고유 메서드인 read("자바의 기초")fmf
    정의하여 콘솔에ㅐ 다음과 같이 출력

    여러분이름이 자바의 기초를 읽는 중입니다.

    실행 예
    사람 객체가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요. 제 이름은 여러분이름이고 나이는 몇 살입니다.
    내년에는 몇+1살 이 됩니다.
    여러분 이름이 자바의 기초를 읽는 중입니다.

 */
public class Human extends Animal{


    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String book) {
        System.out.println(getAnimalName() + "이(가)" + book + "을 읽는 중 입니다.");
    }
}
