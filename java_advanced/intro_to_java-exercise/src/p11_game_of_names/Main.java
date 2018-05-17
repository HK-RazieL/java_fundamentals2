package p11_game_of_names;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        Map<String, Integer> players = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String player = reader.readLine();
            int initialScore = Integer.parseInt(reader.readLine());
            players.put(player, initialScore);

        }

        for (String s : players.keySet()) {
            players.put(s, players.get(s) + addingScore(s));
        }

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : players.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        System.out.printf("The winner is %s - %d points", maxEntry.getKey(), maxEntry.getValue());

    }

     private static int addingScore(String player) {
        int score = 0;

        for (char c : player.toCharArray()) {
            if ((int) c % 2 == 0) {
                score += (int) c;
            } else {
                score -= (int) c;
            }
        }

        return score;
    }
}
