package structural.proxy;

public class Main {
    public static void main(String[] a){
        IDados dados = new ProxyDados();



        dados.getNome();
        dados.getCodigo();
        dados.getNome();
        dados.getCodigo();
    }
}
