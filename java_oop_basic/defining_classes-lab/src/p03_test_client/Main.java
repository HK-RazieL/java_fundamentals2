package p03_test_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        while(true){
            String[] command = reader.readLine().split("\\s+");
            if(command[0].equalsIgnoreCase("End")) return;

            BankAccount ba = null;

            switch (command[0]){
                case "Create":
                        ba = new BankAccount();
                        accounts.put(ba.getId(), ba);
                        System.out.printf("Account ID%s created%n", ba.getId());
                    break;
                case "Deposit":
                    if (!accounts.containsKey(Integer.parseInt(command[1]))){
                        System.out.println("Account does not exist");
                    } else {
                        accounts.get(Integer.parseInt(command[1])).deposit(Double.parseDouble(command[2]));
                        System.out.printf("Deposited %s to ID%s%n", command[2], command[1]);
                    }
                    break;
                case "Withdraw":
                    if (!accounts.containsKey(Integer.parseInt(command[1]))){
                        System.out.println("Account does not exist");
                    } else {
                        accounts.get(Integer.parseInt(command[1])).withdrawal(Double.parseDouble(command[2]));
                    }
                    break;
                case "Print":
                    if (!accounts.containsKey(Integer.parseInt(command[1]))){
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println(accounts.get(Integer.parseInt(command[1])).toString());
                    }
                    break;
                case "GetInterest":
                    if (!accounts.containsKey(Integer.parseInt(command[1]))){
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println(accounts.get(Integer.parseInt(command[1])).getInterest(Integer.parseInt(command[2])));
                    }
                    break;
                case "SetInterest":
                    if (!accounts.containsKey(Integer.parseInt(command[1]))){
                        System.out.println("Account does not exist");
                    } else {
                        BankAccount.setInterestRate(Double.parseDouble(command[1]));
                    }
                    break;

            }
        }
    }
}
