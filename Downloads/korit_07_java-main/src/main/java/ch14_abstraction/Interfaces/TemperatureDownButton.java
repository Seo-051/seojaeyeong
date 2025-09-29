package ch14_abstraction.Interfaces;

public class TemperatureDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("온도를 계속 내립니다.");
    }
}
//
//public class Animal{
//    public void sound(){
//        System.out.println("동물이 소리냄");
//    }
//}
//public class Dog extends Animal{
//    public void bark(){
//        System.out.println("멍멍");
//    }
//
//}
//
//
