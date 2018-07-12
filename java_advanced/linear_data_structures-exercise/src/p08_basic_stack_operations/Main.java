package p08_basic_stack_operations;

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

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands[0]; i++) {
            stack.push(numbers[i]);

        }

        for (int i = 0; i < commands[1]; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }

        }

        if (stack.contains(commands[2])){
            System.out.println("true");
        } else if (stack.size() == 0) {
            System.out.println(0);
        }
        else {
            int smallest = Integer.MAX_VALUE;
            for (int integer : stack) {
                if (integer < smallest){
                    smallest = integer;
                }
            }
            System.out.println(smallest);
        }



    }
}
