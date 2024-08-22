package structural.flyweight;

public class Main {

    public static void main(String[] args) {
        normalTest();
        flyweightTest();
    }

    public static void normalTest(){
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // Criando 100000 foguetes sem Flyweight
        for (int i = 0; i < 100000; i++) {
            new Rocket("Falcon", "SpaceX", 5000 + i);
        }

        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsage = afterMemory - beforeMemory;
        System.out.println("Memória usada sem Flyweight: " + memoryUsage + " bytes");
    }

    public static void flyweightTest(){
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
