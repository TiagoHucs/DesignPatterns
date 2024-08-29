package behavioral.templatemethod;

class CargoRocketLaunch extends RocketLaunch {

    @Override
    void verifySystems() {
        System.out.println("Verify cargo fair");
    }

    @Override
    Fuel loadFuel() {
        return new SolidFuel();
    }

    @Override
    String strategyName() {
        return "Cargo Rocket Launch";
    }
}
