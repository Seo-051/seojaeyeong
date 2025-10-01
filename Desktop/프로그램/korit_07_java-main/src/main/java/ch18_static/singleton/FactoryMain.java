package ch18_static.singleton;

import ch18_static.singleton.product.ProductView;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("제 1 공장");
        Factory factory2 = new Factory("제 2 공장");
        Factory factory3 = new Factory("제 3 공장");
        Factory factory4 = new Factory("제 4 공장");


        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        System.out.println(smartPhone1);
        SmartPhone smartPhone2 = factory1.produceSmartPhone();
        System.out.println(smartPhone2);
        SmartPhone smartPhone3 = factory1.produceSmartPhone();
        System.out.println(smartPhone3);
        SmartPhone smartPhone4 = factory1.produceSmartPhone();
        System.out.println(smartPhone4);

        /*
            이상의 코드를 실행시켰을 때 알 수 있는 점으로는
            어느 공장 객체에서 메서드를 호출했든지 간에 상관없이
            createSerialNumber() 메서드를 호출한 결과가 하나로 이루어진다(싱글톤 때문에)
            다수의 공장 객체에서 각각 produㅊeSmartPhone() 메서드를 호출하더라도
            일원화된 시리얼 넘버 부여가 이루어짐

         */

        // 이상의 코드는 ProductView.java 를 확인했을 때 객체를 생성하는 method입니다.
        // 생성자를 호출하지 않은 이유는 생성자가 private이기 때문이었습니다.
        // 하지만 이상의 코드를 실행 했을 때 1번째 객체가 생성되었습니다. 한 줄 만

        /*
            출력되었습니다.
            그런데 그 전에 static 배웠을 때는 1, 2, 3, 4번 째 객체가 생성되었습니다로
            튀어 나왔었는데 차이가 뭐내면
            저희는 생성자 내에 지역변수로 int counter를 선언하고 초기화했었기 때문

            그래서 static 패키지 내부의 코드와 이번 ProductView 코드를 비교 / 대조해서
            확인할 필요가 있음

            기출 문제 싱글톤도 확인하면 좋음
         */
    }
}
