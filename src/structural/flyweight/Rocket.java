package structural.flyweight;

import java.math.BigDecimal;

public class Rocket {
    private String model;
    private String manufacturer;
    private double payload;
    private BigDecimal cost;

    public Rocket(String model, String manufacturer, BigDecimal cost, double payload) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.payload = payload;
        this.cost = cost;
    }

}
