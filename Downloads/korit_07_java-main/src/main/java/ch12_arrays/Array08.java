package ch12_arrays;

public class Array08 {
    // 접근 지정자 / return 자료형 / 메서드명(매개변수){ 구현부가 어떤식으로 이루어질 지 return }
    int sum=0;


    public int calcSum(int[] num){
        for(int i=0; i< num.length; i++){
            sum += num[i];
        }
        return sum;
    }

    public double calcAvg(int[] num){
        return (double) sum/num.length;
    }

    public static void main(String[] args) {
        Array08 array08 = new Array08();
        int[] scores = {100, 97, 55, 24, 49, 60, 20, 77, 89 };

        // 이상의 예시 배열을 argument로 하는 총합을 구하는 method calcSum,
        // 평균을 구하는 calcAvg method를 정의하는데, call4() 유형으로 만드시오

        System.out.println("총합 : " + array08.calcSum(scores) + " 점 ");
        System.out.println("평균 : " + array08.calcAvg(scores) + " 점 ");
    }
}
