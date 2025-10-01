package ch14_abstraction.Interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;                // 접근지정자 클래스명 객체명 -> 여태까지의 작성방법과 다름
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

//    public TvRemoteController(PowerButton powerButton,
//                              ChannelDownButton channelDownButton,
//                              ChannelUpButton channelUpButton) {
//        this.powerButton = powerButton;
//        this.channelDownButton = channelDownButton;
//        this.channelUpButton = channelUpButton;
//    }


    public TvRemoteController(VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }




    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton(){
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }

    //onPressedChannelUpButton() 메서드 / onUpChannelUpButton() 메서드를 구현하고
    //Main에서 실행
    // 실행 예
    // 채널을 한 칸 올립니다.
    // 채널을 계속 올립니다.

    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton(){
        System.out.println(channelUpButton.onUP());
    }

    //============

    public void onPressedVolumeDownButton(){
         volumeDownButton.onPressed();
    }
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
    public void onUpVolumeUpButton(){
        System.out.println("음향을 계속 " + volumeUpButton.onUP());
    }


}
