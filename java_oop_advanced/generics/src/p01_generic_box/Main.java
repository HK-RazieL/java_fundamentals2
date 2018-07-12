package p01_generic_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Box box = new Box();

        for (int i = 0; i < number; i++) {
            box.add(reader.readLine());

        }

        box.toString();
    }
}
