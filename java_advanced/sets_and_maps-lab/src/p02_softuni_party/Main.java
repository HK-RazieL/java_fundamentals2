package p02_softuni_party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> guests = new TreeSet<>();

        while (true){
            String line = reader.readLine();
            if (line.equalsIgnoreCase("end")) break;

            guests.add(line);

            if (line.equalsIgnoreCase("party")) {
                while(true){
                    String guestsToParty = reader.readLine();
                    if (guestsToParty.equalsIgnoreCase("end")) break;

                    if (guests.contains(guestsToParty)) {
                        guests.remove(guestsToParty);

                    }
                }
                break;
            }
        }
        guests.remove("PARTY");
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
