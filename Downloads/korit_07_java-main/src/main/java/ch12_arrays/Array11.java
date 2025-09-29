package ch12_arrays;

import java.security.spec.RSAOtherPrimeInfo;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오"};
        int num=0;
        /*
            실행 예
            1 번 : 김일
            2 번 : 김이
            3 번 : 김삼
            ...
            5 번 : 김오
            라고 출력될 수 있도록
            일반 for문
            향상된 for문으로 작성하시오
         */

        for(int i=0; i<persons.length; i++){
            System.out.println((i+1) + "번 : " + persons[i]);
        }
        System.out.println();

        for (String person : persons){
            System.out.println((++num) +" 번 : " + person);
        }

    }
}
