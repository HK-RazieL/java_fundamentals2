package p08_first_odd_or_even_elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] command = reader.readLine().split("\\s+");
        List<Integer> result = new ArrayList<>();

        switch(command[2]) {
            case "even":
                for (int number : arr) {
                    if (number % 2 == 0) {
                        result.add(number);
                    }

                }
                break;
            case "odd":
                for (int number : arr) {
                    if (number % 2 != 0) {
                        result.add(number);
                    }

                }
                break;
        }

        if (Integer.parseInt(command[1]) < result.size()){
            for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                System.out.printf("%d", result.get(i));

            }
        } else {
            System.out.println(result.toString().replace(", ", " ")
                    .replace("[", "")
                    .replace("]", ""));
        }
    }
}
