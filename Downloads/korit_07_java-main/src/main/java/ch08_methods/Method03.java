package ch08_methods;

import java.util.Scanner;

/*
    별찍기 관련 메서드를 생성했습니다.
    잘 생각하면 굳이
    main에서 Scanner 임포드 받은 다음에 몇줄 짜리 쓸건지
    옵션 몇 번 선택할지를 물어봐야 할까요?

    그냥 메서드 실행시킬때 알아서 물어봐주면 간단하지 않을까요?
 */
public class Method03 {

    public static String getStar(){

        // method 내부에서 method를 호출하는것이 가능

        // method02 에서 main 단계에 써둔 부분을 여기 다 가지고 오면
        // getStar() 메서드를 호출하는 것만으로도 동일한 결과값이 나오지 않을까
        String result = "";
        Scanner scanner = new Scanner(System.in);
        int rows = 0;           // Method02에서는 rowOStars 썻지않나요 -> 근데 getStat()에서 매개변수 rows로 써서
                                // 수정하기 귀찮아서 그냥 이렇게 씀
        int option = 0;
        System.out.println("몇 줄 짜리 별을 생성하시겠습니까 >>>>> ");
        rows = scanner.nextInt();
        System.out.println(rows);
        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.println("선택하세요>>>> ");
        option = scanner.nextInt();
        System.out.println(option);

        if(option == 1){

            for(int i = 0; i< rows+1; i++){
                for(int j=0; j<i; j++){
                    result += "*";
                }
                result += "\n";
            }

        } else if(option == 2){
            for(int i=0; i<rows; i++){
                for(int j=0; j<rows - (i+1) ; j++){
                    result += " ";
                }
                for(int k=0; k<i+1; k++){
                    result += "*";
                }
                result += "\n";
            }
        } else if(option == 3){
            for(int i=0; i<rows+1; i++){
                for(int j=rows; j-i > 0; j--){
                    result += "*";
                }
                result += "\n";
            }
        } else if(option == 4){
            for(int i=0; i<rows ; i++){
                for(int j=0; j<i+1; j++){
                    result +=" ";
                }
                for(int k= rows; k>i; k--){
                    result +="*";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능이 없습니다.";
        }

        return result;



    }

    public static void main(String[] args) {
//        String starResult = "";
//        starResult = getStar();
//        System.out.println(starResult);

        System.out.println(getStar()); // 메서드 호출 결과를 print
    }
}
