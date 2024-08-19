package structural.decorator;

class EscudoDeDefesa extends NaveDecorator{

    EscudoDeDefesa(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public String montar() {
        return super.montar() + " + Sistema de armas";
    }
}
