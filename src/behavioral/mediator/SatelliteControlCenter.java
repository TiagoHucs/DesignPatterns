package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SatelliteControlCenter implements ControlCenter{
    private List<Satellite> satellites;

    SatelliteControlCenter() {
        this.satellites = new ArrayList<>();
    }


    @Override
    public void sendMessage(String message, Satellite sender) {
        for (Satellite satellite : satellites) {
            // Evita enviar a mensagem de volta ao remetente, mas manda aos demais
            if (satellite != sender) {
                satellite.receiveMessage(message);
            }
        }
    }

    @Override
    public void register(Satellite satellite) {
        this.satellites.add(satellite);
    }
}
