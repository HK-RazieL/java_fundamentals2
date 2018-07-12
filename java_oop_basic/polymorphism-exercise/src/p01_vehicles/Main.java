package p01_vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] carString = reader.readLine().split("\\s+");
        String[] truckString = reader.readLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carString[1]), Double.parseDouble(carString[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckString[1]), Double.parseDouble(truckString[2]));
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            String[] command = reader.readLine().split("\\s+");

            if(command[0].equalsIgnoreCase("drive")){
                if (command[1].equalsIgnoreCase("car")){
                    car.drive(Double.parseDouble(command[2]));
                } else {
                    truck.drive(Double.parseDouble(command[2]));
                }
            } else {
                if (command[1].equalsIgnoreCase("car")){
                    car.refuel(Double.parseDouble(command[2]));
                } else {
                    truck.refuel(Double.parseDouble(command[2]));
                }
            }

        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());

    }
}
