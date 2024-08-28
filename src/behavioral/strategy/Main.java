package behavioral.strategy;

public class Main {
    public static void main(String[] a){
        CommandModule crewDragon = new CommandModule();

        crewDragon.executeManeuve(new LaunchToOrbitStrategy());
        System.out.println("");
        crewDragon.executeManeuve(new DeorbitStrategy());
    }
}
