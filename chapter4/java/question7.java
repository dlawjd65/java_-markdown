import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;   // 잔고 저장 변수
        boolean run = true;

        while (run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");

            String input = scanner.nextLine(); // 메뉴 입력(문자열)
            switch (input) {
                case "1": // 예금
                    System.out.print("예금액> ");
                    int deposit = Integer.parseInt(scanner.nextLine());
                    balance += deposit;
                    break;
                case "2": // 출금
                    System.out.print("출금액> ");
                    int withdraw = Integer.parseInt(scanner.nextLine());
                    if (withdraw <= balance) {
                        balance -= withdraw;
                    } else {
                        System.out.println("잔고가 부족합니다.");
                    }
                    break;
                case "3": // 잔고 조회
                    System.out.println("잔고> " + balance);
                    break;
                case "4": // 종료
                    run = false;
                    break;
                default: // 잘못된 입력
                    System.out.println("1~4 중에서 선택하세요.");
            }
        }

        System.out.println("프로그램 종료");
        scanner.close();
    }
}
