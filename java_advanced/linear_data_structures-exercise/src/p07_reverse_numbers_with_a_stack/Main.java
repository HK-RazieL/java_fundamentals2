package p07_reverse_numbers_with_a_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> numbers = new ArrayDeque<>();

        String[] string = reader.readLine().split("\\s+");

        for (String s : string) {
            numbers.push(s);
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
