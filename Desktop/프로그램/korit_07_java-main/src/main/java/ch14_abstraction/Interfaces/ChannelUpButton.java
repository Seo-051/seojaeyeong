package ch14_abstraction.Interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("체널을 한 칸 올립니다.");
    }

    @Override
    public String onUP() {
        return "채널을 계속 " + super.onUP();
    }
}

// 현재까지의 작성 방안에서는 채널 올려주는 버튼 / 내려주는 버튼 / 전원 버튼이 각각 있음.
// 각각 따로있는 버튼들을 하나로 모아주는 클래스를  작성할 예정입니다.
// 현재 여기서 문제가 되는 것이 있죠


// TvRemoteContiller라는 일반 클래스 생성