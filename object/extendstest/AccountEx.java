package extendstest;

public class AccountEx {
    CheckingAccount checkingAccount = new CheckingAccount("111-111", "홍길동", 1000000, "222-22");

    // 입금하다
    checkingAccount.deposit(amount);System.out.println("현재 잔액 "+checkingAccount.getBalance())

    int balance = checkingAccount.pay("222-22", 20000);checkingAccount.pay("222-22",20000);

}
