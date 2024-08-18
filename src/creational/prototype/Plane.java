package creational.prototype;

public class Plane implements Prototype{

    private String name;
    private int fuel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public Prototype clone() {
        Plane plane = new Plane();
        plane.setFuel(getFuel());
        plane.setName(getName());
        return plane;
    }
}
