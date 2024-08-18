package creational.abstractfactory.rockets.falcon;

import creational.abstractfactory.interfaces.Engine;

public class FalconEngine implements Engine {
    @Override
    public int getPower() {
        return 5;
    }
}
