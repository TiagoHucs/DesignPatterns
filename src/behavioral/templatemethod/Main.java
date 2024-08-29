package behavioral.templatemethod;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] a){
        List<RocketLaunch> launches = Arrays.asList(
                new SatelliteRocketLaunch(),
                new MannedRocketLaunch(),
                new CargoRocketLaunch());

        for (RocketLaunch launch: launches ){
            launch.execute();
        }
    }
}
