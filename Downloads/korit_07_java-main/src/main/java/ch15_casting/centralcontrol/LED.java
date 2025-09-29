package ch15_casting.centralcontrol;

public class LED implements Power{
    public void on(){
        System.out.println("LED 의 전원을 켭니다");
    }
    public void off(){
        System.out.println("LED 의 전원을 끕니다");
    }

    public void changeColor(){
        System.out.println("조명의 색깔을 바꿉니다");
    }
}
