package structural.decorator;

class SistemaDeArmas extends NaveDecorator{


    SistemaDeArmas(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public String montar() {
        return super.montar() + " + Escudo de defesa";
    }
}
