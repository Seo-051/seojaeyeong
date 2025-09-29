package ch14_abstraction.Interfaces;

/*
    클래스는 단일 상속만 가능합니다 . 그 키워드는 -> extends
    인터페이스는 다중 상속이 가능합니다. 그 키워드는 -> implements
 */
public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {}; //일반 메서드 지만 메서드 본문에 아무것고 안써놇음

    @Override
    public abstract void onPressed();

    @Override
    public String onUP(){
        return "올립니다.";
    };
}
/*
    ChannelDownButton // ChannelUpButton 생성하고 Button 상속받음
    상속 받고 뻘건줄 뜨는데, 일단 자동으로 오류처리하심
 */
