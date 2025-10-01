package ch12_arrays;


//
//
//     실행 예
//     몇 명의 학생을 등록하시겠습니까? >>> 5
//    1 번 학생의 이름을 등록하세요 >> 김일
//    2 번 학생의 이름을 등록하세요 >> 김이
//    3 번 학생의 이름을 등록하세요 >> 김삼
//    4 번 학생의 이름을 등록하세요 >> 김사
//    5 번 학생의 이름을 등록하세요 >> 김오
//
//    2. scores 배열에 점수를 입력할 수 있도록 할겁니다.
//    1 번 학생의 점수를 등록하세요 >> 4.5
//        2 번 학생의 점수를 등록하세요 >> 4.4
//        3 번 학생의 점수를 등록하세요 >> 4.3
//        4 번 학생의 점수를 등록하세요 >> 4.2
//        5 번 학생의 점수를 등록하세요 >> 4.1
//
//학생들의 점수 촐합은 21.5점입니다.

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int index =0;
        System.out.println("몇명의 학생울 등록하시겠습니까");
        index = scanner.nextInt();
        String[] names = new String[index];
        double[] scores = new double[index];

        for(int i=0; i< names.length; i++){
            System.out.println(i+1+"학생 이름 입력>>> ");
            names[i] = scanner.next();
            System.out.println(names[i] + "학생 점수 입력>>> ");
            scores[i] = scanner.nextDouble();
            sum+=scores[i];
        }

        for(int i=0; i< names.length; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
        for(int i=0; i< names.length; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        System.out.println("총합 : " + sum);





    }
}
