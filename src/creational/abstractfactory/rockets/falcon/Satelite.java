package creational.abstractfactory.rockets.falcon;

import creational.abstractfactory.interfaces.Payload;

class Satelite implements Payload {

    private String name;

    Satelite(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return "StarLink2345";
    }
}
