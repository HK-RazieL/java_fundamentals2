package Benders;

public class AirBender implements Bender {

    private String name;
    private int power;
    private float aerialIntegrity;

    public AirBender(String name, int power, float aerialIntegrity) {
        this.name = name;
        this.power = power;
        this.aerialIntegrity = aerialIntegrity;
    }

    public double airBenderTotalPower(){
        return this.power * this.aerialIntegrity;
    }

    public float getAerialIntegrity(){
        return this.aerialIntegrity;
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
        return "AirBender{" + "name='" + name + '\'' + ", power=" + power + ", aerialIntegrity=" + aerialIntegrity + '}';
    }
}
