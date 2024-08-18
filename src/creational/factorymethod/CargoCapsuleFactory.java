package creational.factorymethod;

public class CargoCapsuleFactory extends CapsuleFactory{
    @Override
    public Capsule build() {
        return new CargoCapsule();
    }
}
