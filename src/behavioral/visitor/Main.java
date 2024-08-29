package behavioral.visitor;

class Main {
    public static void main(String[] args) {
        SpaceShip explorationShip = new ExplorationShip("Orion");
        SpaceShip cargoShip = new CargoShip(5000);
        SpaceShip passengerShip = new PassengerShip(300);

        SpaceShipVisitor maintenanceVisitor = new MaintenanceVisitor();
        SpaceShipVisitor statusCheckVisitor = new StatusCheckVisitor();

        System.out.println("Executando manutenção nas naves:");
        explorationShip.accept(maintenanceVisitor);
        cargoShip.accept(maintenanceVisitor);
        passengerShip.accept(maintenanceVisitor);

        System.out.println("\nVerificando status das naves:");
        explorationShip.accept(statusCheckVisitor);
        cargoShip.accept(statusCheckVisitor);
        passengerShip.accept(statusCheckVisitor);
    }

}
