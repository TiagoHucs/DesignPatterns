package structural.composite;

public class Main {

    public static void main(String[] args) {
        // Criando componentes individuais (folhas)
        ComponenteFoguete motorPrincipal = new Motor("Motor Principal");
        ComponenteFoguete motorAuxiliar = new Motor("Motor Auxiliar");
        ComponenteFoguete tanqueDeCombustivel = new TanqueDeCombustivel("Hidrogênio Líquido");

        // Criando um foguete composto (composite) e adicionando componentes a ele
        FogueteComposto foguete = new FogueteComposto("Foguete Interplanetário");
        foguete.addComponente(motorPrincipal);
        foguete.addComponente(motorAuxiliar);
        foguete.addComponente(tanqueDeCombustivel);

        // Exibindo detalhes do foguete e seus componentes
        foguete.exibirDetalhes();
    }
}
