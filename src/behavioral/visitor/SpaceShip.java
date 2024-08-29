package behavioral.visitor;

interface SpaceShip {
    void accept(SpaceShipVisitor visitor);
}
