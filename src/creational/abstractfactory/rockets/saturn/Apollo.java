package creational.abstractfactory.rockets.saturn;

import creational.abstractfactory.interfaces.Payload;

public class Apollo implements Payload {
    @Override
    public String getName() {
        return "Apollo11";
    }
}
