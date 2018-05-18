package p07_matching_brackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] string = reader.readLine().toCharArray();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < string.length; i++) {
            if (string[i] == '(') {
                deque.add(i);
            }
            if (string[i] == ')'){
                int beginning = deque.pollLast();
                for (int j = beginning; j <= i; j++) {
                    System.out.print(string[j]);

                }
                System.out.println();
            }
        }
        
    }
}
