package behavioral.visitor;

public class MaintenanceVisitor implements SpaceShipVisitor {

    @Override
    public void visit(ExplorationShip explorationShip) {
        System.out.println("Realizando manutenção na nave de exploração: " + explorationShip.getName());
    }

    @Override
    public void visit(CargoShip cargoShip) {
        System.out.println("Verificando capacidade de carga da nave: " + cargoShip.getCargoCapacity() + " toneladas.");
    }

    @Override
    public void visit(PassengerShip passengerShip) {
        System.out.println("Verificando sistemas de suporte de vida para " + passengerShip.getPassengerCount() + " passageiros.");
    }
}
