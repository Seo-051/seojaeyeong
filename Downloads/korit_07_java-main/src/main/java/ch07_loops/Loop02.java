package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    91....100

    1. 반복문을 100번 돌리기
    2. 반복문을 10번 돌리기
 */
public class Loop02 {
    public static void main(String[] args) {
        /*
        int i = 0;


        while(i < 100){
            System.out.print(++i + " ");
            if(i%10==0) System.out.println("");
        }
        */


        int j = 0;

        while(j < 101){
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5)+ " " + (j+6)+ " " + (j+7)+ " " + (j+8)+ " " + (j+9));
            j+=10;
        }

        int i = 1; // 시작 숫자
        int line = 0; // 줄 수 (10줄 만들기)

        while (line < 10) {
            int count = 0; // 한 줄에 출력된 숫자 개수

            while (count < 10) {
                System.out.print(i + " ");
                i++;
                count++;
            }

            System.out.println(); // 줄바꿈
            line++;
        }
//
//        for(int i=1; i<=10; i++){
//
//            for(int j=1; j<=10; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//        }


    }
}
