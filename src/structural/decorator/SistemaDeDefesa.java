package structural.decorator;

class SistemaDeDefesa extends NaveDecorator {

    SistemaDeDefesa(INave nave) {
        super(nave);
    }

    @Override
    public void ativar() {
        super.ativar();
        System.out.println("Ativando Sistemas de Defesa");
    }
}
