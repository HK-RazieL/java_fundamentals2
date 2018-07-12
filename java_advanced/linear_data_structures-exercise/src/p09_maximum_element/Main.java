package p09_maximum_element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCommands = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = reader.readLine().split(" ");

            switch (command[0]) {
                case "1":
                    int token = Integer.parseInt(command[1]);
                    stack.push(token);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int max = 0;
                    for (Integer integer : stack) {
                        if (integer >= max)
                            max = integer;
                    }
                    sb.append(max).append(System.lineSeparator());
                    break;
            }
        }
        System.out.print(sb);
    }
}
