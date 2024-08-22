package structural.flyweight;

import java.math.BigDecimal;

// Flyweight
class RocketType {
    private String model;
    private String manufacturer;
    private BigDecimal cost;

    public RocketType(String model, String manufacturer, BigDecimal cost) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    // Métodos
}
