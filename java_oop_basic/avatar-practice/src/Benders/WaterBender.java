package Benders;

public class WaterBender implements Bender {

    private String name;
    private int power;
    private float waterClarity;

    public WaterBender(String name, int power, float waterClarity) {
        this.name = name;
        this.power = power;
        this.waterClarity = waterClarity;
    }

    public double waterBenderTotalPower(){
        return this.power * this.waterClarity;
    }

    public float getWaterClarity() {
        return this.waterClarity;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int power() {
        return this.power;
    }

    @Override
    public String toString() {
        return "WaterBender{" + "name='" + name + '\'' + ", power=" + power + ", waterClarity=" + waterClarity + '}';
    }
}
