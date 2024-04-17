package day07.encap.practice;

public class BankAccount {

    private int balance; // 계좌 잔액
    private String accountNumber; // 계좌 번호
    private String accountHolder; // 예금주

    // 생성자
    BankAccount(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 입금 메서드
    public void deposit(int balance) {
//        int deposit = this.balance + balance;
//        System.out.println("입금 후 잔액: " + deposit + "원");
        this.balance += balance;
    }

    // 출금 메서드
    public void withdraw(int balance) {
        if (balance > this.balance) {
            System.out.println("출금 금액이 잔액을 초과하였습니다.");
        } else {
            this.balance -= balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
