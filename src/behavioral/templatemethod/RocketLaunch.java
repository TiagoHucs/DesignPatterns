package behavioral.templatemethod;

abstract class RocketLaunch {

    void execute(){
        System.out.println("########################");
        prepareFueal();
        verifySystems();
        count();
        launch();
        System.out.println();
    }

    void prepareFueal() {
        Fuel fuel = loadFuel();
        System.out.println("Rocket filled with " + fuel.getName() + " fuel");
    }

    abstract void verifySystems();

    private void count() {
        System.out.println("3, 2, 1...");
    }

    private void launch() {
        System.out.println(this.strategyName() + "ed with success!");
    }

    abstract Fuel loadFuel();

    abstract String strategyName();
}
