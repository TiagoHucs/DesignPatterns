package behavioral.chainofresponsability.system;

import java.util.logging.Logger;

class RedAlertHandler implements Handler {
    static final Logger logger = Logger.getLogger(RedAlertHandler.class.getName());
    Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Alert alert) {
        logger.severe("ALERTA VERMELHO! níveis em " + (100 - alert.getLevel())  + "%");
    }

}
