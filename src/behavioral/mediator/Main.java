package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ControlCenter controlCenter = new SatelliteControlCenter();

        Satellite sat1 = new CommunicationSatellite(controlCenter,"Comm1Sat");
        Satellite sat2 = new SurveillanceSatellite(controlCenter,"SurvSat");
        Satellite sat3 = new CommunicationSatellite(controlCenter,"Comm2Sat");

        sat1.sendMessage("Message from Comm1Sat");
        sat2.sendMessage("Message from SurvSat");
        sat3.sendMessage("Message from Comm2Sat");
    }
}
