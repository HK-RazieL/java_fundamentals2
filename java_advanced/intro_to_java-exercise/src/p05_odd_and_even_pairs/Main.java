package p05_odd_and_even_pairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (arr.length % 2 != 0){
            System.out.println("invalid length");
        }
        for (int i = 0; i < arr.length - 1; i += 2) {
            if ((arr[i] & 1) == 0 && (arr[i+1] & 1) == 0) {
                System.out.printf("%d, %d -> both are even", arr[i], arr[i+1]);
            } else if ((arr[i] & 1) != 0 && (arr[i+1] & 1) != 0) {
                System.out.printf("%d, %d -> both are odd", arr[i], arr[i+1]);

            } else if (((arr[i] & 1) == 0 && (arr[i+1] & 1) != 0) || ((arr[i] & 1) != 0 && (arr[i+1] & 1) == 0)){
                System.out.printf("%d, %d -> different", arr[i], arr[i+1]);

            }
            System.out.println();
        }

    }
}
