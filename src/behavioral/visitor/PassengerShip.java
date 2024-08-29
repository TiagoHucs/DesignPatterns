package behavioral.visitor;

class PassengerShip implements SpaceShip {
    private int passengerCount;

    public PassengerShip(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public void accept(SpaceShipVisitor visitor) {
        visitor.visit(this);
    }

}