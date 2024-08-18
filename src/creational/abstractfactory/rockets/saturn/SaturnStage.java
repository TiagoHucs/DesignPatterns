package creational.abstractfactory.rockets.saturn;

import creational.abstractfactory.interfaces.Stage;

public class SaturnStage implements Stage {
    @Override
    public double getFuel() {
        return 10;
    }
}
