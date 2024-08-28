package behavioral.state;

class OrbitState implements RocketState{
    @Override
    public void executeStage(Rocket rocket) {
        System.out.println("Foguete agora está em órbita ao redor da Terra.");
        // Último estado, não há transição
    }
}
