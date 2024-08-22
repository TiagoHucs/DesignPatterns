package behavioral.chainofresponsability.system;

import java.util.Random;

public class SistemaPrincipal {

    private YellowAlertHandler yellowAlertHandler = new YellowAlertHandler();
    private OrangeAlertHandler orangeAlertHandler = new OrangeAlertHandler();
    private RedAlertHandler redAlertHandler = new RedAlertHandler();

    public SistemaPrincipal() {
        yellowAlertHandler.setNextHandler(orangeAlertHandler);
        orangeAlertHandler.setNextHandler(redAlertHandler);
    }

    public void verificarFalhas(){
        int falhas = new Random().nextInt(101);
        System.out.println(falhas + " falhas detectadas.");
        yellowAlertHandler.handle(new Alert(falhas));
    }
}
