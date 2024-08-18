package structural.composite;

public class TanqueDeCombustivel implements ComponenteFoguete{

    private final String tipoCombustivel;

    public TanqueDeCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tanque de combustivel: " + this.tipoCombustivel);
    }
}
