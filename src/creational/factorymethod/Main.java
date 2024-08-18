package creational.factorymethod;

public class Main {
    public static void main(String[] args){
        CapsulaDeCargaFactory capsulaDeCargaFactory = new CapsulaDeCargaFactory();
        Capsula capsula1 = capsulaDeCargaFactory.manufacture();
        capsula1.launch();

        CapsulaDeTripulacaoFactory capsulaDeTripulacaoFactory = new CapsulaDeTripulacaoFactory();
        Capsula capsula2 = capsulaDeTripulacaoFactory.manufacture();
        capsula2.launch();

    }
}
