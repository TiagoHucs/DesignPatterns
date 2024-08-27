package behavioral.mediator;

public abstract class Satellite {
    protected ControlCenter controlCenter;
    protected String name;

    Satellite(ControlCenter controlCenter, String name){
        this.controlCenter = controlCenter;
        this.name = name;
        this.controlCenter.register(this);
    }

    abstract void receiveMessage(String message);
    void sendMessage(String message){
        controlCenter.sendMessage(message,this);
    }
}
