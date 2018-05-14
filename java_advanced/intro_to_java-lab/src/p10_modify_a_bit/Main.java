package p10_modify_a_bit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int position = scan.nextInt();
        int requestedBit = scan.nextInt();
        int result;

        int mask = 1 << position;

        if (requestedBit == 1) {
            result = number | mask;
        } else {
            result = number & ~mask;
        }

        System.out.println(result);
    }
}
