package structural.decorator;

class SistemaDePropulsao extends NaveDecorator {

    SistemaDePropulsao(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public String montar(){
        return super.montar() + " + Sistema de propulsao";
    }
}
