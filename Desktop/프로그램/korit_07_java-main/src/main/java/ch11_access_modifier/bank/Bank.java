package ch11_access_modifier.bank;
/*
    과제 가이드라인
    1. 필드
        accountNum(계좌번호, 정수)
        accountHolder(예금주 이름, 문자열)
        balance(잔액, 정수)
        pinNumber(비밀번호, 4자리 정수 0~9999)
     2. 생성자
        기본 생성자
        계좌번호만 있는 생성자
        계좌번호, 예금주를 받는 생성자
        계좌번호, 예금주, 초기 잔액을 받는 생성자
        계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자
     3. 메서드
        setter / Getter
            특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                -> 잔액은 음수일 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능 -> 실패하면 "불가능한 비밀번호 입니다,"
        2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형으로 작성
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다." 하고 메서드 종료
            - 유효한 금액인지 검증( amount 0초과) -> 실패하면 "불가능한 입력 금액 입니다,"
            - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가 입니다."
            - 콘솔창에
                00000원 출금 되었습니다. 현재 잔액 : 0000원
        3) showAccountInfo() / call1() 유형으로 작성
            - 콘솔 창에
                계좌번호 : 123456
                계좌 소유자 : 홍길동
                현재 잔액 : 1000000원
                라고 출력

         전체 실행 예
         계좌번호 : 123456
         계좌 소유자 : 홍길동
         현재 잔액 : 100000원 (십만원)

          계좌번호 : 98765
         계좌 소유자 : 산사임당
         현재 잔액 : 500000원 (오십만원)

         50000원이 입금되었습니다. 현재잔액 : 150000원            # account1에 대한 입금(오만원)
         잔액이 부족하여 출금할 수 없습니다.                       # account1에서 200000원 출금 시도 실채사례(이십만원)
         10000원이 출금 되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금(십만원 출금 성공)

         100000원이 출금 되었습니다. 현재 잔액 : 40000원          # account2에 대한 출금(십만원 출금)
         200000원이 입금되었습니다. 현재 잔액 : 600000원          # account2에 대한 입금(육십만원)

         최종 계좌정보
         계좌번호 : 123456
         현재 잔액 : 50000원     (오만원)

         계좌 번호: 98775
         현재 잔액 : 600000         (육십만원)


 */
public class Bank {
//    accountNum(계좌번호, 정수)
//    accountHolder(예금주 이름, 문자열)
//    balance(잔액, 정수)
//    pinNumber(비밀번호, 4자리 정수 0~9999)

    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

//    기본 생성자
//    계좌번호만 있는 생성자
//    계좌번호, 예금주를 받는 생성자
//    계좌번호, 예금주, 초기 잔액을 받는 생성자
//    계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자


    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

//    setter / Getter
//    특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
//            -> 잔액은 음수일 수 없음
//                -> 비밀번호는 0 이상 9999 이하까지만 가능 -> 실패하면 "불가능한 비밀번호 입니다,"

//    accountNum(계좌번호, 정수)
//    accountHolder(예금주 이름, 문자열)
//    balance(잔액, 정수)
//    pinNumber(비밀번호, 4자리 정수 0~9999)

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("불가능한 잔액");
            return;
        }
        this.balance = balance;

    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 10000) {
            System.out.println("불가능한 비밀번호 입니다,");
        } else {
            this.pinNumber = pinNumber;
        }
    }

    public void deposit(int amount, int inputPin) {
        if (inputPin == pinNumber) {
            if (amount < 0) {
                System.out.println("입금 불가 입니다.");
                return;
            } else {
                balance += amount;
                System.out.println(amount + " 이 입금 되었습니다. 현재잔액 : " + balance);
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

    }


    public void withdraw(int amount, int inputPin) {
        if (inputPin == pinNumber) {
            if (amount > balance) {
                System.out.println("잔액이 부족하여 출금할 수 없습니다.");
                return;
            } else if(balance - amount >=0){
                balance -= amount;
                System.out.println(amount + " 이 출금 되었습니다. 현재잔액 : " + balance);
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
    }

    void showAccountInfo() {
        System.out.println("\n계좌번호 : " + accountNum + "\n계좌 소유자 : " + accountHolder + "\n현재 잔액 : " + balance);
    }
}
                  //  입금금액          비밀번호
//            2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형으로 작성
//            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다." 하고 메서드 종료
//            - 유효한 금액인지 검증( amount 0미만) -> 실패하면 "불가능한 입력 금액 입니다,"
//            - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가 입니다."
//            - 콘솔창에
//                00000원 출금 되었습니다. 현재 잔액 : 0000원



