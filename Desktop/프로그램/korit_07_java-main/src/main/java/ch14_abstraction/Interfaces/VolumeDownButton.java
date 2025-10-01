package ch14_abstraction.Interfaces;

public class VolumeDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음향을 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("음향을 계속 내립니다.");
    }
}
