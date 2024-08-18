package creational.factorymethod;

public class CrewCapsuleFactory extends CapsuleFactory{
    @Override
    public Capsule build() {
        return new CrewCapsule();
    }
}
