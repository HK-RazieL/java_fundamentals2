package p07_character_multiplier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstString = scan.next();
        String secondString = scan.next();
        int sum = 0;

        if (firstString.length() > secondString.length()){
            for (int i = 0; i < secondString.length(); i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);

            }
            for (int i = secondString.length(); i < firstString.length(); i++) {
                sum += firstString.charAt(i);

            }
        } else if (firstString.length() < secondString.length()){
            for (int i = 0; i < firstString.length(); i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);

            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                sum += secondString.charAt(i);

            }
        } else {
            for (int i = 0; i < firstString.length(); i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);

            }
        }

        System.out.println(sum);
    }
}
