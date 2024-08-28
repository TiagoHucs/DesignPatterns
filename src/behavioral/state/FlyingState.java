package behavioral.state;

class FlyingState implements RocketState{

    @Override
    public void executeStage(Rocket rocket) {
        System.out.println("Foguete está pronto para manobra orbital.");
        rocket.setState(new OrbitState()); // Transição para o próximo estado
    }
}
