package p03_euro_trip;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double wurst = scan.nextDouble();
        BigDecimal priceInBG = new BigDecimal(wurst * 1.2);
        BigDecimal priceInMarks = new BigDecimal("4210500000000");
        BigDecimal result = priceInBG.multiply(priceInMarks);

        System.out.printf("%.2f marks", result);
    }
}
