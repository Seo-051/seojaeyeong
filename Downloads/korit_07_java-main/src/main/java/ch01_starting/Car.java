package ch01_starting;

public class Car extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("this is a car");
    }
    public void honk(){
        System.out.println("Car horn : Beep beep");
    }
}
