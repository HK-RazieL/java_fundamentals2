package p03_test_client;

public class BankAccount {
    private final static double DEFAULT_INTEREST = 0.02;

    private static double interestRate = DEFAULT_INTEREST;
    private static int bankAccountCount;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = ++bankAccountCount;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount < 0){
            System.out.println("Amount needs to be positive");
        } else {
            this.balance += amount;
        }
    }

    public void withdrawal(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
        }

    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public String getInterest(int years){
        return String.format("%.2f", this.balance * interestRate * years);
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
