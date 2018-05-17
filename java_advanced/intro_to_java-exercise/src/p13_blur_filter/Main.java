package p13_blur_filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int blurAmount = Integer.parseInt(reader.readLine());
        String[] matrixSize = reader.readLine().split("\\s+");
        long[][] matrix = new long[Integer.parseInt(matrixSize[0])][Integer.parseInt(matrixSize[1])];

        for (int i = 0; i < matrix.length; i++) {
            String[] temp = reader.readLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Long.parseLong(temp[j]);

            }
        }

        int[] blurCoordinates = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int blurStartRow = blurCoordinates[0] - 1 < 0 ? blurCoordinates[0] : blurCoordinates[0] - 1;
        int blurStartCol = blurCoordinates[1] - 1 < 0 ? blurCoordinates[1] : blurCoordinates[1] - 1;
        int blurEndRow = blurCoordinates[0] + 1 >= matrix.length ? blurCoordinates[0] : blurCoordinates[0] + 1;
        int blurEndCol = blurCoordinates[1] + 1 >= matrix[blurCoordinates[0]].length ? blurCoordinates[1] : blurCoordinates[1] + 1;


        for (int i = blurStartRow; i <= blurEndRow; i++) {
            for (int j = blurStartCol; j <= blurEndCol; j++) {
                matrix[i][j] += blurAmount;

            }
        }

        print(matrix);
    }

    private static void print(long[][] matrix) {
        for (long[] lines : matrix) {
            List<String> line = new ArrayList<>();
            for (long number : lines) {
                line.add(String.valueOf(number));
            }
            System.out.println(String.join(" ", line));

        }
    }
}
