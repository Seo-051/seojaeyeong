package ch09_classes;

import java.util.Scanner;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은석
        저희는 call1() - call4()로, 매개변수 유무  / return 유무로 구분

        형식 :
            (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2){
                메서드 내부에서 순차적으로 실행될 코드들 - > 이 묶음을 비지니스 로직이라고 한다
            }
        정의 예시 :
            public void writeSchedule(String date, String content){
                System.out.println(date + "일의 스케줄은 다음과 같습니다,);
                System.out.println(content);
            }

        호출 예시 :
            객체명.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
 */
public class ReviewMethod {
    // 메서드 정의 영역

    public void writeSchedule(String date, String content){
        System.out.println(date + "일의 스캐줄은 다음과 같다");
        System.out.println(content);
    }
    public void writeSchedule(int date, String content){
        System.out.println(date + "일의 스캐줄은 다음과 같다");
        System.out.println(content);
    }
    //writeSchedule을 overloading하여 매개변수1의 자료형을 int로 바꾸고
    // writeScedule(20250805, "클래스/getter/setter 예습"); 을 호출
    //2. call2() 유형으로 작성할것  -> main 에 어덯게 쓸지, 고민
    // dividedBySeven 메서드를 정의
    // 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드를
    // 작성
    // 실행 예
    // 임의의 숫자를 입력 하세요 >> 7
    // 77은 7의 배수 입니다.
    // 1000은 7의 배수가 아닙니다.

    // call2() 유형
//    void divideBySeven(int num){
//        String answer = "";
//        System.out.println("숫자를 입력하시오>>>> ");
//        if(num%7==0) answer = "7의 배수입니다."; // sout 대신
//        else answer = "7의 배수가 아닙니다.";
//    }

// call1() 유형
//    void divideBySeven(){
//        String answer = "";
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();              //이거 method의 return값이 num이라는 변수에 저장됨
//
//        System.out.println("숫자를 입력하시오>>>> ");
//        if(num%7==0) answer = "7의 배수입니다."; // sout 대신
//        else answer = "7의 배수가 아닙니다.";

        //dividedBySeven(num);        // #방법1 - method 내부에서 다른 method를 호출하는 것이다.
//    }



    public static void main(String[] args) {
        //메서드 호출 영역
//        ReviewMethod reviewMethod = new ReviewMethod();
//        reviewMethod.writeSchedule("202504", "메서드/오버로딩/클래스 복습");
//        reviewMethod.writeSchedule(202504, "클래스/getter/setter 복습");

        //call2() 유형
        // 현재 didvidedBYSeven() call2()유형은 7의 배수인지 아닌지 체크
        // 그리고 argument가 필수적으로 요구
        // main에서 scanner를 import해야함
//        Scanner scanner = new Scanner(System.in);
//        ReviewMethod reviewMethod1 = new ReviewMethod();
//        int num=0;
//        num = scanner.nextInt();
//        System.out.println(num);

        // call1() 유형 //
        //reviewMethod1.divideBySeven();    // #방법2



    }
}
