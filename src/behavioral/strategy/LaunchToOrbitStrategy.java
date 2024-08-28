package behavioral.strategy;

public class LaunchToOrbitStrategy implements ManeuverStrategy {
    @Override
    public void execute() {
        System.out.println("Accelerate 1minute");
        System.out.println("Turn 45degress east");
        System.out.println("Accelerate 2minute");
        System.out.println("Turn 0degress east");
        System.out.println("Accelerate 3minute");
    }
}
