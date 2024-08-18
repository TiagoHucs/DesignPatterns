package creational.abstractfactory.rockets.saturn;

import creational.abstractfactory.interfaces.AbstractRocketFactory;
import creational.abstractfactory.interfaces.Engine;
import creational.abstractfactory.interfaces.Payload;
import creational.abstractfactory.interfaces.Stage;

public class SaturnRocketFactory implements AbstractRocketFactory {
    @Override
    public Payload createPayload() {
        return new Apollo();
    }

    @Override
    public Stage createStage() {
        return new SaturnStage();
    }

    @Override
    public Engine createEngine() {
        return new SaturnEngine();
    }
}
