package structural.decorator;

class Main {

    public static void main(String[] args){
        // Criando uma nave básica
        NaveEspacial nave = new NaveBasica();

        // Adicionando módulos à nave
        nave = new SistemaDeArmas(nave);
        nave = new EscudoDeDefesa(nave);
        nave = new SistemaDePropulsao(nave);

        // Mostrando o resultado
        System.out.println(nave.montar());
    }
}
