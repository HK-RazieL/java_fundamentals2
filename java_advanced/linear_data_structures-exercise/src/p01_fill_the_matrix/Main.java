package p01_fill_the_matrix;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(string[0])][Integer.parseInt(string[0])];
        int counter = 1;
        if (string[1].equalsIgnoreCase("a")) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = counter;
                    counter++;
                }
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j <= Integer.parseInt(string[0]) - 1; j++) {
                    matrix[j][i] = counter;
                    counter++;

                }
                if (i < Integer.parseInt(string[0]) - 1) {
                    i++;
                } else {
                    break;
                }
                for (int j = Integer.parseInt(string[0]) - 1; j >= 0; j--) {
                    matrix[j][i] = counter;
                    counter++;

                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
