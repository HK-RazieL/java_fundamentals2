package p02_average_of_three_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.printf("%.2f",(a + b + c) / 3);
    }
}
