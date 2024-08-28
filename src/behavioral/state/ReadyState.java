package behavioral.state;

class ReadyState implements RocketState{

    @Override
    public void executeStage(Rocket rocket) {
        System.out.println("Foguete está pronto para o lançamento.");
        rocket.setState(new FlyingState()); // Transição para o próximo estado
    }
}
