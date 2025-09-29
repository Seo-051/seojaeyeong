package ch14_abstraction.abstarct_classes;

public class PhoneFatory extends Factory {

    @Override
    public void porduce(String model) {
        System.out.println("[" + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void produce(String model) {

    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
