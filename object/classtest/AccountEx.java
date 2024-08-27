import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account("101-10-12345", "홍길동", 1000000);
        // 예금하다
        account.deposit(100000);
        // 잔액조회
        System.out.println("입금 후 현재 잔액 : " + account.getbalance());
        // 출금하다
        int balance = account.withdraw((50000));
        if (balance == -1) {
            System.out.println("잔액부족");
        } else {
            System.out.println("출금 후 현재 잔액 = " + balance);
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("번호를 입력해 주세요 1. 예금 2. 출금\n");
        // int num =

        printAccount(account);
    }

    static void printAccount(Account account) {

    }
}
