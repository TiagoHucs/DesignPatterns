package structural.decorator;

class Main {

    public static void main(String[] args){
        // Criando uma nave básica
        INave nave = new Nave();

        // Adicionando módulos à nave
        nave = new SistemaDeArmas(nave);
        nave = new SistemaDeDefesa(nave);
        nave = new SistemaDePropulsao(nave);
        nave = new NaveDecorator(nave) {
            @Override
            public void ativar() {
                super.ativar();
                System.out.println("Ativando Sistemas Utilitarios personalizados");
            }
        };

        // Mostrando o resultado
        nave.ativar();
    }
}
