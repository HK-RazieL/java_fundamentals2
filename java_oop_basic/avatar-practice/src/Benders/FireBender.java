package Benders;

public class FireBender implements Bender {

    private String name;
    private int power;
    private float heatAggression;

    public FireBender(String name, int power, float heatAggression) {
        this.name = name;
        this.power = power;
        this.heatAggression = heatAggression;
    }

    public double fireBenderTotalPower(){
        return this.power * this.heatAggression;
    }

    public float getHeatAggression() {
        return this.heatAggression;
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
        return "FireBender{" + "name='" + name + '\'' + ", power=" + power + ", heatAggression=" + heatAggression + '}';
    }
}
