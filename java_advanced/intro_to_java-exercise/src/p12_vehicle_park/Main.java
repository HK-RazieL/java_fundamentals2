package p12_vehicle_park;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> parkedVehicles = new ArrayList<>(Arrays.asList(reader.readLine().split("\\s+")));
        int count = 0;

        while (true) {
            String[] order = reader.readLine().split("\\s+");
            if (order[0].equalsIgnoreCase("End")) {
                System.out.printf("Vehicles left: %s%n", parkedVehicles.toString().replace("[", "").replace("]", ""));
                System.out.printf("Vehicles sold: %d", count);
                break;
            } else if (parkedVehicles.contains(carModel(order))){
                System.out.printf("Yes, sold for %d$%n", getPrice(order));
                parkedVehicles.remove(carModel(order));
                count++;
            } else {
                System.out.println("No");
            }

        }
    }

    private static String carModel(String[] request) {
        char carType = request[0].toLowerCase().charAt(0);
        String carSeats = request[2];

        return String.format("%s%s", carType, carSeats);
    }

    private static Integer getPrice(String[] request) {
        return Integer.parseInt(request[2]) * request[0].toLowerCase().charAt(0);

    }
}
