package behavioral.templatemethod;

class MannedRocketLaunch extends RocketLaunch{
    @Override
    void verifySystems() {
        System.out.println("Verify command module systems");
        System.out.println("Check astronauts");
    }

    @Override
    Fuel loadFuel() {
        return new LiquidFuel();
    }
    @Override
    String strategyName() {
        return "Manned Rocket Launch";
    }

}
