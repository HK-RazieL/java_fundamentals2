package p01_rectangle_area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sideA = scan.nextDouble();
        double sideB = scan.nextDouble();

        System.out.printf("%.2f", sideA * sideB);
    }
}
