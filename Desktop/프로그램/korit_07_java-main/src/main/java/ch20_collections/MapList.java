package ch20_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    /*
        처음 Generic이 도입 되었을때 선언했을 때 생성자 호출 했을때 둘 다 자료형을
        명시 했어야 하나 업데이트 되면서 선언하는 부분에만 적어주면 됨
     */
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<>();
        // key는 String이고 value는 object로 되어있는것을 확인할 수 있다.
        // 하지만 .put("name", "홍길동"); / .put("age", 30); 을 넣더라도 문제가 없을거임
        // 홍길동은 String / 30는 Integer로 두 클래스 다 Object의 서브 클래스이기 때문
        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name", "홍길동");
        customer1.put("rating", "VIP");
        customer1.put("age", 30);

        customer1.entrySet();

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name", "김가영");
        customer2.put("rating", "gold");
        customer2.put("age", 36);

        //list에 방금 만든 map 자료를 더함
        customers.add(customer1);
        customers.add(customer2);

        // 출제 의도는 entrySet을 사용하는것
        for(Map<String, Object> customer : customers){
            // list 내부 element로 들어옴
            // 그런데 MAp의 내부에는 3쌍 entry가 있다고 함
            for(Map.Entry<String, Object> entry : customer.entrySet()){
                // 그러면 이제 각각의 entry를 반복하개 된다.
                System.out.println(entry);
            }
        }
    }
}
