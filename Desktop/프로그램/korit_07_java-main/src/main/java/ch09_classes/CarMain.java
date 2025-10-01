package ch09_classes;

public class CarMain {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.speed = 160;
        myCar.color = "빨강";
        myCar.drive();
        myCar.displayinfo();


        Car yourCar = new Car();
        yourCar.speed = 180;
        yourCar.color = "노랑";
        yourCar.brake();
        yourCar.displayinfo();

        // 객체 생성 방법
        // 클래스명 객체명

// Constructor 클래스 생성

    }
}
