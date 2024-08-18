package creational.factorymethod;

public abstract class CapsuleFactory {

    protected abstract Capsule build();

    public Capsule manufacture() {
        Capsule capsule = build();
        System.out.println("Preparing the capsule for launch.");
        return capsule;
    }
}
