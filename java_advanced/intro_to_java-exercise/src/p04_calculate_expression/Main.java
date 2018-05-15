package p04_calculate_expression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double resultF1 = Math.pow(((Math.pow(a,2) + Math.pow(b,2)) / (Math.pow(a,2) - Math.pow(b,2))), ((a + b + c)/ Math.sqrt(c)));
        double resultF2 = Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c , 3), (a-b));
        double absoluteValue = ((a + b + c) / 3) - ((resultF1 + resultF2) / 2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", resultF1, resultF2, Math.abs(absoluteValue));
    }
}
