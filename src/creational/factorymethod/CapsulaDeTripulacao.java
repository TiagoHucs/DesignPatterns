package creational.factorymethod;

public class CapsulaDeTripulacao implements Capsula {
    private static final String NOME = "Capsula de tripulação";

    @Override
    public void launch() {
        System.out.println(NOME + " lançada.");
    }

    @Override
    public String getStatus() {
        return NOME + " está ok.";
    }

    @Override
    public String getNome() {
        return NOME;
    }
}
