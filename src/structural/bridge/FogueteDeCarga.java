package structural.bridge;

class FogueteDeCarga extends Foguete{


    public FogueteDeCarga(Propulsor propulsor) {
        super(propulsor);
    }

    @Override
    public void lancar() {
        System.out.println("Lançando foguete de carga...");
        propulsor.acionar();
    }
}
