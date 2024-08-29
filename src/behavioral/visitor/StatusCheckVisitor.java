package behavioral.visitor;

public class StatusCheckVisitor implements SpaceShipVisitor {
    @Override
    public void visit(ExplorationShip explorationShip) {
        System.out.println("Verificando sistemas de exploração da nave: " + explorationShip.getName());
    }

    @Override
    public void visit(CargoShip cargoShip) {
        System.out.println("Status do compartimento de carga: " + cargoShip.getCargoCapacity() + " toneladas.");
    }

    @Override
    public void visit(PassengerShip passengerShip) {
        System.out.println("Verificando status dos passageiros: " + passengerShip.getPassengerCount() + " a bordo.");
    }
}
