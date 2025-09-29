package ch16_objects;

public class ObjectTest {
    //필드선언
    private String name;
    private String address;

    // 기본 생성자 / AllargsConstructor을 정의하시오

    // getter / setter 정의

    // showInfo()를 call1() 형식으로 정의

    /*
        실행 예
        이름 : 안근수ㅡ
        주소 : 부산광역시 연제구

        Main으로 가서 objectTest1에
        이름 안근수 주소 부산광역시 연제구를 set하고
        showInfo()를 호출
     */

    public ObjectTest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo(){
        System.out.println(" 이름 " + name + " \n주소 " + address);
    }

    @Override
    public String toString() {
        return " 이름 " + name + " \n주소 " + address;
    }


}
