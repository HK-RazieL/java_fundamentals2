package p02_matrix_of_palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split("\\s+");
        String[][] matrix = new String[Integer.parseInt(string[0])][Integer.parseInt(string[1])];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = "" + (char)('a' + i) + (char)('a' + i + j) + (char)('a' + i);
            }

        }

        for (String[] strings : matrix) {
            for (String s : strings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
