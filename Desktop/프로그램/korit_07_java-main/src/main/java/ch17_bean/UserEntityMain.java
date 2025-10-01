package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {

        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("서재영");

        System.out.println(user1);
        System.out.println("username : " + user1.getUsername());
        System.out.println("name : " + user1.getName());
        System.out.println("email : " + user1.getEmail());
        System.out.println("비밀번호는 보안상 제공하지 않습니다.");

//
//        UserEntityLombok user2 = new UserEntityLombok();
//        user2.setName("김이");
//        user2.setEmail("b@test.com");
//        user2.setPassword(1234);
//        user2.setUsername(2);
//
//        // getter 사용
//        System.out.println("제 이름은" + user2.getName() + "입니다.");
//        // toString() 사용
//        System.out.println(user2);


    }
}
