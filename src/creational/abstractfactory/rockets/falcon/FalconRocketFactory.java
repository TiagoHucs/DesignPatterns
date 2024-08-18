package creational.abstractfactory.rockets.falcon;

import creational.abstractfactory.interfaces.AbstractRocketFactory;
import creational.abstractfactory.interfaces.Engine;
import creational.abstractfactory.interfaces.Payload;
import creational.abstractfactory.interfaces.Stage;

public class FalconRocketFactory implements AbstractRocketFactory {
    @Override
    public Payload createPayload() {
        return new Satelite("Starlink");
    }

    @Override
    public Stage createStage() {
        return new FalconStage();
    }

    @Override
    public Engine createEngine() {
        return new FalconEngine();
    }
}
