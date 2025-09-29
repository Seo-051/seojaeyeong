package ch15_casting.centralcontrol;

public class Printer implements Power{
    @Override
    public void on() {
        System.out.println("프린터 전원을 켰습니다.");
    }

    @Override
    public void off() {
        System.out.println("프린터 전원을 껐습니다.");
    }

    public void print() {
        System.out.println("프린터가 인쇄를 합니다.");
    }

}
