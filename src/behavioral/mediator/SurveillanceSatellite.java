package behavioral.mediator;

class SurveillanceSatellite extends Satellite{

    SurveillanceSatellite(ControlCenter controlCenter, String name){
        super(controlCenter,name);
    }
    
    @Override
    void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
