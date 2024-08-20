package structural.decorator;

abstract class NaveDecorator implements INave {
    protected INave nave;

    NaveDecorator(INave nave){
        this.nave = nave;
    }

    @Override
    public void ativar() {
        nave.ativar();
    }

}
