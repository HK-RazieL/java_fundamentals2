package p06_string_matrix_rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rotation = reader.readLine();

        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("([0-9]+)");
        Matcher matcher = pattern.matcher(rotation);
        int degrees = 0;
        if (matcher.find()){
            degrees = Integer.parseInt(matcher.group(1));
        }

        while (true) {
            String text = reader.readLine();
            if (text.equalsIgnoreCase("end")) break;
            list.add(text);

        }

        char[][] matrix = new char[list.size()][findingLongestWord(list)];

        for (int i = 0; i < matrix.length; i++) {
            char[] paddedWord = new char[findingLongestWord(list)];
            Arrays.fill(paddedWord, ' ');
            for (int j = 0; j < matrix[i].length; j++) {
                if(j < list.get(i).length()) {
                    paddedWord[j] = list.get(i).charAt(j);
                }

            }
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = paddedWord[j];

            }

        }


        switch ((degrees / 90) % 4) {
            //normal
            case 0:
                for (char[] chars : matrix) {
                    for (char aChar : chars) {
                        System.out.print(aChar);
                    }
                    System.out.println();
                }
                break;
                //90 degree
            case 1:
                for (int i = 0; i < matrix[0].length; i++) {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        System.out.print(matrix[j][i]);
                        
                    }
                    System.out.println();
                }
                break;
                //180 degree
            case 2:
                for (int i = matrix.length - 1; i >= 0 ; i--) {
                    for (int j = matrix[i].length - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j]);
                        
                    }
                    System.out.println();
                }
                break;
                //270 degree
            case 3:
                for (int i = matrix[0].length - 1; i >= 0; i--) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }

                break;
        }


    }

    private static int findingLongestWord(List<String> list) {
        int longestWord = 0;

        for (String s : list) {
            if (s.length() > longestWord) {
                longestWord = s.length();
            }
        }

        return longestWord;
    }
}
