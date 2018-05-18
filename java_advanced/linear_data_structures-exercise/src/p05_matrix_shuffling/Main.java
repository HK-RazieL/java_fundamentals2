package p05_matrix_shuffling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[arr[0]][arr[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = tokens[j];
            }
        }

        while (true) {
            String[] commands = reader.readLine().split("\\s+");
            if (commands[0].equalsIgnoreCase("end")) break;

            try {
                if (commands[0].equalsIgnoreCase("swap")) {
                    String token = matrix[Integer.parseInt(commands[1])][Integer.parseInt(commands[2])];
                    matrix[Integer.parseInt(commands[1])][Integer.parseInt(commands[2])]
                            = matrix[Integer.parseInt(commands[3])][Integer.parseInt(commands[4])];
                    matrix[Integer.parseInt(commands[3])][Integer.parseInt(commands[4])] = token;

                    for (String[] line : matrix) {
                        for (String cell : line) {
                            System.out.print(cell + " ");
                        }
                        System.out.println();
                    }

                } else {
                    System.out.println("Invalid input!");
                }
            } catch (RuntimeException e) {
                System.out.println("Invalid input!");

            }


        }

    }
}
