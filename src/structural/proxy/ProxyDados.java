package structural.proxy;

public class ProxyDados implements IDados{

    Dados dados;

    @Override
    public String getNome() {
        return getDados().getNome();
    }

    @Override
    public Integer getCodigo() {
        return getDados().getCodigo();
    }

    private Dados getDados(){
        if(dados == null){
            dados = new Dados();
        }
        return dados;
    }
}
