package ch19_generic.wildcard;

public class Human extends Animal{
    public void read(){
        System.out.println("사람이 책을 읽습니다.");
    }

    @Override
    public void move() {
        System.out.println("사람이 두발로 뜁니다.");
    }
}
