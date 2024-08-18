package creational.factorymethod;

class CapsulaDeCarga implements Capsula {

    private static final String NOME = "Capsula de carga";

    @Override
    public void launch() {
        System.out.println(getStatus());
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
