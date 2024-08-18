package creational.abstractfactory.interfaces;

public interface AbstractRocketFactory {
    Payload createPayload();
    Stage createStage();
    Engine createEngine();
}
