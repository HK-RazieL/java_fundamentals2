package p02_split_by_word_casing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split("[\\\\,;:.!()\"\'/\\[\\] ]+");

        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixed = new ArrayList<>();

        Pattern lowerCasePattern = Pattern.compile("[a-z]+");
        Pattern upperCasePattern = Pattern.compile("[A-Z]+");

        for (int i = 0; i < text.length; i++) {
            if (text[i].length() == 0) {
                continue;
            }

            Matcher lowerMatcher = lowerCasePattern.matcher(text[i]);
            Matcher upperMatcher = upperCasePattern.matcher(text[i]);

            if (lowerMatcher.matches()){
                lowerCase.add(text[i]);
            } else if (upperMatcher.matches()){
                upperCase.add(text[i]);
            } else {
                mixed.add(text[i]);
            }

        }

        System.out.printf("Lower-case: %s%n", String.join(", ", lowerCase.toString()).replace("[", "").replace("]", ""));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixed.toString()).replace("[", "").replace("]", ""));
        System.out.printf("Upper-case: %s%n", String.join(", ", upperCase.toString()).replace("[", "").replace("]", ""));

    }
}
