package p05_simple_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            int first = Integer.valueOf(stack.pop());
            String op = stack.pop();
            int second = Integer.valueOf(stack.pop());

            switch (op) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }

        System.out.println(stack.pop());
    }
}
