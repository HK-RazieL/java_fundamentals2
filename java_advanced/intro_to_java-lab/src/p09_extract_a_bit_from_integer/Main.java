package p09_extract_a_bit_from_integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int position = scan.nextInt();

        int mask = n >> position;
        int result = mask & 1;

        System.out.println(result);

    }
}
