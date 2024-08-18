package creational.abstractfactory.rockets.falcon;

import creational.abstractfactory.interfaces.Stage;

public class FalconStage implements Stage {
    @Override
    public double getFuel() {
        return 0;
    }
}
