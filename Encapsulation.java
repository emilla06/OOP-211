class BankAccount {
    private double balance;
    private String owner;

    BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited Php " + amount + " New balance: Php " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " withdrew Php " + amount + " Remaining balance: Php " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Emi", 1000);

        acc.deposit(500);   
        acc.withdraw(300);   
        acc.withdraw(2000);  
    }
}
