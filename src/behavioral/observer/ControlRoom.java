package behavioral.observer;

class ControlRoom implements Observer{
    private String name;

    public ControlRoom(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Sala de Monitoramento " + name + ": Alerta recebido - " + message);
    }
}
