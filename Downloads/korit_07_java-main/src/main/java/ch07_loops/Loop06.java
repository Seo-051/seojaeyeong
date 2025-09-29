package ch07_loops;
/*
    Nested for - loop
    for(시작값; 한계값; 증감값){
        반복실행문 1-a
        for(시작값; 한계값; 증감값){
            반복실행문 2
        }
        반복실행문 1-b
        for(시작값; 한계값; 증감값){
            반복실행문3
        }
        반복실행문1-c
    }
    *
    **
    ***
    ****
    *****

    반복은 몇 번 이루어지는가
    무엇을 기준으로 반복이 이루어졌다고 판달할 수 있나
    왜 라인마다 별의 갯수가 달라지는가
 */
public class Loop06 {
    public static void main(String[] args) {
/*
            별 찍기를 통한 for문 구조학습
                    i = 0, j = 0 일때 두번째 for문이 작동 안하기 때문에 개행만. 별x
                    i = 1 일때, j = 0 일때 별 하나 찍히고, i=1 / j=1 일때 false
                    i = 2 일때, j = 0 1일때 별 두개
                    i = 3
                    i = 4
                    i = 5 j = 0,1,2,3,4,까지 다섯개 별이 찍히고 종료
                    종료되고 나서 개행이 이루어지기 때문에
         */

//            *
//            **
//            ***
//            ****
//            *****

//        for(int i=0; i<6; i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//==================================

//            *****
//            ****
//            ***
//            **
//            *

        for(int i=0; i<6; i++){
            for(int j=5; j>i; j--){ // j= 5; j-i>0; j++ // int j=0; j<i; j++
                System.out.print(" * ");
            }
            System.out.println();
        }

        // 100부터 1까지 역순으로 출력
        for(int i=100; i>0; i--) {
            System.out.println(i);
        }
// window + . - 이모지

//                    *
//                   ***
//                  *****
//                 *******
//                *********

        for(int i=0; i<6; i++){
            for(int j=6-i; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int k=0; k<10; k++){
                System.out.print("*");
            }

            System.out.println();
        }


//==============================




    }
}
