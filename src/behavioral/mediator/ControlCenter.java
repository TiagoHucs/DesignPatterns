package behavioral.mediator;

// Interface Mediator
interface ControlCenter {
    void sendMessage(String message, Satellite satellite);
    void register(Satellite satellite);
}
