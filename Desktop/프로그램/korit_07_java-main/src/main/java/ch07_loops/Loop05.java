package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능
    for(int i=0; i<100; i++){
        반복실행문 1-a
        for(int j=0; j<100; j++){
            반복실행문2
        }
        반복실행문 1-b
    }

    for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 출력

    구구단 for문
 */
        public class Loop05 {
            public static void main(String[] args) {

//        for(int i=1; i<6; i++){
//            for(int j=1; j<4; j++){
//                System.out.print(i + " 일 차 " + j + " 교시 입니다.");
//            }
//            System.out.println(" ");
//        }

//        for(int i=2; i<10; i++){
//
//            for(int j=1; j<10; j++){
//                System.out.println(i +  " x " + j + " = " + (i *j));
//            }
//            System.out.println(i + " 단 시작");
//            System.out.println(" ");
//        }


        /*
            1 2 3 4 5..10
            11.. 20
            91.. 100
         */

//
//        for(int i=1; i<101; i++){ // loop 100번
//            System.out.print(i + " ");
//            if(i%10==0) System.out.println();
//        }
//
//        for(int i=0; i<10; i++){ // loop 10번
//            for(int j=1; j<11; j++){
//                System.out.print(i*10+j + " ");
//            }
//            System.out.println();
//        }

        /*
            숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오
            실행 예
            1부터 몇 까지 더하시겠습니까 >> 10
            1부터 10까지의 합은  55입니다.
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1부터 몇 까지 더하시겠습니까 >>> ");
//        int num = scanner.nextInt();
//        int sum=0;
//
//        for(int i=0; i<num+1; i++){
//            sum += i;
//        }
//        System.out.println("1부터" + num + "까지의 합은" + sum + " 입니다. ");
//
//        //1부터 10까지의 숫자 중 짝수 합 도출
//        //풀이 1
//        int hap=0;
//        for(int i=2; i<11; i+=2){
//            hap +=i;
//        }
//        System.out.println(hap);

//        //풀이 2
//        int sum=0;
//        for(int i=0; i<11; i++){
//            if(i%2==0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1부터 몇 까지 더하시겠습니까 >>> ");
//        int n = scanner.nextInt();
//        int sum =0;
//        int sumEven = 0;
//        int sumOdd =0;
//
//        for(int i=1; i< n+1; i++){
//            sum+=i;
//            if(i%2==0){
//                sumEven += i;
//            } else{
//                sumOdd +=i;
//            }
//        }
//
//        System.out.println("1부터" + n + "까지의 합은" + sum + "입니다");
//        System.out.println("1부터" + n + "짝수 까지의 합은" + sumEven + "입니다");
//        System.out.println("1부터" + n + "홀수 까지의 합은" + sumOdd + "입니다");

                //for문 사용하지 말고
                //  전체 합 = n * (n+1)/2
                // 짝수 합 공식 = 짝수개수 * (첫짝수 + 마지막 짝수)/2
                // 홀수 합 공식 = 홀수개수 * (첫홀수 + 마지막 홀수)/2
//
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("숫자");
//                int n = scanner.nextInt();
//
//                int totalSum = n * (n + 1) / 2; // 총합
//
//                int evenCount = n / 2; // 짝 갯수
//                int lastEven = (n % 2 == 0) ? n : n - 1; // 마지막 짝수
//                int evenSum = evenCount * (2 + lastEven) / 2; //짝수 합 공식
//
//                int oddCount = (n + 1) / 2; // 홀 갯수
//                int lastOdd = (n % 2 == 1) ? n : n - 1; // 마지막 홀수
//                int oddSum = oddCount * (1 + lastOdd) / 2; // 홀수  합 공식





    }
}



