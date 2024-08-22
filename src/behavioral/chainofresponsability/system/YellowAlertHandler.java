package behavioral.chainofresponsability.system;

import java.util.logging.Logger;

class YellowAlertHandler implements Handler {
    static final Logger logger = Logger.getLogger(YellowAlertHandler.class.getName());
    Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Alert alert) {
        if (alert.getLevel() < 33) {
            logger.info("ALERTA AMARELO! níveis em " + (100 - alert.getLevel()) + "%");
        } else if (nextHandler != null) {
            nextHandler.handle(alert);
        }
    }

}
