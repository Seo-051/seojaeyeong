package ch21_json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString

class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 생성


        // 하나는 한 줄로 출력
        // 하나는 prettyPrinting 적용시켜서 출력 상의 차이를 확인해보기 위해 두 개 만들었습니다.

     // 1. Java Object -> json으로 변환
        /*
            user1 객체를 생성하고, kim1 / 9876 / a@test.com / 김일 / 20 의 필드값을 가지도록
            하시오
            그리고 JSON1.java 파일을 참조해서 json 데이터로 바꾸세요
         */
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        User user1 = new User("kim1",  "9876", "a@test.com", "김일", "20");
        System.out.println(user1);
        String jsonUser1 = gson.toJson(user1);
        System.out.println(jsonUser1);      // gson이라서 한 줄 출력

        String jsonUser2 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser2);                  // gsonBuilder라서 pretty printing 적용


        /*
            2. map -> json으로 변환
            productMap1을 생성하고, "productCode", "MYWY3KH.A"
            "productName", "아이폰 16 프로 맥스"
            로 만드시오

            Map이 key-value entry를 가지고 있으니까
            json의 property로 일대일 대응이 가능함
            하지만 아직 메서드를 배우지 않아서 map 만 생성
         */

        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYWY3KH.A");
        productMap1.put("productName", "아이폰 16 프로 맥스");

        // Map -> json 데이터로 변환
        String jsonProduct1 = gson.toJson(productMap1);
        System.out.println(jsonProduct1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct2);

        /*
            이상의 두 사례에서 toJson() 이라는 메서드 argument로 Java Object 자체를 집어 넣는 것도 가능하고
            Map으로 생성된 entry를 Json 형태로 바꾸는 것도 가능하다는 것을 확인할 수 있습니다.
            즉, toJson()은 overloadoing이 이루어졌다고ㅓ 볼 수 있음

            gson 객체에서도 toJson()이 있고 gsonBilder 에서도 toJson()이 있다는 점에 주목
            
            그 다음은 json -> Map / Java Object로 바꾸는 방식도 있음
            근데 String data인 json을 ""포함해서 쓰는게 너무 귀찮기 때문에
            user1 과 productMap1을 json으로 바꾼 데이터를 그대로 쭉 쓰도록 함

            jsonUser2를 user2로 바꾸거
            jsonProduct2를 productMap2로 바꾸도록 할 예정

            형식:
            gson.fromJson(제이슨 데이터, 바꾸고자 하는 _클래스명.class);
         */

        User user2 = gson.fromJson(jsonUser2, User.class);
        gson.fromJson(jsonUser2, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        System.out.println(productMap2);

        /*
            특정 Java 객체와 Json String data가 있다고 가정했을때 서로 왔다갔다하면서 고칠 수 있음
            Map과 Json 데이터 역시 그럼

         */

        /*
            gsonBudiler로 fromJson()을 적용하더라도 콘솔 창에서
            prettyPrinting은 적용 되지 않음
            결과 값 :
            {username = kim1, password =9876, email= a@test.com, name= 김일, age=20}
            이상의 이유는 fromJson() 이라는 메서드명에서 알 수 있듯이
            JsonData(즉 String Data)를 Map으로 바꾸는것
            STring 의 경우에는 개향을 통해서 perttyPrinting이 적용될 수 있지만
            Map은 toString() 메서드를 재정의 하지 않으면 default값 형태로 콘솔에 출력이 됩니다
            그래서 gson,fromJson() 이든 gsonBuilder.fromJson() 이건 콘솔에 찍히는 결과값이 동일함.
         */

        Map<String, String> userMap1 = gson.fromJson(jsonUser2, Map.class);
        Map<String, String> userMap2 = gsonBuilder.fromJson(jsonUser2, Map.class);
        System.out.println(userMap1);
        System.out.println(userMap2);

    //    System.out.println(userMap1);
        /*
            그렇다면 이상의 코드처럼 Java 객체로 만든 것을 -> Json 데이터로 바꾼 다음에 -> 그걸 Map 형태로도 할 수 있음

            하지만 Map 의 경우 Json으로 바꾸는 것까지는 자유인데 걔를 java 객체로 만들고자한다면
            클래스가 정의 되어야 함
            객체는 클래스라는 설계도를 기준으로 만들어진 거임

            json - > jsonObject로 바꿈
            그 말은 json =/= jsonObject라는 뜻임

            잘 생각해보면 jsonUser1을 선언할 때 자료형 String으로 잡음
            근데 jsonObject의 자료형은 뭔가요?

         */

//        JsonObject jsonObject1 = gson.fromJson(jsonUser1, JsonObject.class);
//        System.out.println(jsonObject1);
//
//        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonObject1,JsonObject.class);
//        System.out.println(jsonObject2);

    }
}
