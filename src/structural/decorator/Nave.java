package structural.decorator;

class Nave implements INave {
    @Override
    public void ativar() {
        System.out.println("Ativando Nave básica");
    }
}
