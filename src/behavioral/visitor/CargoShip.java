package behavioral.visitor;

class CargoShip implements SpaceShip{
    private int cargoCapacity;

    public CargoShip(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void accept(SpaceShipVisitor visitor) {
        visitor.visit(this);
    }
}
