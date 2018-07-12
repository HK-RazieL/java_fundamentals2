package p16_poisonous_plants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> plants = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            plants.add(arr[i]);

        }

        int counter = 0;

        for (int i = 0; i < plants.size() - 1; i++) {
            if (plants.get(i) <= plants.get(i + 1)) {
                plants.remove(i + 1);
                counter++;
            }
        }


        System.out.println(counter);
    }
}
