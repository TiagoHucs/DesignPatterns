package structural.decorator;

class SistemaDePropulsao extends NaveDecorator {

    SistemaDePropulsao(INave nave) {
        super(nave);
    }

    @Override
    public void ativar() {
        super.ativar();
        System.out.println("Ativando Sistemas de Propulsão");
    }
}
