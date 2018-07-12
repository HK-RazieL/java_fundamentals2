package p01_vehicles;

public class Truck extends Vehicle{
    double airConditionerConsumption = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption + this.airConditionerConsumption;
    }

    @Override
    void refuel(double amount) {
        super.refuel(amount * 0.95);
    }
}
