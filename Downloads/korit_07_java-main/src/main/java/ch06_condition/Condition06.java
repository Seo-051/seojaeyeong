package ch06_condition;

import java.util.Random;
import java.util.Scanner;

/*
    고민해봐야 할 사항
    100 초과 / 0미만의 점수가 입력되었을때 각각 A / F라는 결과 값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을때 불가능한 점수 입력이라고 안내를 하려면 어떻게
    할 수 있을까여?
    100 초과 / 0 미만의 경우 greade 를 x라고 하겠습니다.

 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세여 >>> ");
        int score = scanner.nextInt();
        char greade;

        if(score > 100 || score < 0) {
            greade = 'X';
        }
        else if(score >= 90){
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
        else if(score >= 50){
            greade = 'E';
        }
        else {
            greade = 'F';
        }
        System.out.println("당신의 점수는" + score + "이고 학점은" + greade + "입니다");
    }
}
