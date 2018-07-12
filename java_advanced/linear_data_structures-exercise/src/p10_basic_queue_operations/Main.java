package p10_basic_queue_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] commands = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < commands[0]; i++) {
            queue.push(numbers[i]);

        }

        for (int i = 0; i < commands[1]; i++) {
            if (!queue.isEmpty()) {
                queue.removeLast();
            }

        }

        if (queue.contains(commands[2])) {
            System.out.println("true");
        } else if (queue.size() == 0) {
            System.out.println(0);
        } else {
            int smallest = Integer.MAX_VALUE;
            for (int integer : queue) {
                if (integer < smallest) {
                    smallest = integer;
                }
            }
            System.out.println(smallest);
        }

    }
}
