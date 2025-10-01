package ch07_loops;
/*
    중첩 while문(Nested - while)
    while(조건식1){
        반복실행문 1-a
        while(조건식2){
            반복실행문2
        }
        반복실행문 1-b
    }
 */
public class Loop03 {
    public static void main(String[] args) {
//        int day = 1;
//        // 1일차 1교시 입니다. ~ 1일차 3교시 입니다.
//        // 2일차 1교시 입니다. ..
//        // 5일차 1교시 입니다. ~ 5일차 3교시 입니다.
//
//        while(day<6){
//            int lesson = 1; //반복문 1-a에 해당 변수 선언 및 초기화
//            while(lesson < 4){
//                System.out.print(day + " 일 차 " + lesson + " 교시 입니다. ");//반복실행문
//                lesson++;
//            }
//            System.out.println(" ");
//            day++; // 반복 실행문 1-b
//        }

        // scope(범위)라는 것으로, 전역(전체영역) / 지역으로 나뉜다는 점이 중요하다. -

        /*
            이상의 코드를 활용하여
            2 x 1 = 2
            2 x 2 = 2
            ...
            9 x 9 = 81
            을 출력
         */


        int dan = 2;
        int gu;

        while (dan < 10) {
            gu = 1;

            while (gu < 10) {
                System.out.println(dan + " x " + gu + " = " + (dan * gu));
                gu++;
            }

            System.out.println();
            dan++;
        }



    }
}
