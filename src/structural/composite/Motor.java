package structural.composite;

public class Motor implements ComponenteFoguete{

    private String nome;

    public Motor(String nome){
        this.nome = nome;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Motor: " + this.nome);
    }
}
