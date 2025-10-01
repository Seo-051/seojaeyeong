package ch14_abstraction.Interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface이기 때문에 변수 앞에 접근 지정자를 명시하지 않고,
        final 키워드도 적지 않지만

        public final이 생략되었습니다. 그래서 String 앞에 final을
        명시 하더라도 Intellij 상에서 불 필요하다는 안내가 나옴
        복습하실 때 String 앞에 한번 final 붙여 보시기 바랍니다.

        안되는 예시들 나열
     */
    /*
    String age;         // field(인스턴스 변수) 선언 불가능
    public Press(){};   // 생성자 불가능
    void popOut(){
        System.out.println("추상 메서드 x / 얘는 일반 매서드");
    }
    */


    // 되는 예시
    void onPressed();

    // 이미 생성된 Up interface에 onUp()이라는 추상 메서드를 정의하시오
    // Down interface를 생성하고 onDown() 이라는 추상 메서드를 정의하시오
}
