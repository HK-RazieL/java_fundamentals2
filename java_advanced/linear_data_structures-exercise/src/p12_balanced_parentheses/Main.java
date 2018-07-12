package p12_balanced_parentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        String input = reader.readLine();
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);

            switch (currentBracket) {
                case '(':
                case '[':
                case '{':
                    brackets.addLast(currentBracket);
                    break;
                case ')':
                    if (brackets.isEmpty()) {
                        System.out.println("NO");
                        return;
                    }

                    char round = brackets.removeLast();
                    if (round != '(' || currentBracket != ')') {
                        System.out.println("NO");
                        return;
                    }
                    break;
                case ']':
                    if (brackets.isEmpty()) {
                        System.out.println("NO");
                        return;
                    }

                    char square = brackets.removeLast();
                    if (square != '[' || currentBracket != ']') {
                        System.out.println("NO");
                        return;
                    }
                    break;
                case '}':
                    if (brackets.isEmpty()) {
                        System.out.println("NO");
                        return;
                    }

                    char curly = brackets.removeLast();
                    if (curly != '{' || currentBracket != '}') {
                        System.out.println("NO");
                        return;
                    }
                    break;
            }
        }


        if (!brackets.isEmpty())
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}
