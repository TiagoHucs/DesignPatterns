package structural.flyweight;

public class MainFlyweight {

    public static void main(String[] args) {
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        RocketType falconType = new RocketType("Falcon", "SpaceX");

        // Criando 100000 foguetes com Flyweight
        for (int i = 0; i < 100000; i++) {
            new RocketWithFlyweight(5000 + i, falconType);
        }

        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsage = afterMemory - beforeMemory;
        System.out.println("Memória usada com Flyweight: " + memoryUsage + " bytes");
    }
}
