package p14_simple_text_editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            String[] command = reader.readLine().split("\\s+");

            switch (command[0]) {
                case "1":
                    stack.addFirst(sb.toString());
                    sb.append(command[1]);
                    break;
                case "2":
                    stack.addFirst(sb.toString());
                    sb.delete(sb.length() - Integer.parseInt(command[1]), sb.length());
                    break;
                case "3":
                    System.out.println(sb.charAt(Integer.parseInt(command[1]) - 1));
                    break;
                case "4":
                    sb.setLength(0);
                    sb.append(stack.pollLast());
                    break;
            }
        }
    }
}
