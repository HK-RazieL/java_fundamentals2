package Monuments;

public class WaterMonument implements Monument {
    private String name;
    public int waterAffinity;

    public WaterMonument(String name, int waterAffinity) {
        this.name = name;
        this.waterAffinity = waterAffinity;
    }

    @Override
    public String name() {
        return this.name;
    }

    public int getWaterAffinity() {
        return this.waterAffinity;
    }

    @Override
    public String toString() {
        return "WaterMonument{" + "name='" + name + '\'' + ", waterAffinity=" + waterAffinity + '}';
    }
}
