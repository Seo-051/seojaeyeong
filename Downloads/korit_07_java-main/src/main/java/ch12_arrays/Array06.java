package ch12_arrays;
/*
    int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    총합과 평균을 계상해서 다음과 같이 출력
    총점 : 뭐 몇점
    평균 : 뭐 몇점 (주의사항 : double 형변환을 적용)
 */

public class Array06 {
    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int sum=0;

        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }
        double a = (double) sum / scores.length;

        System.out.println(" 총 점 : " + sum);
        System.out.println(" 평균 : " + a);
    }

}
