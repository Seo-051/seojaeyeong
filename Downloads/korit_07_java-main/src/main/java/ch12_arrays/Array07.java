package ch12_arrays;
/*

    내부 element의 값들의 점수 범위를 조사하여
    90  이상은 A
    80 이상은 B
    70 이상은 C
    60 이상은 D
    59 이하는 F 인데
    A가 몇 명이고,B가 몇 명이고, ...F가 몇 명인지 출력할 수 있도록 할 예정
 */

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int[] grades = {0, 0, 0, 0, 0};

        // int[] =/= int
        for(int i=0; i< scores.length; i++){
            if(scores[i]>89){
                grades[0]++;
            }
            else if(scores[i]>79){
                grades[1]++;
            }
            else if(scores[i]>69){
                grades[2]++;
            }
            else if(scores[i] > 59){
                grades[3]++;
            }
            else{
                grades[4]++;
            }
        }

        for(int i=0; i< grades.length; i++){
            System.out.println("A 학생 수 : " + grades[i]);
        }





        // 고민할 부분은  -> 어차피 abcdf가 하나하나 int 니까
        // int[] 배열로 선언해서 변수 개수를 줄일 수 있지 않을까
//        int[] grades = {0, 0, 0, 0, 0};
        // A에 해당하는 점수라면 grade[0] 숫자를 +1 해주고, b에 해당하면 grade[1] +1//
        // 굳이 다섯줄 써가면서 변수들을 선언할 필요가 없다.

    }
}
