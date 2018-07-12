package Monuments;

public class FireMonument implements Monument {
    private String name;
    public int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        this.name = name;
        this.fireAffinity = fireAffinity;
    }

    @Override
    public String name() {
        return this.name;
    }

    public int getFireAffinity() {
        return this.fireAffinity;
    }

    @Override
    public String toString() {
        return "FireMonument{" + "name='" + name + '\'' + ", fireAffinity=" + fireAffinity + '}';
    }
}
