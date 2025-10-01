package ch20_collections.practice;

/*
    모임 참석자 명단 관리 프로그램 작성
    지시 사항
    1. set을 이용해서 참석자 명단(string) 저장 . (중복은 없음)
    2. 사용자로 부터 참석자 이름을 계속해서 입력 받을 예정
    3. 입력 받은 이름을 set에 추가
    4. 종료 라고 입력하면 더이상 이름 입력 받지 않음
    5. 최종 모임 참석자 이름 명단 콘솔 출력

    실행 예
    --- 모임 참석자 명단 관리 --
    [종료] 라고 입력하면 프로그램 종료합니다.
    참석자 이름을 입력하시요 >>> 김일
    참석자 이름을 입력하시요 >>> 김이
    참석자 이름을 입력하시요 >>> 김삼
    참석자 이름을 입력하시요 >>> 종료
    프로그램이 종료되었습니다.

    --- 최종 참석자 명단 ---
    김일, 김이 , 김삼


 */

import java.util.*;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> attendees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();

        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[종료] 라고 입력하면 프로그램 종료합니다.");

        while(true){        // true 대신 !endOfattende
            System.out.print("참석자 이름을 입력하시요 >>> ");
            String attende = scanner.nextLine();
            attendees.add(attende);

            if(attende.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다.");
                attendees.remove("종료");
                break;
            }
        }
        meetingList.addAll(attendees);
        System.out.println("\n --- 최종 참석자 명단 --- ");

        for(int i=0; i<meetingList.size(); i++){
            if(i== meetingList.size() -1){      //meetingList.size()-1 은 list의 마지막 index 넘버
                System.out.print(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i) + ", ");
        }


    }
}
