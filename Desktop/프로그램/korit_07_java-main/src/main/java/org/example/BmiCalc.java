package org.example;



import java.util.Scanner;


        /*
            실행 예
            이름을 입력하세여 : 김일
            키(cm)를 입력하세요 : 172
            몸무게(kg)를 입력하세여 : 68
            김일 님의 bmi 지수는 23.0으로 과체중입니다.
         */



public class BmiCalc {
    //신체질량지수(BMI) = 체중(kg) / [신장(m)]2
    public void calcBmi(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세여>>> ");
        String name = scanner.nextLine();
        System.out.println("키를 입력하세여>>>  ");
        double height = scanner.nextDouble();
        System.out.println("몸무게를 입력하세여>>> ");
        double weight = scanner.nextDouble();

        double bmi =  weight / ((height/100) * (height/100));
        String result = "";

        if(bmi<18.5){
            result ="저체중";
        }
        else if(bmi<23){
            result= "정상";
        }
        else if(bmi<25){
            result = "비만 전 단계";
        }
        else if(bmi<30){
            result = "1단계";
        }
        else if(bmi<35){
            result = "2단계";
        }
        else {
            result ="3단계";
        }

        System.out.printf(name + " 님의 bmi 지수는 " + bmi + "으로" + result );

    }
    public void calcBmi(String name, double height, double weight){
        double bmi =  weight / ((height/100) * (height/100));
        String result = "";

        if(bmi<18.5){
            result ="저체중";
        }
        else if(bmi<23){
            result= "정상";
        }
        else if(bmi<25){
            result = "비만 전 단계";
        }
        else if(bmi<30){
            result = "1단계";
        }
        else if(bmi<35){
            result = "2단계";
        }
        else {
            result ="3단계";
        }

        System.out.println(name + " 님의 bmi 지수는 " + bmi + "으로" + result);
    }
    public static void calcBmi(Person person){
        double weight = person.getWeight();
        double height = person.getHeight();
        double bmi =  weight / ((height/100) * (height/100));
        String result = "";

        if(bmi<18.5){
            result ="저체중";
        }
        else if(bmi<23){
            result= "정상";
        }
        else if(bmi<25){
            result = "비만 전 단계";
        }
        else if(bmi<30){
            result = "1단계";
        }
        else if(bmi<35){
            result = "2단계";
        }
        else {
            result ="3단계";
        }

        System.out.println(person.getName() + " 님의 bmi 지수는 " + bmi + "으로" + result);
    }

    public static void main(String[] args) {
        BmiCalc bmiCalc1 = new BmiCalc();
        bmiCalc1.calcBmi("김일", 172, 68);


        Person person = Person.builder()
                .name("김이")
                .height(174)
                .weight(43)
                .build();

        calcBmi(person);

    }
}
