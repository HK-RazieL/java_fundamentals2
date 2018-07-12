package Benders;

public class EarthBender implements Bender {

    private String name;
    private int power;
    private float groundSaturation;

    public EarthBender(String name, int power, float groundSaturation) {
        this.name = name;
        this.power = power;
        this.groundSaturation = groundSaturation;
    }

    public double earthBenderTotalPower() {
        return this.power * this.groundSaturation;
    }

    public float getGroundSaturation() {
        return this.groundSaturation;
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
        return "EarthBender{" + "name='" + name + '\'' + ", power=" + power + ", groundSaturation=" + groundSaturation + '}';
    }
}
