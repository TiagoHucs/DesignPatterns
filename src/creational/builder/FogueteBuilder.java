package creational.builder;

/**
* Evita que a representação da classe Rocket fique poluida com varios contrutores
* Centraliza a personalização da construção aqui nesta classe
* */
public class FogueteBuilder {

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
