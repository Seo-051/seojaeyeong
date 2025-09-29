package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우 명확한 횟수가 고정되어 있을때 사용하는 반복문

    형식 :
    for(시작값 ; 종료값 ; 증감값){
        반복 실행문
    }
 */
public class Loop04 {
    public static void main(String[] args) {

        //1부터 100까지 출력하는 for문
//        for(int i=1; i<101; i++){
//            System.out.println(i);
//        }
        //1부터 100까지의 합을 구하고 한번만 출력하시오(for문 사용)
//        int sum = 0;
//
//        for(int i=0; i<101; i++){ // 보편적인 방식 i =0 ; i<101
//            sum += i;
//        }
//        System.out.println(sum);

        //1부터 100까지 중 홀수 합을 구하는 for문 작성
        // for내부에 if문 중첨
        //증감값 건드려서 풀기
//
//        int num=0;
//
//        for(int i=0; i<101; i++){
//            if(i%2==1) num+=i;
//        }
//        System.out.println(num);
//
//        int num1=0;
//
//         for(int i=1; i<101; i+=2){
//             num1+=i;
//         }
//        System.out.println(num1);


        /*
            숫자를 입력받아서 1부터 n까지 더하는 반복문을 작성하세여

            실행 예
            1부터 몇까지 더하시겠습니까 >> 10
            1부터 10까지의 합은 55입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 몇까지 더하시겠습니까>> ");
        int num = scanner.nextInt();
        int result = 0;

        for(int i=1; i<=num; i++){ // i < (num+1) 로 사용가능 더 보편적임
            result += i;
        }
        System.out.println("1부터 " + num + " 까지의 합은 " + result + "입니다");

        /* 방식2
            int n=0;
            int sum5 = ((n*n+1)/2);
            System.out.println("1부터 " + n + " 까지의 합은 " + sum5 + "입니다");
        */
    }
}
