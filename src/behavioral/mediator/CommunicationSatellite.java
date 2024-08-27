package behavioral.mediator;

class CommunicationSatellite extends Satellite{

    CommunicationSatellite(ControlCenter controlCenter, String name){
        super(controlCenter,name);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
