package p04_maximum_sum_of_2x2_submatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] numbers = reader.readLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);

            }

        }

        int[][] bestMatrix = new int[2][2];

        int bestSum = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                sum = matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1][j + 1];

                if (sum > bestSum) {
                    bestSum = sum;
                    bestMatrix[0][0] = matrix[i][j];
                    bestMatrix[1][0] = matrix[i+1][j];
                    bestMatrix[0][1] = matrix[i][j+1];
                    bestMatrix[1][1] = matrix[i+1][j+1];
                }

            }
        }

        for (int[] ints : bestMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);

    }
}

