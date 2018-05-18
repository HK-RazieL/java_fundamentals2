package p03_diagonals_difference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[number][number];

        for (int i = 0; i < matrix.length; i++) {
            String[] string = reader.readLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(string[j]);

            }

        }
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    primaryDiagonal += matrix[i][j];
                }
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix.length - j - 1) {
                    secondaryDiagonal += matrix[i][j];
                }

            }
        }

        System.out.println(Math.max(primaryDiagonal, secondaryDiagonal) - Math.min(primaryDiagonal, secondaryDiagonal));
    }
}
