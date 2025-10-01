package ch12_arrays;

/*
    다차원 배열(Muti-Dimensional Array) 중에서 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상
    2차원 배열 이상을 다루는 경우는 극히 드물기 때문에 2차원 배열을
    기준으로 강의

    형식 :

    int[][] arr01 = new int[크기][크기];    - 선언 방식 # 1
    int[][] arr02 = new int[크기][];       - 선언 방식 # 2
    int[][] arr03 = { { 1, 2 }, { 3, 4 }, { 5, 6} } - 선언 방식 # 3 및 초기화

    2차원 배열 선언 시 , 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 함
        -> 2번 방식에 해당
        1열 2열(column)
         ↆ  ↆ
        {1, 2}, → 1 행(row)       가로줄을 '행'
        {3, 4}, → 2 행
        {5, 6}  → 3 행
 */

import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = { { 1, 2 }, { 3, 4 }, { 5, 6} };
        //5 뽑아내기
        System.out.println(arr03[2][0]);
        System.out.println(arr03[2]);   //결과값 : [I@36baf30c
        System.out.println(arr03);      //결과값 : [[I@7a81197d
        System.out.println(Arrays.toString(arr03)); // 결과값 : [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        // 2차 배열의 element 추출 -> 중첩 for문을 사용하셔야함

        for(int i=0; i< arr03.length; i++){
            //근데 반복무니 하나 파고 들어가봐도 여전히 배열이기 때문에 이부분에서 1차 배열을 추출하기위한
            // 반복문 추가로 작성
            for(int j=0; j< arr03[i].length; j++){
                System.out.println(arr03[i][j]);
            }
        }
        System.out.println();

        for (int[] ints : arr03){
            for (int element : ints){
                System.out.println(element);
            }
        }

        // 그렇다면 향상된 for문으로 2차 배열 내부의 element를 추출하시오
    }
}
