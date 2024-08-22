package behavioral.chainofresponsability.system;

import java.util.logging.Logger;

class OrangeAlertHandler implements Handler {
    static final Logger logger = Logger.getLogger(OrangeAlertHandler.class.getName());
    Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Alert alert) {
        if (alert.getLevel() < 66) {
            logger.warning("ALERTA LARANJA! níveis em " + (100 - alert.getLevel()) + "%");
        } else if (nextHandler != null) {
            nextHandler.handle(alert);
        }
    }

}
