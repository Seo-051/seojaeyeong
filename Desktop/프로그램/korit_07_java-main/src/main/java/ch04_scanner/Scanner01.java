package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
/*
        String name;
        name = "안근수";
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요>>>");
        name = scanner.nextLine();
*/
        /*
            1. println 과 print 의 차이
                ln : line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행됨.
                print로 작성할 경우에 동일 라인에 그대로 연결됨
            2. nextLine / nextInt / 어쩌고 이런것들이 있겠다 구분 해야겠다
         */
/*
        System.out.println("연도를 입력하세요. >>>");
        int year = scanner.nextInt();
        System.out.println("이름을 다시 입력하세요. >>>>");
        name = scanner.next();       //입력을 ahn geunsu
        System.out.println(name);*/

        /*
            2. next(Int / Double, ... etc) vs. nextLine
                - nextLine은 띄어쓰기를 허용한다.enter 키 즉 개행을 기준으로 데이터가ㅓ 변수에 저장됨-> 그래서 24번 라인 실행 결과가 ahn 이었습니다.
                - 나머지는 허용 안합니다. 띄어쓰기 하면 잘려서 대입됩니다.
         */
        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("올해는 몇 년도인가요  >>>");
        int year = scanner.nextInt();

        scanner.nextLine(); //배리어 역할을 하는 nextLine()
        //얘는 사용되지 않을거니까 변수에 대입하지 않았습니다.

        System.out.println("당신의 이름은 >>> ");
        String name = scanner.nextLine();
        System.out.println("연도 : "+ year);
        System.out.println("이름 : "+ name);
        */

        /*
            이상의 코드에서의 문제점은 34번 라인이 실행됬을때 데이터를 입력받지 않고
            그대로 넘어간다는 점 입니다.
            왜 이런 문제가 생기냐면 nextInt()에서 값을 입력하고 저희가 enter를 치게 되는데
            그 경우 다음 nextLine()에서는 enter키를 받아 들여서 빈값인 상태로 enter를 쳤다고
            인지하게 되기 때문에
            곧장 35번 출력문으로 넘어갔기 때문입니다.

            해결 방법 : enter키를 받아주는 nextLine()을 하나 더 만들어 줍니다.
         */

        /*
            1. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            나이를 입력하시오 >> 19
            저는 올해 19살 입니다.
            내년에는 20살이 됩니다.

            2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오
            점수를 입력하세요 >> 4.5
            이름을 입력하세요 >> 김일
            김일 학생의 점수는 4.5입니다.
         */
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.println("나이는 " + age + " 입니다.");
//        System.out.println("내년에는 " + (age+1) + " 입니다.");
/*
        System.out.println("========================");
        System.out.println("점수를 입력하세요");
        double score = scanner.nextDouble();
        System.out.println("이름을 입력하세요");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name + " 학생의 점수는 " + score + "입니다.");
        */
    }
}
