package creational.abstractfactory.rockets.saturn;

import creational.abstractfactory.interfaces.Engine;

public class SaturnEngine implements Engine {
    @Override
    public int getPower() {
        return 50;
    }
}
