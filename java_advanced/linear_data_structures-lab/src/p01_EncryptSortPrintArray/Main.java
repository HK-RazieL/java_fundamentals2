package p01_EncryptSortPrintArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        List<String> name = new ArrayList<>();
        List<Integer> encryptedStrings = new ArrayList<>();


        for (int i = 0; i < number; i++) {
            name.add(reader.readLine());

        }

        for (int i = 0; i < name.size(); i++) {
            encryptedStrings.add(encript(name.get(i)));
        }

        Collections.sort(encryptedStrings);

        for (int encryptedName : encryptedStrings) {
            System.out.println(encryptedName);
        }
    }

    private static int encript (String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if(isVowel(string.charAt(i))){
                sum += (int) string.charAt(i) * string.length();
            } else {
                sum += (int) string.charAt(i) / string.length();
            }
        }
        return sum;
    }

    private static boolean isVowel (char letter) {
        return "aeiouAIEOU".contains(String.valueOf(letter));
    }
}
