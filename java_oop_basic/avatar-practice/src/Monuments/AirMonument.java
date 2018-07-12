package Monuments;

public class AirMonument implements Monument {
    private String name;
    public int airAffinity;

    public AirMonument(String name, int airAffinity) {
        this.name = name;
        this.airAffinity = airAffinity;
    }

    @Override
    public String name() {
        return this.name;
    }

    public int getAirAffinity() {
        return this.airAffinity;
    }

    @Override
    public String toString() {
        return "AirMonument{" + "name='" + name + '\'' + ", airAffinity=" + airAffinity + '}';
    }
}
