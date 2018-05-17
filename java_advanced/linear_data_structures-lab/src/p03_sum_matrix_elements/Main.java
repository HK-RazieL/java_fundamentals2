package p03_sum_matrix_elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            String[] numbers = reader.readLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);
                sum += matrix[i][j];
            }

        }

        System.out.printf("%d%n%d%n%d", arr[0], arr[1], sum);
    }
}
