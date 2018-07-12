package p03_test_client;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> accounts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<BankAccount> bankAccounts) {
        this.name = name;
        this.age = age;
        this.accounts = bankAccounts;
    }

    public double getBalance(String name, BankAccount ba){
        return this.accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
