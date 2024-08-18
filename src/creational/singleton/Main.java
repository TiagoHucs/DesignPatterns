package creational.singleton;

public class Main {

    public static void main(String[] args){

        System.out.println("Iniciando controle da missão");

        ControleDaMissao controleDaMissao = ControleDaMissao.getInstance();
        controleDaMissao.adicionaDado("aurora");
        controleDaMissao.adicionaDado("fevereiro");

        ControleDaMissao controleDaMissao2 = ControleDaMissao.getInstance();
        for (String dado: controleDaMissao2.getDados()){
            System.out.println(dado);
        }
    }
}
