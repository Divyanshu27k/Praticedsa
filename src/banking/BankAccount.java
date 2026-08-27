package banking;

public class BankAccount {
    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }
        balance -= amount;

        System.out.println("Withdrawal successful");
    }

    public void process() {

        try {

            withdraw(1000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Transaction completed/failed"
            );
        }
    }
}
