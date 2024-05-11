package JavaChallenges.BankSystem;

public class Customer {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("427","ABC");
        bankAccount.depositMoney(50000.00);
        System.out.println(bankAccount.withdrawMoney(25000.00));
    }
}
