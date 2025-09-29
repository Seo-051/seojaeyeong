package ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        bank1.setBalance(100000);
        bank1.setPinNumber(1234);

        bank2.setAccountNum(987654);
        bank2.setAccountHolder("신사임당");
        bank2.setBalance(500000);
        bank2.setPinNumber(5678);

        bank1.showAccountInfo();
        bank2.showAccountInfo();

        bank1.deposit(50000, 1234);
        bank1.withdraw(200000, 1234);
        bank1.withdraw(10000, 1234);

        bank2.withdraw(100000, 5678);
        bank2.deposit(20000, 5678);

        bank1.showAccountInfo();
        bank2.showAccountInfo();


//
//        50000원이 입금되었습니다. 현재잔액 : 150000원            # account1에 대한 입금(오만원)
//        잔액이 부족하여 출금할 수 없습니다.                       # account1에서 200000원 출금 시도 실채사례(이십만원)
//                10000원이 출금 되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금(십만원 출금 성공)
//
//        100000원이 출금 되었습니다. 현재 잔액 : 40000원          # account2에 대한 출금(십만원 출금)
//        200000원이 입금되었습니다. 현재 잔액 : 600000원          # account2에 대한 입금(육십만원)



    }
}
