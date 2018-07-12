package p01_unique_usernames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < number; i++) {
            set.add(reader.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
