package p01_vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    double fuelQuantity;
    double fuelConsumption;

    void drive(double distance) {
        double fuelForTrip = this.fuelConsumption * distance;
        DecimalFormat df = new DecimalFormat("#.##");
        if (this.fuelQuantity > fuelForTrip){
            this.fuelQuantity -= fuelForTrip;
            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), df.format(distance));
        } else {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }
    }

    void refuel(double amount) {
        this.fuelQuantity += amount;
    }

    double getFuelQuantity() {
        return this.fuelQuantity;
    }

}
