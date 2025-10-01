package ch18_static.singleton;

import lombok.AllArgsConstructor;

/*
    FactoryMain
    Samsung
    SmartPhone
 */
@AllArgsConstructor
public class Factory {

    private String factoryName;


    public SmartPhone produceSmartPhone(){
        System.out.println(factoryName +"에서 스마트폰 생상");
        // 접근 지정자 안썼으니까 default 입니다. 그러고 {} 영역 내에 있으니까 지역변수
        String model = "갤럭시S26";
        String serial;


        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 -> 싱글톤 썼으니까 어짜피 동일한 객체가 계속 대입 됨
        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴 타입이 SmartPhone입니다. 그러니까 SmartPhone 객체가 튀어나와야하는데,
        // 스마트폰 객체 생산할때 우리는 뭐를 해야 하냐면

        // 지역변수
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}
