package creational.abstractfactory;

import creational.abstractfactory.rockets.ModuledRocket;
import creational.abstractfactory.rockets.falcon.FalconRocketFactory;
import creational.abstractfactory.rockets.saturn.SaturnRocketFactory;

public class RocketAssemblyFactory {

    public ModuledRocket createSaturnRocket(){
        SaturnRocketFactory factory = new SaturnRocketFactory();
        return new ModuledRocket(
                factory.createPayload(),
                factory.createStage(),
                factory.createEngine()
        );
    }

    public ModuledRocket createFalconRocket(){
        FalconRocketFactory factory = new FalconRocketFactory();
        return new ModuledRocket(
                factory.createPayload(),
                factory.createStage(),
                factory.createEngine()
        );
    }
}
