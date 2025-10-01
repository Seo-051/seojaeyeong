package ch13_inheritance;

public class Animal {

    private  String animalName;
    private int animalAge;


    // 생성자 기본 생성자 하나 매개변수 생성자 하나짜리 두개
    // AllArgs 하나 해서 네개 생성

    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
    // Getter / Setter/ 생성

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }


    public void move(){
        System.out.println("움직입니다.");
    }

//    public void read(){
//        System.out.println("자바의 기초");
//    }
}
