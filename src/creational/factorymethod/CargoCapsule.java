package creational.factorymethod;

public class CargoCapsule implements Capsule {
    @Override
    public void launch() {
        System.out.println("Cargo Capsule is launch.");
    }

    @Override
    public String getStatus() {
        return "Cargo Capsule is ok.";
    }
}
