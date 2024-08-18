package creational.abstractfactory.rockets;

import creational.abstractfactory.interfaces.Engine;
import creational.abstractfactory.interfaces.Payload;
import creational.abstractfactory.interfaces.Stage;

public class ModuledRocket {
    private Payload payload;
    private Stage stage;
    private Engine engine;

    public ModuledRocket(Payload payload, Stage stage, Engine engine) {
        this.payload = payload;
        this.stage = stage;
        this.engine = engine;
    }


    public String getRocketCode(){
        return payload.getName() +"."+ stage.getFuel() +"."+ engine.getPower();
    }
}
