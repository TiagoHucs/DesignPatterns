package behavioral.templatemethod;

class SatelliteRocketLaunch extends RocketLaunch{
    @Override
    void verifySystems() {
        System.out.println("Verify satellite responds");
    }

    @Override
    Fuel loadFuel() {
        return new SolidFuel();
    }

    @Override
    String strategyName() {
        return "Satellite Rocket Launch";
    }
}
