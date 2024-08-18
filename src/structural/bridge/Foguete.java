package structural.bridge;

abstract class Foguete {
    protected Propulsor propulsor;

    public Foguete(Propulsor propulsor){
        this.propulsor = propulsor;
    }

    public abstract void lancar();
}
