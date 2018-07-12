package p01_vehicles;

public class Car extends Vehicle {

    double airConditionerConsumption = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption + this.airConditionerConsumption;
    }

}
