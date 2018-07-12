package Monuments;

public class EarthMonument implements Monument {
    private String name;
    public int earthAffinity;

    public EarthMonument(String name, int earthAffinity) {
        this.name = name;
        this.earthAffinity = earthAffinity;
    }

    @Override
    public String name() {
        return this.name;
    }

    public int getEarthAffinity() {
        return this.earthAffinity;
    }

    @Override
    public String toString() {
        return "EarthMonument{" + "name='" + name + '\'' + ", earthAffinity=" + earthAffinity + '}';
    }
}
