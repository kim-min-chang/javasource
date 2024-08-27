import java.util.Scanner;

public class AccountEx2 {

    // 맴버 변수
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("===============================================================");
            System.out.println("1.계좌생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("===============================================================");
            System.out.print("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    createAccount();

                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("메뉴 번호를 확인해 주세요.");
                    break;
            }

        }
    }

    static void createAccount() {
        // 계좌 생성 담당 메소드
        // 계좌 관련된 정보 입력 받기(계좌번호, 이름, 금액)

        // accounts[특정인덱스] = new Account("111-12-222", "홍길동", 10000);
        System.out.print("계좌번호 >>");
        String accountNo = sc.nextLine();
        System.out.print("이름을 입력해 주세요 > ");
        String owner = sc.nextLine();
        System.out.print("입금액을 입력해 주세요 >");
        int balance = Integer.parseInt(sc.nextLine());

        // 배열 요소에 빈 공간을 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.println("계좌 생성이 완료되었습니다.\n");
                break;
            }
        }

    }

    static void accountList() {
        // // 현재 생성된 계좌목록 출력
        // for (int i = 0; i < accounts.length; i++) {
        // if (accounts[i] != null) {
        // System.err.println("계좌 " + Account.getaccount() + "이름 " + Account.getowner()
        // + "잔액" + Account.getbalance());
        // }
        System.out.println("==================================");
        System.out.println("계좌     이름      잔액 ");
        System.out.println("==================================");

        for (Account account : accounts) {
            if (account != null) {
                System.out.printf(" %s\t%s\t%d\n", account.getAccountNo(), account.getOwner(), account.getBalance());
            }
            // for (Account account : accounts) {
            // if (account != null) {
            // System.out.printf(account.getAccountNo());
            // System.out.printf(account.getOwner());
            // System.out.println(account.getBalance());
            // }
            // }

        }
    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 예금액 입력받기

        System.out.print("계좌번호를 입력하세요 > ");
        String accountNo = sc.nextLine();
        System.out.print("입금액을 입력해 주세요 > ");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열요소에서 일치하는 계좌번호를 찾기
        // 찾은 account의 deposit() 호출
        Account account = findaccount(accountNo);
        if (account != null) {
            account.deposit(amount);
        }

    }

    static void withdraw() {
        // 출금하기
        System.out.print("계좌번호를 입력하세요 > ");
        String accountNo = sc.nextLine();
        System.out.print("출금액을 입력해 주세요 > ");
        int amount = Integer.parseInt(sc.nextLine());
        // 배열요소에서 일치하는 계좌번호를 찾기
        Account account = findaccount(accountNo);
        if (account != null) {
            account.withdraw(amount);
        }

    }

    static Account findaccount(String accountNo) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {
                    return account;
                }

            }
        }
        return null;
    }
}
