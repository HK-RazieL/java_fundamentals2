package p04_maximal_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);

            }
        }


        int bestSum = 0;
        int[][] bestMatrix = new int[3][3];

        for (int i = 0; i < matrix.length - 2; i++) {

            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = 0;
                sum += matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
                sum += matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2];
                sum += matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (sum > bestSum){
                    bestSum = sum;
                    sum = 0;

                    bestMatrix[0][0] = matrix[i][j];
                    bestMatrix[1][0] = matrix[i + 1][j];
                    bestMatrix[2][0] = matrix[i + 2][j];
                    bestMatrix[0][1] = matrix[i][j + 1];
                    bestMatrix[0][2] = matrix[i][j + 2];
                    bestMatrix[1][2] = matrix[i + 1][j + 2];
                    bestMatrix[2][1] = matrix[i + 2][j + 1];
                    bestMatrix[1][1] = matrix[i + 1][j + 1];
                    bestMatrix[2][2] = matrix[i + 2][j + 2];
                }
            }

        }

        System.out.printf("Sum = %d%n", bestSum);

        for (int[] ints : bestMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
