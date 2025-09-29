package ch14_abstraction.Interfaces;

public class TemperatureUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 올립니다.");
    }

    @Override
    public String onUP() {
        return super.onUP();
    }
}
