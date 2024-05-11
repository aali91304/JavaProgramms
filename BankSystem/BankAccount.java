package JavaChallenges.BankSystem;

public class BankAccount {
    private String accountNumber;
    private  String AccountHolderName;
    private  double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        AccountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("Invalid deposit");
        }
        balance += money;
    }
    public  double withdrawMoney(double money){
        if(balance >= money) {
            balance -= money;
        } else if (money <= 0) {
            System.out.println("invalid withdraw");

        }else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
