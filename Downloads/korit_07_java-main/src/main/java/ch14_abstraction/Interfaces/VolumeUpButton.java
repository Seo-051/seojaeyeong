package ch14_abstraction.Interfaces;

public class VolumeUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음향을 한칸 올립니다.");
    }

        @Override
        public String onUP() {
            return super.onUP();
        }
}
