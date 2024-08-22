package behavioral.chainofresponsability.system;

interface Handler {
    void setNextHandler(Handler nextHandler);
    void handle(Alert alert);
}
