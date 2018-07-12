package p13_recursive_fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("1");
        BigInteger sum = new BigInteger("0");

        if (number == 1 || number == 0) {
            System.out.println("1");
            return;
        }


        for (int i = 0; i < number - 1; i++) {
            sum = first.add(second);
            first = second;
            second = sum;

        }

        System.out.println(sum);
    }
}
