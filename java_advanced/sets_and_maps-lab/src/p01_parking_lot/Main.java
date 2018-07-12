package p01_parking_lot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> list = new HashSet<>();

        while(true) {
            String[] transaction = reader.readLine().split(", ");
            if(transaction[0].equalsIgnoreCase("end")) break;

            if(transaction[0].equalsIgnoreCase("IN")){
                list.add(transaction[1]);
            } else if (transaction[0].equalsIgnoreCase("OUT") && list.contains(transaction[1])) {
                list.remove(transaction[1]);
            }
        }

        if (list.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
