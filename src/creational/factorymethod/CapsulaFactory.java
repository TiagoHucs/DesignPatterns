package creational.factorymethod;

abstract class CapsulaFactory {

    protected abstract Capsula build();

    public Capsula manufacture() {
        Capsula capsula = build();
        System.out.println("Construindo " + capsula.getNome() + " para lançamento");
        return capsula;
    }
}
