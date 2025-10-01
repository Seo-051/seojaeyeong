package ch12_arrays;

import java.util.Scanner;
/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >> 김일
    2 번 학생의 이름을 등록하세요 >> 김이
    3 번 학생의 이름을 등록하세요 >> 김삼
    4 번 학생의 이름을 등록하세요 >> 김사
    5 번 학생의 이름을 등록하세요 >> 김오

    2. scores 배열에 점수를 입력할 수 있도록 할겁니다.
    1 번 학생의 점수를 등록하세요 >> 4.5
    2 번 학생의 점수를 등록하세요 >> 4.4
    3 번 학생의 점수를 등록하세요 >> 4.3
    4 번 학생의 점수를 등록하세요 >> 4.2
    5 번 학생의 점수를 등록하세요 >> 4.1

    학생들의 점수 촐합은 21.5점입니다.

 */

public class Array02 {
    public static void main(String[] args) {
        //우리가 고민해야 할 점
        // 몇명의 학생을 등록 하시겠습니까 >> 5
        // 그럼 그 이후에 5명짜리를 등록 할 수 있는 빈 배열이 생성되어야합니다.

        Scanner scanner = new Scanner(System.in);
        int human = 0;
        System.out.println("몇 명의 학생을 등록하시겠습니까? >>> ");
        human = scanner.nextInt();

        scanner.nextLine();
        String humans[] = new String[human];
        double[] scores = new double[humans.length];

        double sum=0;
        for(int i=0; i<humans.length; i++){ //human.length나 score.length나 human이나 다 같죠
            System.out.println(i+1 + "번 학생의 이름을 등록하세요 >>> " + humans);
            humans[i] = scanner.next();
            System.out.println(humans[i] + " 학생의 점수를 등록하세요 >>> " + scores);
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }



        System.out.println("학생들 점수 총합은 " + sum + "점 입니다.");

        // [1], [3]에 해당하는 element만 출력하는 반복문을 작성하세요


        // 특정 index에 속해있는 element 추출
        // 증감값을 +=2를 통해서 강제 조정할 경우
        // index는 0부터 시작인데 굳이 1로 지정해줘야하기 때문에 오히려
        // 조건문이 있는 것보다 가독성이 떨어지고 잘못 해석할 확률이 높습니다.

        for(int i=0; i<human; i++){
            if(i==3 || i==1){
                System.out.println(humans[i] + " " + scores[i]);
            }
        }


    }
}
