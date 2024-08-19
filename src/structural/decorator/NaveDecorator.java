package structural.decorator;

abstract class NaveDecorator implements NaveEspacial {
    protected NaveEspacial nave;

    NaveDecorator(NaveEspacial nave){
        this.nave = nave;
    }

    @Override
    public String montar() {
        return nave.montar();
    }

}
