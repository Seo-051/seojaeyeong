package ch14_abstraction.Interfaces;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton()
//        );

        TvRemoteController tvRemoteController = new TvRemoteController(
                new VolumeDownButton(), new VolumeUpButton()
        );

        AirConditionerController airConditionerController = new AirConditionerController(
          new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton(), new ModeChangeButton()
        );


//
//        tvRemoteController.onPressedPowerButton();
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//        System.out.println();
//        tvRemoteController.onPressedChannelUpButton();
//        tvRemoteController.onUpChannelUpButton(); // 풀이 #1

        // 풀이방법 #2 string 으로 (onUP과 onUpChannelUpButton으로 만듬) return 값을 main에서 출력

//        tvRemoteController.onDownVolumeDownButton();
//        tvRemoteController.onPressedVolumeDownButton();
//        tvRemoteController.onUpVolumeUpButton();
//        tvRemoteController.onPressedVolumeUpButton();

            AirConditionerController.onPreesedPowerButton();
            airConditionerController.onPreesedTemperatureDownButton();
            airConditionerController.onPreesedTemperatureUpButton();
            airConditionerController.onDownTemperatureDownButton();
            airConditionerController.onUpTemperatureUpButton();
            airConditionerController.onPreesedModeChangeButton();
            airConditionerController.onPreesedModeChangeButton();


    }
}



/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteContorller의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main에서
    음량을 한칸 내립니다
    음량을 계속 내립니다.
    음량을 한칸 올립니다.
    음량을 계속 올립니다. # 1
    음량을 계속 올립니다. # 2

 */

/*
    PowerButtom 포함
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한 번 누를 때 마다 모드가 변환되어야함
     냉방 <-> 난방
        : Press버튼을 활용하여 한번 누르면 그 다음 모드로 이동
        (PowerButton의 로직 활용)

    AllArgsConstructor을 정의하고,

    실행 예
    에어컨 리모컨 객체가 생성되었습니다.
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다.
    온도를 계속 올립니다ㅓ.
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */


