package ch21_json;

import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name", "홍길동");
        customer1.put("rating", "vip");
        customer1.put("age", 30);

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name", "김기영");
        customer2.put("rating", "gold");
        customer2.put("age", 35);

        customers.add(customer1);
        customers.add(customer2);

        for (Map<String, Object> customer : customers) {
            System.out.println("이름 : " + customer.get("name"));
            System.out.println("등급 : " + customer.get("rating"));
            System.out.println("나이 : " + customer.get("age"));
        }



    }
}
