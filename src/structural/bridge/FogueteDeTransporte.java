package structural.bridge;

class FogueteDeTransporte extends Foguete{


    public FogueteDeTransporte(Propulsor propulsor) {
        super(propulsor);
    }

    @Override
    public void lancar() {
        System.out.println("Lançando foguete de transporte...");
        propulsor.acionar();
    }
}
