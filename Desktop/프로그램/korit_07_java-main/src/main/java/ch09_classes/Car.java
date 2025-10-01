package ch09_classes;

public class Car {

    String color;
    int speed;

    void drive(){
        System.out.println(color + "자동차가 주행중");
    }
    void brake(){
        System.out.println(color + "자동차가 멈췄습니다");
    }
    void displayinfo(){
        System.out.println("이 차의 색은" + color + "색이고");
        System.out.println("최고 속도는" + speed + "km/h 입니다");
    }



    /*
    Car의 인스턴스인 myCar라는 객체를 생성하시오
    color에 빨강 대입 speed에 160대입
    yourCar 객체생성
    color에 노랑 대입, speed에 180eodla
    myCar는 drive() 메서드 호출
    yourCar는 brake() 메서드 호출
    myCar, yourCar에 각각 displayInfo() 메서드 호출 하시오
     */
}
