package ch14_abstraction.Interfaces;
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


public class AirConditionerController {


    private static PowerButton powerButton;         //접근지정자 클래스명 객체명
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton,
                                    ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.modeChangeButton = modeChangeButton;
    }

    public static void onPreesedPowerButton() {powerButton.onPressed();}

    public void onPreesedTemperatureDownButton() {temperatureDownButton.onPressed();}
    public void onDownTemperatureDownButton() {temperatureDownButton.onDown();}

    public void onPreesedTemperatureUpButton() {temperatureUpButton.onPressed();}
    public void onUpTemperatureUpButton() {temperatureUpButton.onUP();}



    public void onPreesedModeChangeButton() {modeChangeButton.onPressed();    }
}
