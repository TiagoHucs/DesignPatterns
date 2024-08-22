package structural.proxy;

public class Dados implements IDados{

    private String nome;
    private int codigo;

    public Dados(){
        System.out.println("Carrega dados");
        nome = "Prometheus";
        codigo = 01234555;
    }


    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Integer getCodigo() {
        return this.codigo;
    }
}
