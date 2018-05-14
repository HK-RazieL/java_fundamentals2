package p07_product_of_numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        BigInteger result = new BigInteger("1");

        for (int i = a; i <= b; i++) {
            BigInteger temp = BigInteger.valueOf(i);
            result = result.multiply(temp);

        }

        System.out.printf("product[%d..%d] = %d",a , b, result);
    }
}
