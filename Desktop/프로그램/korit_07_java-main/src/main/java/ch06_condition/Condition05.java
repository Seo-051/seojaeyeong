package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 50점 이상이라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D입니다.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하시오>>> ");
        int score = scanner.nextInt();
        char greade;

        if(score >= 90){
            greade = 'A';
        }
        else if(score >= 80){
            greade = 'B';
        }
        else if(score >= 70){
           greade = 'C';
        }
        else if(score >= 60){
            greade = 'D';
        }
        else {
            greade = 'F';
        }
        System.out.println("당신의 점수는" + score + "이고 학점은" + greade + "입니다");

    }
}
