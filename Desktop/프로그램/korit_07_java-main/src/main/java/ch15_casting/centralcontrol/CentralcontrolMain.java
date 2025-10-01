package ch15_casting.centralcontrol;

public class CentralcontrolMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();

        // 참조자료형의 배열을 생성(비어있는거)
        //Power[] power = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexsNumber가 고정되기 때문에
        // 예시만 보여주고 안쓸거입니다.
        Power[] powers = {new Computer(), new AirConditioner(), new Speaker(), new Mouse(), new LED()};

        // 저희는 그래서 centralControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을
        // 집어 넣었습니다.
        CentralControl centralControl = new CentralControl(
                new Power[10]
        );

        centralControl.addDevice(computer1);       // 여기서 (암시적) 업캐스팅이 이루어짐
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        
        centralControl.addDevice(computer1);
        centralControl.addDevice(computer1);
        centralControl.addDevice(computer1);


        Mouse mouse = new Mouse();
        LED led = new LED();
        Printer printer1 = new Printer();
        System.out.println();
        centralControl.addDevice(mouse);
        centralControl.addDevice(led);
        centralControl.addDevice(printer1);

        centralControl.powerOn();
        centralControl.powerOff();

//        System.out.println("===========continue=======");
//
//        for(int i=0; i<10; i++){
//            System.out.println(i+1);
//        }
//
//
//        for(int i=0; i<10; i++){
//            if((i+1) % 2 != 1){
//                System.out.println(i);
//            }
//        }
//
//        for(int i=0; i<10; i++){
//            if((i+1) % 2==1){
//                continue;             // continue : 해당 반복을 종료하고 다음 반복을 실행
//            }
//            System.out.println(i);
//        }

        /*
            Mouse / LED 클래스를 정의하고 on()/off() 메서드를
            implement하시고
            CentralControlMain으로 와서
            각 객체를 생성한 다음에
            CentralControl 객체에 넣으시오
         */

//        centralControl.showInfo();


        centralControl.performSpecificMethod();

        System.out.println("=====================");


    }
}


//ch16_objects