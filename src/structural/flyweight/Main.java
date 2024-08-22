package structural.flyweight;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double normal = normalTest();
        double flyweight = flyweightTest();
        Double economiaPercentual = ((normal - flyweight) / normal) * 100;
        System.out.println("Você economizou " + economiaPercentual.shortValue() + "% do valor original.");
    }

    public static double normalTest(){
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // Criando 100000 foguetes sem Flyweight
        for (int i = 0; i < 100000; i++) {
            new Rocket("Falcon", "SpaceX", BigDecimal.TEN, 5000 + i);
        }

        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsage = afterMemory - beforeMemory;
        System.out.println("Memória usada sem Flyweight: " + convert(memoryUsage) + " Mb");
        return memoryUsage;
    }

    public static double flyweightTest(){
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        RocketType falconType = new RocketType("Falcon", "SpaceX", BigDecimal.TEN);

        // Criando 100000 foguetes com Flyweight
        for (int i = 0; i < 100000; i++) {
            new RocketWithFlyweight(5000 + i, falconType);
        }

        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsage = afterMemory - beforeMemory;
        System.out.println("Memória usada com Flyweight: " + convert(memoryUsage) + " Mb");
        return memoryUsage;
    }

    public static double convert(long value){
        return (value / 1024) ;
    }
}
