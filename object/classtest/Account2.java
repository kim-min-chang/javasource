public class Account2 {
    private String accountNo;// 계좌번호 (accountNo) : 101-11-12345
    private String owner;// 계좌주 (owner) : 홍길동
    private int balance; // 잔액 (balance) : 1000000

    public Account2(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금하다 (deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다 (withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 리턴

    int withdraw(int amount) {
        if (amount > balance) {
            return -1;
        }
        balance -= amount;
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account2 [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
