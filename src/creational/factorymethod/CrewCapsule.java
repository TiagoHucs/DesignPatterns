package creational.factorymethod;

public class CrewCapsule implements Capsule {
    @Override
    public void launch() {
        System.out.println("Crew Capsule is launch.");
    }

    @Override
    public String getStatus() {
        return "Crew Capsule is ok.";
    }
}
