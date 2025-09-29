package ch12_arrays;
import java.util.Scanner;
public class Array05 {
/*
    메서드를 정의해도 되고 main에 바로하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    점수 : A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오
 */

public void element(String[] score){
    for(int i=0; i< score.length; i++){
        Scanner scanner = new Scanner(System.in);
        score[i] = scanner.next();
    }
}


    public static void main(String[] args) {
        Array05 array05 = new Array05();
        String[] score = new String[5];

        array05.element(score);
        for(int i=0; i< score.length-1; i++){
            System.out.print(score[i] + "+ ");
        }




     }
}
