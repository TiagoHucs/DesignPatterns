package structural.decorator;

class SistemaDeArmas extends NaveDecorator {

    SistemaDeArmas(INave nave) {
        super(nave);
    }

    @Override
    public void ativar() {
        super.ativar();
        System.out.println("Ativando Sistemas de Armas");
    }

}
