import Benders.*;
import Monuments.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Nations nation = new Nations();

        while (true) {
            String[] command = reader.readLine().split("\\s+");
            if(command[0].equalsIgnoreCase("quit")){
                System.out.println();
                nation.warHistory();
                break;
            }

            switch (command[0]) {
                case "Bender":
                    if (command[1].equalsIgnoreCase("air")) {
                        AirBender airBender = new AirBender(command[2], Integer.parseInt(command[3]), Float.parseFloat(command[4]));
                        nation.addingAirBender(airBender);
                    } else if (command[1].equalsIgnoreCase("water")) {
                        WaterBender waterBender = new WaterBender(command[2], Integer.parseInt(command[3]), Float.parseFloat(command[4]));
                        nation.addingWaterBender(waterBender);
                    } else if (command[1].equalsIgnoreCase("fire")) {
                        FireBender fireBender = new FireBender(command[2], Integer.parseInt(command[3]), Float.parseFloat(command[4]));
                        nation.addingFireBender(fireBender);
                    } else if (command[1].equalsIgnoreCase("earth")) {
                        EarthBender earthBender = new EarthBender(command[2], Integer.parseInt(command[3]), Float.parseFloat(command[4]));
                        nation.addingEarthBender(earthBender);
                    } else {
                        System.out.println("Incorrect Input");
                    }
                    break;
                case "Monument":
                    if (command[1].equalsIgnoreCase("air")) {
                        AirMonument airMonument = new AirMonument(command[2], Integer.parseInt(command[3]));
                        nation.addingAirMonument(airMonument);
                    } else if (command[1].equalsIgnoreCase("water")) {
                        WaterMonument waterMonument = new WaterMonument(command[2], Integer.parseInt(command[3]));
                        nation.addingWaterMonument(waterMonument);
                    } else if (command[1].equalsIgnoreCase("fire")) {
                        FireMonument fireMonument = new FireMonument(command[2], Integer.parseInt(command[3]));
                        nation.addingFireMonument(fireMonument);
                    } else if (command[1].equalsIgnoreCase("earth")) {
                        EarthMonument earthMonument = new EarthMonument(command[2], Integer.parseInt(command[3]));
                        nation.addingEarthMonument(earthMonument);
                    } else {
                        System.out.println("Incorrect Input");
                    }
                    break;
                case "War":
                    nation.war(command[1]);
                    break;
                case "Status":
                    if (command[1].equalsIgnoreCase("Air")) {
                        nation.statusAir();
                    } else if (command[1].equalsIgnoreCase("Fire")) {
                        nation.statusFire();
                    } else if (command[1].equalsIgnoreCase("Water")) {
                        nation.statusWater();
                    } else {
                        nation.statusEarth();
                    }
                    break;
            }
        }
    }
}
