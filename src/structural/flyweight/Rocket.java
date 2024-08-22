package structural.flyweight;

public class Rocket {
    private String model;
    private String manufacturer;
    private double payload;

    public Rocket(String model, String manufacturer, double payload) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.payload = payload;
    }

}
