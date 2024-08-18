package structural.bridge;

public class Main {

    public static void main(String[] args) {
        // Usando um propulsor químico com um foguete de carga
        Propulsor propulsorQuimico = new PropulsorQuimico();
        Foguete fogueteDeCarga = new FogueteDeCarga(propulsorQuimico);
        fogueteDeCarga.lancar();

        // Usando um propulsor de plasma com um foguete de transporte
        Propulsor propulsorDePlasma = new PropulsorDePlasma();
        Foguete fogueteDeTransporte = new FogueteDeTransporte(propulsorDePlasma);
        fogueteDeTransporte.lancar();
    }
}
