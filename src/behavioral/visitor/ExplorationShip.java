package behavioral.visitor;

class ExplorationShip implements SpaceShip{
    private String name;

    ExplorationShip(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    @Override
    public void accept(SpaceShipVisitor visitor) {
        visitor.visit(this);
    }
}
