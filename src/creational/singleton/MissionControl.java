package creational.singleton;

public class MissionControl {

    private static MissionControl uniqueInstance;

    public static MissionControl getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new MissionControl();
        }
        return uniqueInstance;
    }
}
