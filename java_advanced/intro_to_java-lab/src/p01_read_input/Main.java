package p01_read_input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {

        Scanner scan = new Scanner(System.in);
        String firstWord = scan.next();
        String secondWord = scan.next();
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.nextLine();
        String thirdWord = scan.nextLine();

        double sum = a + b + c;

        System.out.printf("%s %s %s %.0f",firstWord, secondWord, thirdWord, sum);


    }
}
