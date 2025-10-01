package ch06_condition;

import java.util.Scanner;

/*
    중첩 if문(Nested - if)
        if문 내에 if문 중첩적으로 사용될 수 있습니다.
    형식 :

    if(){
       if(조건식1){
            실행문1
       } else if(조건식1a){
             실행문1a
       } else if(조건식1b){
            실행문1b
       } else {
            실행문1c
       }
    } else if(){
        if(조건식2){
             실행문2
        } else if(조건식2a){
             실행문2a
        } else if(조건식2b){
             실행문2b
        } else {
             실행문2c
        }
    }

 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String greade = "";
        System.out.println("점수를 입력하세여 >>> ");

        if(score < 10 || score < 0){ // 실행문 1
            System.out.println("불가능한 점수 입력입니다.");
            greade = "X";
        } else{ //위가 실행이 안됐다면 score는 0 이상 100이하
             if(score >= 90){
                greade = "A";
            }
             else if(score >= 80){
                greade = "B";
            }
            else if(score >= 70){
                greade = "C";
            }
            else if(score >= 60){
                greade = "D";
            }
            else if(score >= 50){
                greade = "E";
            }
            else {
                greade = "F";
            }
        }
        System.out.println("당신의 점수는" + score + "이고 학점은" + greade + "입니다");
    }
}
