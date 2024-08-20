package creational.builder;

class FogueteBuilder {

    private Foguete rocket;

    private FogueteBuilder() {
        this.rocket = new Foguete();
    }

    public static FogueteBuilder builder(){
        return new FogueteBuilder();
    }

    public FogueteBuilder tripulado(boolean trip){
        this.rocket.setTripulado(trip);
        return this;
    }

    public FogueteBuilder nome(String n){
        this.rocket.setNome(n);
        return this;
    }

    public Foguete build(){
        return this.rocket;
    }
}
